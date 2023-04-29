package com.ejercicios7_8_9;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args){
        //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        String textoReverse = "Hola mundo";
        System.out.println("Texto normal: " + textoReverse);
        textoReverse = reverse(textoReverse);
        System.out.println("Texto al revés: " + textoReverse);

        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] textos = {"Texto1", "Texto2", "Texto3"};
        Parte1(textos);

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] numeros = new int[3][3];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;
        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;
        Parte2(numeros);

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Parte3();

/*
        4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        El problema es que se redimensionaría muchas veces, lo cual es costoso
*/

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        Parte5();

        //6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        Parte6();

        //7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

        int numero1 = 5;
        int numero2 = 0;
        try{
            DividePorCero(numero1, numero2);
            System.out.println("Demo de código");
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }
        int numero3 = 5;
        int numero4 = 1;
        try{
            DividePorCero(numero3, numero4);
            System.out.println("Demo de código");
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }

        //8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        String fileIn = "archivo_origen.txt";
        String fileOut = "archivo_destino.txt";
        Parte8(fileIn, fileOut);

    }
    public static String reverse(String texto) {
        int largo = texto.length();
        String resultado = "";
        for (int x = largo - 1; x>=0; x--){
            resultado += texto.charAt(x);
        }
        return resultado;
    }

    public static void Parte1(String[] args){
        for(String texto : args){
            System.out.println(texto);
        }
    }

    public static void Parte2(int[][] args){
        for (int x=0; x< args.length; x++){
            for (int j=0; j< args[x].length; j++){
                System.out.println("Array Bidimensional: " + args[x][j]);
            }
        }
    }

    public static void Parte3(){
        Vector<String> elVector = new Vector<String>();
        elVector.add("Soy");
        elVector.add("Sebastián");
        elVector.add("Colombo");
        elVector.add("de");
        elVector.add("Uruguay");
        elVector.remove(1);
        elVector.remove(2);
        System.out.println("Posición 1: " + elVector.get(0));
        System.out.println("Posición 2: " + elVector.get(1));
        System.out.println("Posición 3: " + elVector.get(2));
    }

    public static void Parte5(){
        ArrayList<String> arreglo5 = new ArrayList<String>();
        arreglo5.add("Elemento 1");
        arreglo5.add("Elemento 2");
        arreglo5.add("Elemento 3");
        arreglo5.add("Elemento 4");
        LinkedList<String> linked5 = new LinkedList<String>(arreglo5);
        for (String elemento : arreglo5){
            System.out.println(elemento);
        }
        for (String elemento : linked5){
            System.out.println(elemento);
        }
    }

    public static void Parte6(){
            ArrayList<Integer> enteros = new ArrayList<Integer>();
            for (Integer x = 1; x <= 10; x++){
                enteros.add(x);
            }
            for (int i = 0; i < enteros.size(); i++) {
                if (enteros.get(i) % 2 == 0) {
                    enteros.remove(i);
                    i--;
                } else{
                    System.out.println(enteros.get(i));
                }
            }

    }

    public static void DividePorCero(int numero1, int numero2){
        int resultado = numero1 / numero2;

    }

    public static void Parte8(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            PrintStream out = new PrintStream(new FileOutputStream(fileOut));

            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            in.close();
            out.close();
            System.out.println("Copia de archivo exitosa");
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
