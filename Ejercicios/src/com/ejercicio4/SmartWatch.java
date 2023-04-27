package com.ejercicio4;

public class SmartWatch extends SmartDevice{

    String Forma;

    public SmartWatch(){}
    public SmartWatch(String SO, String marca, String forma){
        super(SO, marca);
        this.Forma = forma;
    }
}
