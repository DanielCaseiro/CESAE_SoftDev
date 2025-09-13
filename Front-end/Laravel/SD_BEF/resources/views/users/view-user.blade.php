@extends('layouts.fe_master')

@section('content')

<br>
<br>
<h1>user {{ $myUser->name }}</h1>
<br>
<br>
<h6>Nome: {{ $myUser->name }}</h6>
<h6>Morada: {{ $myUser->address }}</h6>
<h6>Nif: {{ $myUser->nif }}</h6>
<h6>Email: {{ $myUser->email }}</h6>

<br>
<br>

<h3>Editar User {{ $myUser->name }}</h3>

    <form method="POST" action="{{ route('update-user_route') }}" enctype="multipart/form-data">
        @csrf

        @method("PUT")
        <input type="hidden" name="id" value="{{ $myUser->id }}">

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Nome</label>
            <input required name="name" type="text" class="form-control" id="name" value="{{ $myUser->name }}">
            @error('name')
                nome inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input disabled name="email" type="email" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp" value="{{ $myUser->email }}">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            @error('email')
                email inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputaddress" class="form-label">Morada</label>
            <input required name="address" type="text" class="form-control" id="exampleInputAddress" value="{{ $myUser->address }}">
        </div>
        <div class="mb-3">
            <label for="exampleInputNif" class="form-label">Nif</label>
            <input required name="nif" type="text"  @if ($myUser->nif != 'ainda nao tinhamos nif') readonly @endif class="form-control" id="exampleInputNif" value="{{ $myUser->nif }}">
        </div>
        <div>
            <input type="file" name="photo" accept="image/*">
        </div>

        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>

    <br>
    <br>
    <br>

@endsection
