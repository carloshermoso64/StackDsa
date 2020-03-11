package com.dsa.pila;

import java.util.Vector;

public class MiPila implements PilaInter {

    Vector<Integer> vec = new Vector<>();

    int max, nuevo=12;

    @Override
    public boolean push() {
        vec.add(this.nuevo);
        return false;
    }

    @Override
    public boolean pop() {
        return false;
    }

    @Override
    public boolean llena() {
        return false;
    }

    public MiPila(int maxi) {

        this.max = maxi;

        //vetor=new Vector(maxi);
        this.push();
        vec.add(0);
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        System.out.println("The size is: " + this.vec.size());

    }


    // Definir tamanho maximo de pila solo para probar



    // Displaying the Vector
        //System.out.println("Vector: " + vec_tor);

    // Displaying the size of Vector






}
