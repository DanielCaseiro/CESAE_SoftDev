@extends('layouts.fe_master')

@section('content')

    @if (session('message'))
        <div class="alert alert-success">
            {{session('message')}}
        </div>
    @endif

<!-- Main -->

<main>

    <br>
    <h1>Tabela de Livros</h1>
    <br>

    <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Título</th>
      <th scope="col">Preço estimado</th>
      <th scope="col">Preço pago</th>
      <th scope="col">Diferença</th>
      <th scope="col">Utilizador</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    @foreach ($booksDB as $livro)

     <tr>
      <th scope="row">{{ $livro->id }}</th>
      <td>{{ $livro->name }}</td>
      <td>{{ $livro->estimated_price }}</td>
      <td>{{ $livro->paid_price }}</td>
      <td>{{ $livro->paid_price - $livro->estimated_price }}</td>
      <td>{{ $livro->user_id }}</td>
      <td><a href="{{ route('view-book_route', $livro->id) }}" class="btn btn-info me-2">Ver</a><a href="{{ route('delete-book_route', $livro->id) }}" class="btn btn-danger">Apagar</a></td>

    </tr>

    @endforeach
  </tbody>
</table>

<br>
<br>
<br>



</main>

@endsection
