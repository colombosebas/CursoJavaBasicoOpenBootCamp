package com.ejercicio2;

public class PrecioConIVA {
    public static void main(String[] args){
//        Ejemplo de uso
        double precioSinIVA = 56;
        double precioConIVA = PrecioIVA(precioSinIVA);
        System.out.println(precioConIVA);
    }

    static double PrecioIVA(double precio){
//        El IVA en mi país es 22%
        return precio * 1.22;
    }
}
