@extends('layouts.fe_master')

@section('content')

<br>
<br>
<h3>Task_id: {{ $myTask->id }}</h3>
<br>
<br>
<h6>Task_name: {{ $myTask->name }}</h6>
<h6>Task_description: {{ $myTask->description }}</h6>
<h6>Task_due_at: {{ $myTask->due_at }}</h6>
<h6>Task_status: {{ $myTask->status }}</h6>
<h6>Task_user: {{ $myTask->userName }}</h6>

<br>
<br>

<h3>Editar Task {{ $myTask->name }}</h3>

    <form method="POST" action="{{ route('update-task_route') }}">
        @csrf

        @method("PUT")
        <input type="hidden" name="id" value="{{ $myTask->id }}">

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Nome</label>
            <input required name="name" type="text" class="form-control" id="name" value="{{ $myTask->name }}">
            @error('name')
                nome inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputDescription" class="form-label">Descrição</label>
            <input name="description" type="text" class="form-control" id="exampleInputDescription" value="{{ $myTask->description }}">
        </div>
        <div class="mb-3">
            <label for="exampleInputDue_at" class="form-label">Prazo</label>
            <input name="due_at" type="text" class="form-control" id="exampleInputDue_at" value="{{ $myTask->due_at }}">
        </div>
        <div class="mb-3">
            <label for="exampleInputStatus" class="form-label">Status</label>
            <input name="status" type="text" class="form-control" id="exampleInputStatus" value="{{ $myTask->status }}">
        </div>
        <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Responsável</label>
        <select name="user_id" id="">

            @foreach ($usersDB as $user)
                <option value="{{$user->id}}"  @if ($myTask->user_id == $user->id) selected @endif>{{$user->name}}</option>
            @endforeach

        </select>
            @error('user_id')
                    user_id inválido
            @enderror

        </div>

        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>

    <br>
    <br>
    <br>


@endsection
