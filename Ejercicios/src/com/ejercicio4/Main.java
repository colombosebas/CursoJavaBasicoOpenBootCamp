package com.ejercicio4;

public class Main {
    public static void main(String[] args){
        SmartPhone Telefono = new SmartPhone();
        SmartPhone Telefono2 = new SmartPhone("Android", "Samsung", "Negro");
        SmartWatch Reloj = new SmartWatch();
        SmartWatch Reloj2 = new SmartWatch("IOS", "Apple", "Cuadrado");
        System.out.println(Telefono2.Marca + " " + Telefono2.SistemaOperativo + " " + Telefono2.Color);
        System.out.println(Reloj2.Marca + " " + Reloj2.SistemaOperativo + " " + Reloj2.Forma);

    }
}
