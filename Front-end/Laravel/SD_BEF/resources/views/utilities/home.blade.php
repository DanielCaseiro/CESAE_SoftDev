
@extends('layouts.fe_master')

@section('content')

<!-- Main -->

<main>

    <div>

    <br>
    <h1>Sou a tua HomePage</h1>
    <br>

    @auth
        <h5>Olá {{ Auth::user()->name }} </h5>
        <br>
        <h5>O user logado é {{ Auth::user()->name }} e o email utilizado é {{ Auth::user()->email }}</h5>
    @endauth


    <br>

    <h5>{{ $cesaeInfo['name'] }} | {{ $cesaeInfo['address'] }} | {{ $cesaeInfo['email'] }}</h5>

    <br>

    <img src="{{ asset('images/abstract_image_5.jpg') }}" alt="Cesae Digital">

    <br>
    <br>
    <ul>
        <li> <h3> <a href="{{ route('hello_route') }}">Hello</a> </h3> </li>

        @auth
            @if (Auth::user()->email == 'admin@gmail.com')

                <li> <h3> <a href="{{ route('show-users_route') }}">Mostrar Utilizadores</a> </h3> </li>

            @endif

        @endauth

        <li> <h3> <a href="{{ route('add-users_route') }}">Adicionar Utilizadores</a> </h3> </li>
        @auth
            <li> <h3> <a href="{{ route('show-tasks_route') }}">Mostrar Tarefas</a> </h3> </li>
            <li> <h3> <a href="{{ route('add-tasks_route') }}">Adicionar Tarefas</a> </h3> </li>
        @endauth
        <li> <h3> <a href="{{ route('show-books_route') }}">Mostrar livros</a> </h3> </li>
        <li> <h3> <a href="{{ route('add-book_route') }}">Adicionar livros</a> </h3> </li>
    </ul>

    <br>
    <br>

    </div>

</main>

@endsection


