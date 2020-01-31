package a3EstructurasRepetitivas;

/**
*@author MarÃ­a Moreno MuÃ±oz

@Fecha 05/11/2019

Ejercicio  5

Escribe un programa que pida el limite inferior y superior de un intervalo. 
Si el lÃ­mite inferior es mayor que el superior lo tiene que volver a pedir. 

A continuaciÃ³n se van introduciendo nÃºmeros hasta que introduzcamos el 0. 
Cuando termine el programa darÃ¡ las siguientes informaciones:

La suma de los nÃºmeros que estÃ¡n dentro del intervalo (intervalo abierto).
Cuantos nÃºmeros estÃ¡n fuera del intervalo.
Informa si hemos introducido algÃºn nÃºmero igual a los lÃ­mites del intervalo.

Variable a usar:
	* Linf= LÃ­mite inferior del intervalo
	* Lsuper= LÃ­mite superior del intervalo
	* ins= array
	
**/
import java.util.*;

public class Ej5_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaraciÃ³n de variables
		int Linf;
		int Lsuper;
		int numero;
		double suma = 0;

		// lectura de variables

		do {
			System.out.println("\n Indique el Límite inferior: ");
			Linf = sc.nextInt();
			System.out.println("\n Indique el Límite superior: ");
			Lsuper = sc.nextInt();
		} while (Linf > Lsuper);

		do{
			
			System.out.println("\n Indique el número: ");
			numero = sc.nextInt();

			if (numero >= Linf && numero <= Lsuper) {
				suma += numero;
			}

			if (numero < Linf || numero > Lsuper) {
				System.out.println("números fuera del rango: ");
				System.out.println(numero);

			}
			System.out.println("--------------------------------------------");

			// cantidad -1 pq como b empieza desde 0 y cantidad desde 1

			if (numero == Linf) {
				System.out.println("Está el limite inferior: ");
				System.out.println(numero);

			} else if (numero == Lsuper) {
				System.out.println("Está el limite superior: ");
				System.out.println(numero);

			}

		} while (numero == 0);

		System.out.println("el resultado de la suma es" + suma);
		System.out.println("--------------------------------------------");

		/*
		 * System.out.printf("Introduzca cuantos números vas a poner"); cantidad =
		 * sc.nextInt();
		 * 
		 * int[] numeros = new int[cantidad];
		 * 
		 * for (i = 0; (i + 1) <= cantidad; i++) {
		 * System.out.printf("Introduzca nÃºmero "); numero = sc.nextInt(); numeros[i]
		 * += numero; }
		 * 
		 * double suma = 0; int b = 0;
		 * 
		 * while (b <= (cantidad - 1)) { if (numeros[b] >= Linf && numeros[b] <= Lsuper)
		 * { suma += numeros[b]; b++; } else { b++; } }
		 * 
		 * System.out.println("el resultado de la suma es" + suma);
		 * System.out.println("--------------------------------------------");
		 * 
		 * b = 0;
		 * 
		 * while (b <= (cantidad - 1)) { if (numeros[b] < Linf || numeros[b] > Lsuper) {
		 * System.out.println("números fuera del rango: ");
		 * System.out.println(numeros[b]); b++; } else { b++; } }
		 * System.out.println("--------------------------------------------");
		 * 
		 * // cantidad -1 pq como b empieza desde 0 y cantidad desde 1 b = 0;
		 * 
		 * while (b <= (cantidad - 1)) { if (numeros[b] == Linf) {
		 * System.out.println("Está el limite inferior: ");
		 * System.out.println(numeros[b]); b++; } else if (numeros[b] == Lsuper) {
		 * System.out.println("Está el limite superior: ");
		 * System.out.println(numeros[b]); b++; } else { b++; } }
		 */

	}
}
