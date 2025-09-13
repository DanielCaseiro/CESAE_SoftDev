<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\BookController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\TasksController;
use App\Http\Controllers\UtilityController;
use App\Http\Controllers\DashboardController;

/*Route::get('/', [UtilityController::class,'welcome']) -> name('welcome_route');*/

Route::get('/', [UtilityController::class,'index']) -> name('home_route');


Route::get('/hello', [UtilityController::class,'hello']) -> name('hello_route');

Route::get('/curso/{nome}', function ($nome) {
    // Pass the $nome variable to the view
    return view('curso', ['nome' => $nome]);
});


Route::get('/modulos/{nome}', function ($nome) {
    return '<h1>Este é o módulo de: ' .$nome. '</h1>';
});

Route::get('/test-queries', [UserController:: class,'testSqlQueries']) -> name('test-queries_route');


// Rota Home

Route::get('/home', [UtilityController::class,'index']) -> name('home_route');


// Rotas Users

Route::get('/add-users', [UserController::class, 'addUsers']) -> name('add-users_route');

Route::post('/store-user', [UserController::class, 'storeUser']) -> name('users.store');

Route::put('/update-user', [UserController::class, 'updateUser']) -> name('update-user_route');

Route::get('/show-users', [UserController::class, 'showUsers']) -> name('show-users_route');

Route::get('/view-user/{id}', [UserController::class, 'viewUser']) -> name('view-user_route');

Route::get('/delete-user/{id}', [UserController::class, 'deleteUser']) -> name('delete-user_route');

Route::get('/export-users', [UserController::class, 'exportUsers'])->name('users.export');


// Rotas tasks

Route::get('/tasks', [TasksController::class,'tasks']) -> name('show-tasks_route')->middleware('auth');

Route::get('/add-task', [TasksController::class,'addTasks']) -> name('add-tasks_route');

Route::post('/store-task', [TasksController::class, 'storeTask']) -> name('store-task_route');

Route::put('/update-task', [TasksController::class, 'updateTask']) -> name('update-task_route');

Route::get('/view-task/{id}', [TasksController::class,'viewTask']) -> name('view-task_route');

Route::get('/delete-task/{id}', [TasksController::class,'deleteTask']) -> name('delete-task_route');


// Rotas Books

Route::get('/show-books', [BookController::class, 'showBooks']) -> name('show-books_route');

Route::get('/add-book', [BookController::class,'addBook']) -> name('add-book_route');

Route::post('/store-book', [BookController::class, 'storeBook']) -> name('store-book_route');

Route::put('/update-book', [BookController::class, 'updateBook']) -> name('update-book_route');

Route::get('/view-book/{id}', [BookController::class,'viewBook']) -> name('view-book_route');

Route::get('/delete-book/{id}', [BookController::class,'deleteBook']) -> name('delete-book_route');


// Rotas Dashboard

Route::get('/dashboardHome', [DashboardController::class,'dashboardHome']) -> name('dashboard.home')->middleware('auth');


Route:: fallback(function(){
    return view('utilities.fallback');
});
