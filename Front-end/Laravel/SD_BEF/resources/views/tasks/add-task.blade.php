@extends('layouts.fe_master')

@section('content')

    <br>
    <br>
    <h1>Aqui podes adicionar tarefas</h1>

    <br>


    <form method="POST" action="{{ route('store-task_route') }}">
        @csrf
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Nome</label>
    <input type="text" class="form-control" name="name" id="name" aria-describedby="emailHelp">
       @error('name')
                nome inválido
        @enderror
    </div>
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Descrição</label>
    <input type="text" class="form-control" name="description" id="description" aria-describedby="emailHelp">
    </div>
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Responsável</label>
    <select name="user_id" id="">

        @foreach ($usersDB as $user)
            <option value="{{$user->id}}">{{$user->name}}</option>
        @endforeach

    </select>
        @error('user_id')
                user_id inválido
        @enderror


    <button type="submit" class="btn btn-primary">Submit</button>
    </form>


    <br>


@endsection


