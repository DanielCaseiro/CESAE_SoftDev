<?php

namespace App\Http\Controllers;

use App\Models\Book;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class BookController extends Controller
{
    // ---------- Funções para carregar views ----------

    public function showBooks() {

            $booksDB = $this -> getBooksFromDB();

        return view('books.show-books', compact('booksDB'));
    }

     public function viewBook($id) {

        $usersDB = $this -> getUsersFromDB();

        $myBook = Book:: join('users', 'books.user_id', '=', 'users.id')
        ->select('books.*', 'users.name as userName')
        ->where('books.id',$id)
        ->first();


        return view('books.view-book', compact('myBook', 'usersDB'));
    }

    public function addBook() {

        $usersDB = $this -> getUsersFromDB();

        return view('books.add-book', compact('usersDB'));
    }



    // ---------- Funções para buscars dados ----------

    private function getBooksFromDB(){

     $booksDB = Book:: join('users', 'books.user_id', '=', 'users.id')
    ->select('books.*', 'users.name as userName')
    ->orderBy('books.id', 'asc')
    ->get();

     return $booksDB;
    }

    private function getUsersFromDB(){

     $usersDB = DB::table('users')-> get();

     return $usersDB;
    }


    // ---------- Funções para enviar dados à base de dados ----------

    public function storeBook(Request $request){

        $request->validate([
        'name' => 'string|max:250|required',
        'estimated_price' => 'required|numeric|min:0',
        'paid_price' => 'required|numeric|min:0',
        'user_id' => 'required|exists:users,id',
        ]);

        Book::insert([
        'name' => $request->name,
        'estimated_price' => $request->estimated_price,
        'paid_price' => $request->paid_price,
        'user_id' => $request->user_id,
        ]);

        return redirect()->route('show-books_route')->with('message', 'Livro adicinado com sucesso!');

    }

    public function updateBook(Request $request){

        $request->validate([
        'name' => 'required',
        'estimated_price' => 'required|numeric|min:0',
        'paid_price' => 'required|numeric|min:0',
        'user_id' => 'required'
        ]);

        Book::where('id', $request->id)-> update([
        'name' => $request->name,
        'estimated_price' => $request->estimated_price,
        'paid_price' => $request->paid_price,
        'user_id' => $request->user_id,
        ]);

        return redirect()->route('show-books_route')->with('message', 'Livro actualizado com sucesso!');

    }

        public function deleteBook($id) {

        DB::table('books')->where('id',$id)->delete();


        return back();
    }








}

