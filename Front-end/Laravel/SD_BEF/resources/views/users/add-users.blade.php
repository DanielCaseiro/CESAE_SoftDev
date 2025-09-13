@extends('layouts.fe_master')

@section('content')

    <h1>Aqui podes adicionar utilizadores</h1>

    <br>

    <form method="POST" action="{{ route('users.store') }}">
        @csrf
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Nome</label>
    <input type="text" class="form-control" name="name" id="name" aria-describedby="emailHelp">
       @error('name')
                nome inválido
        @enderror
    </div>
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
       @error('email')
                email inválido
        @enderror
    </div>
    <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
    </form>

    <br>


@endsection


