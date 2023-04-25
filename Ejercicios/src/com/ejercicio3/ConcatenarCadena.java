package com.ejercicio3;

public class ConcatenarCadena {

    public static void main (String[] args){
        String[] textos = {"Julia", " Juan", " Josefina"};
        concatenaTextos(textos);
    }

    static void concatenaTextos(String[] textos){
        String cadenaFinal = "";
        for (String texto : textos){
            cadenaFinal += texto;
        }
        System.out.println(cadenaFinal);
    }
}
