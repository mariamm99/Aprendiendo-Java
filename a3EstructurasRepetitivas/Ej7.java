package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  7. Una persona adquirió un producto para pagar en 20 meses. El primer mes 
pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un
programa para determinar cuánto debe pagar mensualmente y el total de lo 
que pagará después de los 20 meses.

Variable a usar:
	* pago		= int =	 el pago por mes
	* ptotal	= int =	 el pago total
	* i			= int =	 incremento para sumar los 20 meses
	
**/

import java.util.*;

public class Ej7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		int pago;
		double ptotal;
		int mes;

		// lectura de variables

		pago = 10;
		ptotal = 0.0;

		for (mes=1; mes <= 20; mes++) {
			System.out.printf("\npago del %d mes %d ", mes, pago);
			ptotal += pago;
			pago = pago * 2;
		}

		System.out.printf("\nel pago total es %.2f ", ptotal);

	}
}
