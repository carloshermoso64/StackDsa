package com.dsa.pila;

public interface Pila<E> {

    // Operacao POP
    E pop() throws EmptyStackException;

    // Operacao PUSH
    void push(E e) throws FullStackException;

    // Mostrar pila
    void mostra();

    // numelems
    int size();


}
