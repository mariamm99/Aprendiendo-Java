package a2Condicionales;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 3. Escribe un programa que lea un número e indique si es par o impar.

Variable a usar:
	* n = float
**/
import java.util.*;

public class Ej3ParImpar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // para poder leer variables

		// declaración de variables
		Float n;

		// lectura de variables
		System.out.println("Indique un número: ");
		n = sc.nextFloat();

		if (n % 2 == 0) {
			System.out.printf("El número es par %.2f", n);
		} else {
			System.out.printf("El número es impar %.2f", n);
		}
	}
}
