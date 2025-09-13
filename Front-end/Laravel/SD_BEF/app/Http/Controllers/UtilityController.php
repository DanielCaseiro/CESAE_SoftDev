<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UtilityController extends Controller
{


// ---------- Funções para carregar views ----------

    public function welcome() {
        return view('utilities.welcome');
    }

    public function index() {

        $myName = $this -> getUser();

        $loginUser = [
            'name' => $myName,
            'email' => 'daniel@gmail.com'
        ];

        $cesaeInfo = $this -> getCesaeInfo();

        return view('utilities.home', compact(
            'myName',
            'loginUser',
            'cesaeInfo'));
    }

    public function hello() {
        return view('utilities.hello');
    }



    // ---------- Funções para buscars dados ----------


    private function getUser(){
        // Vai a base de dados e busca o user
        $myName = "Daniel";
        return $myName;
    }

    private function getCesaeInfo(){
        // Vai a base de dados e busca os dados
        $cesaeInfo = [
            'name' => 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto' ,
            'email' => 'cesae@cesae.pt'

        ];

        return $cesaeInfo;
    }



}
