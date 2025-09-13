@extends('layouts.fe_master')

@section('content')

<br>
<br>
<h3>Book_id: {{ $myBook->id }}</h3>
<br>
<br>
<h6>Título: {{ $myBook->name }}</h6>
<h6>Preço estimado: {{ $myBook->estimated_price }}</h6>
<h6>Preço pago: {{ $myBook->paid_price }}</h6>
<h6>Diferença: {{ $myBook->paid_price - $myBook->estimated_price }}</h6>
<h6>Utilizador: {{ $myBook->userName }}</h6>

<br>
<br>

<h3>Editar Livro {{ $myBook->name }}</h3>

    <form method="POST" action="{{ route('update-book_route') }}">
        @csrf

        @method("PUT")
        <input type="hidden" name="id" value="{{ $myBook->id }}">

        <div class="mb-3">
            <label for="exampleInputName" class="form-label">Título</label>
            <input required name="name" type="text" class="form-control" id="name" value="{{ $myBook->name }}">
            @error('name')
                título inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputEstimated_price" class="form-label">Preço estimado</label>
            <input name="estimated_price" type="number" class="form-control" id="estimated_price" value="{{ $myBook->estimated_price }}">
            @error('estimated_price')
                preço estimado inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputPaid_price" class="form-label">Preço pago</label>
            <input name="paid_price" type="number" class="form-control" id="paid_price" value="{{ $myBook->paid_price }}">
            @error('paid_price')
                preço pago inválido
            @enderror
        </div>
        <div class="mb-3">
        <label for="exampleInputUser_id" class="form-label">Utilizador</label>
        <select name="user_id" id="">

            @foreach ($usersDB as $user)
                <option value="{{$user->id}}"  @if ($myBook->user_id == $user->id) selected @endif>{{$user->name}}</option>
            @endforeach

        </select>
            @error('user_id')
                    utilizador inválido
            @enderror

        </div>

        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>

    <br>
    <br>
    <br>


@endsection
