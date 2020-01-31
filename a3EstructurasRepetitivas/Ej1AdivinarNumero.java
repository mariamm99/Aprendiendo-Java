package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 1. Crea una aplicación que permita adivinar un número. La aplicación genera un número 
aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar 
es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10  intentos 
para acertarlo). El programa termina cuando se acierta el número (además te dice en cuantos intentos
 lo has acertado), si se llega al limite de intentos te muestra el número que había generado.

Variable a usar:
	* n= numero que da el usuario
	* nadivinar= numero que debe adivinar el usuario
	
**/
import java.util.*;
import java.lang.Math.*;

public class Ej1AdivinarNumero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		double numeroAdivinar;
		int numeroUsuario;
		int i;

		// lectura de variables

		numeroAdivinar = Math.floor(Math.random() * 100);
		numeroUsuario = 0;
		i = 0;

		while (numeroAdivinar != numeroUsuario && i < 10) {
			System.out.println("\n Indique el número a adivinar: ");
			numeroUsuario = sc.nextInt();
			i += 1;

			if (numeroUsuario < numeroAdivinar) {
				System.out.printf(" el número indicado es menor que el número a adivinar");
			} else if (numeroUsuario > numeroAdivinar) {
				System.out.printf("El número indicado es mayor que el número a adivinar");
			}
		}

		if (numeroAdivinar == numeroUsuario) {
			System.out.printf("has adivinado el número %.0f ", numeroAdivinar);
		} else {
			System.out.printf("has superado los diez intentos");
		}

	}
}
