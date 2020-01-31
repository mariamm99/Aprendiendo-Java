package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 6. Escribe un programa que dados dos números, uno real (base) y un 
entero positivo (exponente), saque por pantalla el resultado de la potencia. 
No se puede utilizar el operador de potencia..

Variable a usar:
	* base		= float = base de la operación
	* exponente = int(tendrá que ser entero positivo) = exponente de la operación, comprobar que no sea negativo
	
**/
import java.util.*;
import java.lang.Math.*;

public class Ej6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		Float base;
		int exponente;

		// lectura de variables
		System.out.println("\n Indique la base: ");
		base = sc.nextFloat();

		do {
			System.out.println("\n Indique el exponente positivo: ");
			exponente = sc.nextInt();
		} while (exponente < 0);
		System.out.printf("El resultado es %f ", Math.pow(base, exponente));
	}
}
