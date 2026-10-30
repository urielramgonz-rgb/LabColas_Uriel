//Parte 1.   Cola con arreglo circular

//Paso  1.1. Crear la clase y sus atributos
package colas;

/**
*ColasArreglo
*@author: Uriel Ramírez
*@Date: 30 agosto 2026
*/

public class ColaArreglo {
	private int[] datos;
	private int frente;
	private int fin;
	private int tamanio;
	private int capacidad;

	public ColaArreglo(int capacidad) {
		this.capacidad = capacidad;
		this.datos = new int[capacidad];
		this.frente = 0;
		this.fin = -1;
		this.tamanio = 0;
	}
	
//Paso 1.2. Metodos de consulta
	public boolean estaVacia() {
		return tamanio == 0;
	}

	public boolean estaLlena() {
		return tamanio == capacidad;
	}

	public int tamanio() {
		return tamanio;
	}


//Paso 1.3. Metodo encolar
	
	public void  encolar(int valor) {
		if (estaLlena()) {
			throw new IllegalStateException("La cola está llena");
		}
		fin = (fin +1) % capacidad;  //avance circular
		datos[fin] = valor;
		tamanio ++;
	}

//Paso 1.4. Métodos desencolar y frente

	public int desencolar() {
		if (estaVacia()) {
			throw new IllegalStateException("La cola está vacía");
		}
		int valor = datos [frente];
		frente = (frente + 1) % capacidad;
		tamanio--;
		return valor;
	}

	public int frente() {
		if (estaVacia()) {
			throw new IllegalStateException("La cola está vacía");
		}
		return datos[frente];
	}











}