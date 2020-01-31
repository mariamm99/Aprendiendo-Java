package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  11. Suponiendo que hemos introducido una cadena por teclado que representa una frase 
(palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.


Variable a usar:
	* cadena	= srt =	base de la operación

**/

import java.util.*;

public class Ej11ContarPalabras {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		String cadena;
		int palabra=0;
	

		System.out.printf("indique la cadena:");
		cadena = sc.nextLine();

		//StringTokenizer st = new StringTokenizer(cadena);
		//System.out.println("hay " + st.countTokens() + " palabras");

		
		for (int i=0; i<=cadena.length(); i++) {
			if (palabra!=' '){
					palabra++;
			}
		}
		System.out.println("hay " + palabra + " palabras");

	}
}
