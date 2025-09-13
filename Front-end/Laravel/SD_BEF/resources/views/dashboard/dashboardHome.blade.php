
@extends('layouts.fe_master')

@section('content')

<!-- Main -->

<main>

    <br>

    @auth
        @if (Auth::user()->user_type == '1')

            <div class="alert alert-warning alert-dismissible fade show" role="alert">
                <h6>Conta de administrador</h6>
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>

        @endif

    @endauth

    <br>
    <h1>Dashboard Home</h1>
    <br>
    <br>
    @auth
        <h5>Olá {{ Auth::user()->name }} </h5>
    @endauth

    <br>
    <br>




</main>

@endsection


