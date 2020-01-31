package a3EstructurasRepetitivas;

/**
*@author Mar�a Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 9.  Mostrar en pantalla los N primero número primos. 
Se pide por teclado la cantidad de nÃºmeros primos que queremos mostrar.


Variable a usar:
	* numerosMostrar		= int =	cantidad de nÃºmeros que queremos mostrar
	* num			= int =	variable que los nÃºmeros impares para ver cual es primo
	* numerosprimos	= int =	cantidad de nÃºmeros primos mostrados para que sea igual q n mostrar.
	* divisor
	* es_primo 		= boolean True o false 
**/

import java.util.*;
import java.lang.Math.*;

public class Ej9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaraciÃ³n de variables
		int num = 3;
		int divisor;
		int numerosMostrar;
		int numerosprimos = 0;
		do {
			System.out.printf("indique la cantidad de n�meros primos que quieres mostrar:");
			numerosMostrar = sc.nextInt();
		} while (numerosMostrar<0);
		

		while (numerosprimos < numerosMostrar) {
			// sc.nextLine();
			boolean es_primo = true;
			divisor = 3;
			while (divisor <= Math.sqrt(num) && es_primo) {
				// si la divisiÃ³n da exacta...
				if (num % divisor == 0) {
					// ...ya no es primo
					es_primo = false;
					
				}
			divisor += 2;
			}

			if (es_primo) {
				numerosprimos++;
				System.out.println(numerosprimos + ":" + num);
			}
			num += 2;		
		}
	}
}
