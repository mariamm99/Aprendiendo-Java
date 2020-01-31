package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 12. Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
sustituye la aparición del primer carácter en la cadena por el segundo carácter.


Variable a usar:
	* cadena		= srt =	base de la operación
	* caracter1	= srt =	pedimos el caracter que sea sustituido
	* caracter2	= srt =	pedimos el caracter que va a sustituir
	* cadenafinal	= srt = cadena sustituida
**/

import java.util.*;

public class Ej12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		String cadena;
		String caracter1;
		String caracter2;
		String cadenafinal = " ";
		int i;

		System.out.printf("indique la cadena:");
		cadena = sc.nextLine();

		do {
			System.out.printf("indique que caracter a cambiar:");
			caracter1 = sc.nextLine();
		} while (caracter1.length() != 1);

		do {
			System.out.printf("indique que caracter susistuto:");
			caracter2 = sc.nextLine();
		} while (caracter2.length() != 1);

		for (i = 1; i <= cadena.length(); i++) {

			if (cadena.substring((i - 1), i).equals(caracter1)) {
				cadenafinal += caracter2;
			} else {
				cadenafinal += cadena.substring((i - 1), i);
			}
		}
		System.out.println(":" + cadenafinal);
	}
}
