package com.ejercicio4;

public class SmartPhone extends SmartDevice{
    String Color;
    public SmartPhone(){}
    public SmartPhone(String SO, String marca, String color){
        super(SO, marca);
        this.Color = color;
    }

}
