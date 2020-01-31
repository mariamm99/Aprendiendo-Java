package a4NumerosAleatorios;

import java.util.Scanner;

/**
 * Ejercicio 4. Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio.
 * La cabeza se representará con el carácter @ y se debe colocar exactamente en la posición 13 (con 12
 * espacios delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: se generará
 * de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter se coloque una 
 * posición a la izquierda del anterior, alineado con el anterior o una posición a la derecha del 
 * anterior. La longitud de la serpiente se pedirá por teclado y se supone que el usuario introducirá un dato correcto.
 * 
 * @author María Moreno Muñoz
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
