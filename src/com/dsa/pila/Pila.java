package com.dsa.pila;

import java.util.Vector;

public class Pila<E> implements IPila<E> {
    Vector<E> vec;

    int max;

    public Pila(int max) {
        this.max = max;
        this.vec = new Vector<>();
    }

    // Hace falta poner: @Override ?
    public void push(E e) throws FullStackException {
        if (vec.size()>=this.max){
            throw new FullStackException();
        }

        vec.add(e);
    }

    public E pop() throws EmptyStackException {
        if (this.vec.size()==0){
            throw new EmptyStackException();
        }
        return this.vec.remove(this.vec.size()-1);
    }

    public void mostra() {
        System.out.println(vec);
    }

    public int size() {

        return this.vec.size();
    }

}
