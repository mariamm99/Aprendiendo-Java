package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  10. Pide una cadena y un carácter por teclado y muestra cuantas veces
 aparece el carácter en la cadena


Variable a usar:
	* cadena	= srt =	base de la operación
	* caracter= srt =	pedimos el caracter que queremos ver en la cadena
	* = i  =	número de veces que aparece el carcater
**/

import java.util.*;
import java.lang.Math.*;

public class Ej10BuscarCaracter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		int i;
		int m = 0;
		String cadena;
		String caracter;

		System.out.printf("indique la cadena:");
		cadena = sc.nextLine();

		do {
			System.out.printf("indique que caracter contar:");
			caracter = sc.nextLine();
		} while (caracter.length() != 1);

		for (i = 1; i <= cadena.length(); i++) {

			if (cadena.substring((i - 1), i).equals(caracter)) {
				m++;
			}
		}
		System.out.println("el numero de veces que aparece " + caracter + " es " + m);

	}
}
