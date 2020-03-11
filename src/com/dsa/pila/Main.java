package com.dsa.pila;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        System.out.println("PILA");

        // Para crear lo scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Pide un numero
        System.out.print("Digite un numero: ");

        // Recibe numero
        //int numero = scanner.nextInt();
        int numero = scanner.nextInt();

        double op = 0;

        //Integer op = 0;

        String retorno;
        retorno = "232.44234";

        // Verifica si es numero o no
        try{
            op = Double.parseDouble(retorno.trim());
            System.out.println(String.format("Es numero= %.3f", op));

        }catch(NumberFormatException ex){
            System.out.println("No es numero");
        }




        System.out.println("Numero = "+op);


    }

}
