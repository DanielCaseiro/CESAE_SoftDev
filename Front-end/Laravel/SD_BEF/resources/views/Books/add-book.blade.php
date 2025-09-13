@extends('layouts.fe_master')

@section('content')

    <br>
    <br>
    <h1>Aqui podes adicionar livros</h1>

    <br>


    <form method="POST" action="{{ route('store-book_route') }}">
        @csrf
    <div class="mb-3">
    <label for="exampleInputName" class="form-label">Título</label>
    <input type="text" class="form-control" name="name" id="name">
       @error('name')
                título inválido
        @enderror
    </div>
    <div class="mb-3">
    <label for="exampleInputEstimated_price" class="form-label">Preço estimado</label>
    <input type="number" class="form-control" name="estimated_price" id="estimated_price">
        @error('estimated_price')
                preço estimado inválido
        @enderror
    </div>
    <div class="mb-3">
    <label for="exampleInputPaid_price" class="form-label">Preço pago</label>
    <input type="number" class="form-control" name="paid_price" id="paid_price">
        @error('paid_price')
                preço pago inválido
        @enderror
    </div>
    <div class="mb-3">
    <label for="exampleInputUser_id" class="form-label">Utilizador</label>
    <select name="user_id" id="">

        @foreach ($usersDB as $user)
            <option value="{{$user->id}}">{{$user->name}}</option>
        @endforeach

    </select>
        @error('user_id')
                utilizador inválido
        @enderror


    <button type="submit" class="btn btn-primary">Submit</button>
    </form>


    <br>


@endsection


