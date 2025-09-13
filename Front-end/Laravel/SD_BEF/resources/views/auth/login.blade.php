@extends('layouts.fe_master')

@section('content')

    <br>
    <br>
    <h1>Login</h1>

    <br>

    <form method="POST" action="{{ route('login') }}">
        @csrf
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

    <button type="submit" class="btn btn-primary">Sign in</button>
    </form>
    <a href="{{ route('password.request') }}">esqueceu-se da pass? Clique aqui</a>

    <br>


@endsection


