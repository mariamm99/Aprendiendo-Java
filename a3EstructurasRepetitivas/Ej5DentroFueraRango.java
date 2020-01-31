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

public class Ej5DentroFueraRango {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		int Linf;
		int Lsuper;
		int numero;
		boolean igualLimite = false;
		boolean fueraRango = false;
		double suma = 0;

		// lectura de variables

		do {
			System.out.println("\n Indique el L�mite inferior: ");
			Linf = sc.nextInt();
			System.out.println("\n Indique el L�mite superior: ");
			Lsuper = sc.nextInt();
		} while (Linf > Lsuper);

		do {

			System.out.println("\n Indique el n�mero: ");
			numero = sc.nextInt();

			if (numero >= Linf && numero <= Lsuper) {
				suma += numero;
			}

			if (numero < Linf || numero > Lsuper) {
				fueraRango = true;
				System.out.println(" N�mero fuera del rango " + numero);

			}

			// cantidad -1 pq como b empieza desde 0 y cantidad desde 1

			if (numero == Linf) {
				igualLimite = true;

			} else if (numero == Lsuper) {
				igualLimite = true;

			}

		} while (numero != 0);

		System.out.println("el resultado de la suma es" + suma);
		if (fueraRango) {
			System.out.println(" hay n�meros fuera del rango");
		}

		if (igualLimite) {
			System.out.println("Est� el limite ");
		}

	}
}
