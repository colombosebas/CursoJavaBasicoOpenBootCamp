package com.ejercicio5;

public class Main {
    public static void main(String[] args){
        CocheCRUDImpl Coche = new CocheCRUDImpl();
        Coche.findAll();
        Coche.delete();
        Coche.save();
    }
}
