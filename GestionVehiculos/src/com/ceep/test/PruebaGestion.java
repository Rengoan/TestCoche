package com.ceep.test;

import com.ceep.domain.Vehiculo;

public class PruebaGestion {

    public static void main(String[] args) {

        Vehiculo v1= new Vehiculo("3522FZK","Ford","Focus","Azul",6900.200,true);
        v1.mostrar();
        Vehiculo v2= new Vehiculo("4022KZK","Seat","Leon","Amarillo",8690.200,true);
        v2.mostrar();
    }

}
