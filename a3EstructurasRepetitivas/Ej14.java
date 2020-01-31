package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 14. Realizar un programa que compruebe si una cadena contiene una subcadena. 
Las dos cadenas se introducen por teclado.

Variable a usar:
	* cadena		= srt =	base de la operación
	* subcadena	= int =	subcadena que buscar en la cadena

**/

import java.util.*;

public class Ej14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		String cadena;
		String subcadena;
		boolean estaSubcadena=false;

		System.out.printf("indique la cadena:");
		cadena = sc.nextLine();

		System.out.printf("indique la subcadena:");
		subcadena = sc.nextLine();

		for (int i=0; i<= (cadena.length() - subcadena.length()) && !estaSubcadena; i++) {
			if(cadena.substring(i,i+subcadena.length()).contentEquals(subcadena)) {
				estaSubcadena=true;
			}
			
		}
		if (estaSubcadena) {
			System.out.println("La cadena si est�");
		}else {
			System.out.println("La cadena NO est�");
		}
			
		
//		if (cadena.length() < subcadena.length()) {
//			System.out.println("La cadena NO está");
//		} else {
//
//			while (cadena.indexOf(subcadena) == 0) {
//				System.out.println("La cadena si está");
//				break;
//			}
//			while (cadena.indexOf(subcadena) != 0) {
//				System.out.println("La cadena NO está");
//				break;
//			}
//		}

	}
}
