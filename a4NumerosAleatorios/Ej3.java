package a4NumerosAleatorios;
import java.util.*;

/**
 * 
 * 
 * Ejercicio 3. Realiza un programa que llene la pantalla de caracteres
 * aleatorios (a lo Matrix) con el c�digo ascii entre el 32 y el 126. Puedes
 * hacer casting con (char) para convertir un entero en un car�cter.
 * 
 * 
 * @author Mar�a Moreno Mu�oz
 * @since 05/11/2019
 */
public class Ej3 {
	public static void main(String[] args) {

		
		int numero;

		int maximo = 126;
		int minimo = 32;
		int numeroValores = maximo - minimo + 1;

		for (int i = 0; i < 100; i++) {

			numero = (int) (Math.random() * numeroValores + minimo);
		
			char caracter=(char)numero;
			System.out.print(caracter);
		}

	}

}
