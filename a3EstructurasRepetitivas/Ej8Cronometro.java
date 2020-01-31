package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio8.  Hacer un programa que muestre un cronómetro, indicando las horas, minutos y segundos.
Para hacer una espera en Python podemos usar el método sleep del módulo time.


Variable a usar:
	* t= tiempo que incrementa en segundos
	* inicio= horas
	
**/

import java.util.*;

public class Ej8Cronometro {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		// int t;
		// String inicio;

		int segundos = 0;
		int minutos = 0;
		int horas = 0;

		while (true) {
			if (segundos == 59) {
				segundos = 0;
				minutos++;
			}
			if (minutos == 59) {
				minutos = 0;
				horas++;
			}
			segundos++;

			// es en milisegundos por eso poner mil
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			//System.out.print( horas + ":" + minutos + ":" + segundos + "\b\b\b\b\b\b\b\b");
			System.out.printf( "%02d:%02d:%02d", horas, minutos, segundos);
			System.out.print("\b\b\b\b\b\b\b\b"); //tbn para python
		}
	}
}
