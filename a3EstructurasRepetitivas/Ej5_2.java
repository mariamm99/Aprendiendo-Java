package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  5

Escribe un programa que pida el limite inferior y superior de un intervalo. 
Si el límite inferior es mayor que el superior lo tiene que volver a pedir. 

A continuación se van introduciendo números hasta que introduzcamos el 0. 
Cuando termine el programa dará las siguientes informaciones:

La suma de los números que están dentro del intervalo (intervalo abierto).
Cuantos números están fuera del intervalo.
Informa si hemos introducido algún número igual a los límites del intervalo.

Variable a usar:
	* Linf= Límite inferior del intervalo
	* Lsuper= Límite superior del intervalo
	* ins= array
	
**/
import java.util.*;

public class Ej5_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		int Linf;
		int Lsuper;
		int numero;
		double suma = 0;

		// lectura de variables

		do {
			System.out.println("\n Indique el L�mite inferior: ");
			Linf = sc.nextInt();
			System.out.println("\n Indique el L�mite superior: ");
			Lsuper = sc.nextInt();
		} while (Linf > Lsuper);

		do{
			
			System.out.println("\n Indique el n�mero: ");
			numero = sc.nextInt();

			if (numero >= Linf && numero <= Lsuper) {
				suma += numero;
			}

			if (numero < Linf || numero > Lsuper) {
				System.out.println("n�meros fuera del rango: ");
				System.out.println(numero);

			}
			System.out.println("--------------------------------------------");

			// cantidad -1 pq como b empieza desde 0 y cantidad desde 1

			if (numero == Linf) {
				System.out.println("Est� el limite inferior: ");
				System.out.println(numero);

			} else if (numero == Lsuper) {
				System.out.println("Est� el limite superior: ");
				System.out.println(numero);

			}

		} while (numero == 0);

		System.out.println("el resultado de la suma es" + suma);
		System.out.println("--------------------------------------------");

		/*
		 * System.out.printf("Introduzca cuantos n�meros vas a poner"); cantidad =
		 * sc.nextInt();
		 * 
		 * int[] numeros = new int[cantidad];
		 * 
		 * for (i = 0; (i + 1) <= cantidad; i++) {
		 * System.out.printf("Introduzca número "); numero = sc.nextInt(); numeros[i]
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
		 * System.out.println("n�meros fuera del rango: ");
		 * System.out.println(numeros[b]); b++; } else { b++; } }
		 * System.out.println("--------------------------------------------");
		 * 
		 * // cantidad -1 pq como b empieza desde 0 y cantidad desde 1 b = 0;
		 * 
		 * while (b <= (cantidad - 1)) { if (numeros[b] == Linf) {
		 * System.out.println("Est� el limite inferior: ");
		 * System.out.println(numeros[b]); b++; } else if (numeros[b] == Lsuper) {
		 * System.out.println("Est� el limite superior: ");
		 * System.out.println(numeros[b]); b++; } else { b++; } }
		 */

	}
}
