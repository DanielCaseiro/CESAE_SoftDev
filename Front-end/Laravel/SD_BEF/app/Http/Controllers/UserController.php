<?php

namespace App\Http\Controllers;

use App\Models\User;
use App\Exports\UsersExport;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;
use Maatwebsite\Excel\Facades\Excel;
use Illuminate\Support\Facades\Storage;

class UserController extends Controller
{

    // ---------- Funções para carregar views ----------

    public function addUsers() {
        return view('users.add-users');
    }


    public function showUsers() {

        $usersArray = $this -> getUsersArray();

        $contacts = $this -> getContacts();


        $search = request()->query('search') ? request()->query('search') : null;

        $usersDB = $this -> getUsersFromDB($search);


        $courseResp = DB::table('users')
                    ->where('id', 5)
                    ->first();



        return view('users.show-users', compact('usersArray', 'contacts', 'usersDB', 'courseResp'));
    }


    public function viewUser($id) {

        $myUser = User:: where('id',$id) -> first();


        return view('users.view-user', compact('myUser'));
    }

    public function deleteUser($id) {

        DB::table('tasks')->where('user_id',$id)->delete(); // se tivesse cascade no SQL, não precisaria disso aqui
        DB::table('users')->where('id',$id)->delete();


        return back();
    }


    // ---------- Funções para buscars dados ----------

    private function getUsersArray(){
        // Vai a base de dados e busca o user
        $usersArray = ['User1', 'User2', 'User3', 'User4', 'User5'];
        return $usersArray;
    }

    private function getContacts() {

        $contacts = [
            ['id' => 1, 'name' => 'Sara', 'phone' => '123456789'],
            ['id' => 2, 'name' => 'Bruno', 'phone' => '123456789'],
            ['id' => 3, 'name' => 'Marcia', 'phone' => '123456789']
        ];

        return $contacts;

    }


    private function getUsersFromDB($search){

     $query = DB::table('users');

     if($search){
        $query->where('name', 'LIKE', "%{$search}%")
              ->orWhere('email', $search);
     }

     $usersDB = $query->get();


     return $usersDB;
    }


    public function testSqlQueries(){

        /*
        DB::table('users')->insert(
        [
            'name'=> 'Lais',
            'email' => 'Lais@gmail.com',
            'password' => 'Lais1234'
        ]);
        */

        /*
        DB::table('users')
        ->where('id',3)
        ->update([
            'name' => 'Rita',
            'address' => 'Rua da Rita',
            'updated_at' => now()
        ]);
        */

        /*
        DB::table('users')
        ->updateOrInsert(
        [
            'email' => 'daniel@gmail.com',
        ],
        [
            'address' => 'Rua do Daniel',
            'updated_at' => now()
        ]);
        */

        /*
        DB::table('users')
        ->where('id',4)
        ->delete();
        */

        return response()->json('query ok!');
    }


     // ---------- Funções para enviar dados ----------


     public function storeUser(Request $request){

        $request->validate([
        'name' => 'string|max:50|required',
        'email' => 'required|unique:users|email'
        ]);

        User::insert([
        'name' => $request->name,
        'email' => $request->email,
        'password' => Hash::make($request->password),
        ]);

        return redirect()->route('show-users_route')->with('message', 'Utilizador adicinado com sucesso!');

    }

    public function updateUser(Request $request){

        $request->validate([
            'name' => 'required',
            'photo'=> 'image'
        ]);

        $photoPath = null;

        if($request->hasFile('photo')){
            $photoPath = Storage::putFile('uploadedImages', $request->photo);
        }

        User::where('id', $request->id)
        ->update([
            'name' => $request->name,
            'nif'=> $request->nif,
            'address'=> $request->address,
            'photo'=> $photoPath
        ]);

        return redirect()->route('show-users_route')->with('message', 'Utilizador actualizado com sucesso!');

    }

    public function exportUsers()
    {

        return Excel::download(new UsersExport, 'users.xlsx');

    }



}
