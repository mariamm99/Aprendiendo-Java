package a5ArraysUnaDimension;

import java.util.Scanner;

/*
 * 10. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario.

 * @author María Moreno Muñoz
 * @since 21/11/2019
 * */

public class libroEj10pag120Ordenar1Pares2Impares {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[20];
		int posicionIzq = 0;
		int posicionDer = 19;
		int numero;

		for (int i = 0; i < 20; i++) {
			numero = (int) (Math.random() * 100);

			if (numero % 2 == 0) {
				numeros[posicionIzq] = numero;
				posicionIzq++;
			} else {
				numeros[posicionDer] = numero;
				posicionDer--;
			}
		}
		for (int i = 0; i < 20; i++) {
			System.out.println((i + 1) + " : " + numeros[i]);

		}
	}
}
