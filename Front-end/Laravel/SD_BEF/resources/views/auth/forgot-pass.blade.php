@extends('layouts.fe_master')

@section('content')

    <br>
    <br>
    <h1>Informe o seu email para recuperar sua password</h1>

    <br>

    <form method="POST" action="{{ route('password.email') }}">
        @csrf
    <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp">
       @error('email')
                email inválido
        @enderror
    </div>

    <button type="submit" class="btn btn-primary">Recuperar</button>
    </form>

    <br>


@endsection


