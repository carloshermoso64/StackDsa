package com.dsa.pila;

import java.util.Vector;

public class MiPila<E> implements PilaInter<E> {
    Vector<E> vec;
    int max;

    public MiPila(int max) {
        this.max = max;
        this.vec = new Vector<E>();
    }

    @Override
    public void push(E e) throws FullStackException {
        if (vec.size()>=this.max) throw new FullStackException();
        vec.add(e);
    }

    @Override
    public E pop() throws EmptyStackException {
        if (this.vec.size()==0) throw new EmptyStackException();
        E e = this.vec.remove(this.vec.size()-1);
        return e; //false;
    }

    @Override
    public boolean llena() {
        return false;
    }

    @Override
    public void mostra() {
/*
        for ( val : vec) {
            System.out.print(val + " ");
        }*/
    }

    public int size() {

        return this.vec.size();
    }
/*
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
*/

    // Definir tamanho maximo de pila solo para probar



    // Displaying the Vector
        //System.out.println("Vector: " + vec_tor);

    // Displaying the size of Vector






}
