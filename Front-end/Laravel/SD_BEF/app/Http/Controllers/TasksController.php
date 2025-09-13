<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TasksController extends Controller
{

    // ---------- Funções para carregar views ----------

    public function tasks() {

            $tarefas = $this -> getTarefas();

            $tasksDB = $this -> getTasksFromDB();

        return view('tasks.tasks', compact('tarefas', 'tasksDB'));
    }

        public function all() {

            $tasksDB = $this -> getTasksFromDB();

        return view('tasks.tasks', compact('tasksDB'));
    }

    public function viewTask($id) {

        $usersDB = $this -> getUsersFromDB();

        $myTask = Task:: join('users', 'tasks.user_id', '=', 'users.id')
        ->select('tasks.*', 'users.name as userName')
        ->where('tasks.id',$id)
        ->first();


        return view('tasks.view-task', compact('myTask', 'usersDB'));
    }

    public function addTasks() {

        $usersDB = $this -> getUsersFromDB();

        return view('tasks.add-task', compact('usersDB'));
    }




    // ---------- Funções para buscars dados ----------

    private function getTarefas(){
        // Vai a base de dados e busca os dados
        $tarefas = [
            ['name' => 'Rita', 'task' => 'estudar Laravel'],
            ['name' => 'Bruno', 'task' => 'estudar SQL'],
        ];

        return $tarefas;
    }

    private function getTasksFromDB(){

     $tasksDB = Task:: join('users', 'tasks.user_id', '=', 'users.id')
    ->select('tasks.*', 'users.name as userName')
    ->orderBy('tasks.id', 'asc')
    ->get();

     return $tasksDB;
    }

    private function getUsersFromDB(){

     $usersDB = DB::table('users')-> get();
     //dd($usersDB);

     return $usersDB;
    }




    // ---------- Funções para enviar dados à base de dados ----------

   public function storeTask(Request $request){

        $request->validate([
        'name' => 'string|max:50|required',
        'user_id' => 'required|exists:users,id'
        ]);

        Task::insert([
        'name' => $request->name,
        'description' => $request->description,
        'user_id' => $request->user_id,
        ]);

        return redirect()->route('show-tasks_route')->with('message', 'Tarefa adicinada com sucesso!');

    }

    public function updateTask(Request $request){

        $request->validate([
        'name' => 'required',
        'user_id' => 'required'
        ]);

        Task::where('id', $request->id)-> update([
        'name' => $request->name,
        'description' => $request->description,
        'due_at' => $request->due_at,
        'status' => $request->status,
        'user_id' => $request->user_id,
        ]);

        return redirect()->route('show-tasks_route')->with('message', 'Tarefa actualizada com sucesso!');

    }

        public function deleteTask($id) {

        DB::table('tasks')->where('id',$id)->delete();


        return back();
    }




}
