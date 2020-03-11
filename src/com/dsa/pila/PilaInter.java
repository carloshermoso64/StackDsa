package com.dsa.pila;

public interface PilaInter<E> {

    // Operacao POP
    E pop() throws EmptyStackException;

    // Operacao PUSH
    void push(E e) throws  FullStackException;

    // Verifica pilha
    boolean llena();

    // Mostrar pila
    void mostra();

    // numelems
    int size();


}
