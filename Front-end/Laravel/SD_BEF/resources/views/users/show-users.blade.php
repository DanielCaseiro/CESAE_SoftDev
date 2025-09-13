@extends('layouts.fe_master')

@section('content')

    @if (session('message'))
        <div class="alert alert-success">
            {{session('message')}}
        </div>
    @endif

    <h1>Lista de utilizadores</h1>

    <ul>
        <br>

        @foreach ($usersArray as $user)
            <li>{{ $user }}</li>
        @endforeach

    </ul>

    <hr>
    <br>
    <br>

    <h1>Lista de utilizadores com contactos</h1>
        <ul>
        <br>

        @foreach ($contacts as $contact)
            <li>{{ $contact['id'] }} | {{ $contact['name'] }} | {{ $contact['phone'] }}</li>
        @endforeach

    </ul>

    <hr>
    <br>
    <br>

    <h1>Lista de utilizadores vindos da Base de Dados</h1>
    <br>

    <form action="">
        <input type="text" placeholder="Insira o que quer pesquisar" name="search" value="{{request()->query('search')}}"> </input>
        <button type="submit" class="btn btn-info">Pesquisar</button>
    </form>

    <br>
    <h6>Responsável</h6>
    <ul>
        <li>Nome: {{ $courseResp ? $courseResp->name : 'ainda não atribuído' }}</li>
        <li>Email: {{ $courseResp ? $courseResp->email : 'geral@cesae.pt' }}</li>
    </ul>

    <br>

    <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Foto</th>
      <th scope="col">Nome</th>
      <th scope="col">Email</th>
      <th scope="col">NIF</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    @foreach ($usersDB as $user)

     <tr>
      <th scope="row">{{ $user->id }}</th>
      <td><img width="40px"
        src="{{ $user->photo? asset('storage/'. $user->photo) : asset('images/nophoto.jpg') }}"
        alt=""></td>
      <td>{{ $user->name }}</td>
      <td>{{ $user->email }}</td>
      <td>{{ $user->nif }}</td>
      <td><a href="{{ route('view-user_route', $user->id) }}" class="btn btn-info me-2">Ver</a><a href="{{ route('delete-user_route', $user->id) }}" class="btn btn-danger">Apagar</a></td>

    </tr>

    @endforeach
  </tbody>
</table>

<br>
<br>
<br>



@endsection
