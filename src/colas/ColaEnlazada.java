//Cola con nodos enlazados

//Paso 2.1. Crear la clase con el nodo interno, es necesario documentar cada clase, propiedades y método

package colas;

/**
*Colas enlazadas
*@author: Uriel Ramírez
*@Date: 30 agosto 2026
*/


public class ColaEnlazada<T> {
	private class Nodo {
        T dato;
        Nodo siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo frente;
    private Nodo fin;
    private int tamanio;

    public ColaEnlazada() {
        frente = null;
        fin = null;
        tamanio = 0;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void encolar(T valor) {
        Nodo nuevo = new Nodo(valor);

        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }

        fin = nuevo;
        tamanio++;
    }

    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        T valor = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        tamanio--;
        return valor;
    }

    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        return frente.dato;
    }
}