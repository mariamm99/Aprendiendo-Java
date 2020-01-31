package a4NumerosAleatorios;

import java.util.Scanner;

/**
 * Ejercicio 4. Realiza un programa que pinte por pantalla una serpiente con un �serpenteo� aleatorio.
 * La cabeza se representar� con el car�cter @ y se debe colocar exactamente en la posici�n 13 (con 12
 * espacios delante). A partir de ah�, el cuerpo ir� serpenteando de la siguiente manera: se generar�
 * de forma aleatoria un valor entre tres posibles que har� que el siguiente car�cter se coloque una 
 * posici�n a la izquierda del anterior, alineado con el anterior o una posici�n a la derecha del 
 * anterior. La longitud de la serpiente se pedir� por teclado y se supone que el usuario introducir� un dato correcto.
 * 
 * @author Mar�a Moreno Mu�oz
 * @since 20/11/2019
 */

public class Ej4Serpiente {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroEspacios = 12;
		int longitud;
		int x=12;
		int i;
		
		System.out.println("indique la longitud");
		longitud = sc.nextInt();

		System.out.println("            @");

		while (longitud > 1) {
			
		  x += (int)(Math.random() * 3) - 1;
			for (i = 1; i < x; i++) {
	       System.out.print(" ");
			}

	     // pinta el cuerpo
	     System.out.println("*");

	     longitud--;
		}
			
	}
		 
}
