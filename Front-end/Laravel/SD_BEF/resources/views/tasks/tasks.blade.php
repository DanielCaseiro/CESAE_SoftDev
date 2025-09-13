@extends('layouts.fe_master')

@section('content')

    @if (session('message'))
        <div class="alert alert-success">
            {{session('message')}}
        </div>
    @endif

<!-- Main -->

<main>

    <div>
    <br>
    <h1>Lista de Tarefas</h1>
    <br>

        <ul>
        <br>

        @foreach ($tarefas as $task)
            <li>{{ $task['name'] }} tem como tarefa {{ $task['task'] }}</li>
        @endforeach

    </ul>

    <hr>
    <br>
    <br>
    <br>

    <h1>Lista de tarefas vindas da Base de Dados</h1>
    <br>

    <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Tarefa</th>
      <th scope="col">Utilizador_Responsável</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    @foreach ($tasksDB as $task)

     <tr>
      <th scope="row">{{ $task->id }}</th>
      <td>{{ $task->name }}</td>
      <td>{{ $task->userName }}</td>
      <td><a href="{{ route('view-task_route', $task->id) }}" class="btn btn-info me-2">Ver</a><a href="{{ route('delete-task_route', $task->id) }}" class="btn btn-danger">Apagar</a></td>

    </tr>

    @endforeach
  </tbody>
</table>

<br>
<br>
<br>



</main>

@endsection
