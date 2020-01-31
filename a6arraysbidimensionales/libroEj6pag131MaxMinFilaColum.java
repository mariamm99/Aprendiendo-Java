package a6arraysbidimensionales;

import java.util.Scanner;

/*
 * 6. Modifica el programa anterior de tal forma que no se repita ningún número en
el array.

Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.

 * @author María Moreno Muñoz
 * @since 25/11/2019
 * */

public class libroEj6pag131MaxMinFilaColum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[6][10];
		int maximo = 0;
		int minimo = 2000;
		int fmax = 0;
		int cmax = 0;
		int fmin = 0;
		int cmin = 0;
		boolean diferente = true;

		for (int fila = 0; fila < 6; fila++) {
			for (int columna = 0; columna < 10; columna++) {

				numeros[fila][columna] = (int) (Math.random() * 1000);

				// comparamos numeros y guardamos numero maximo y minimo
				if (numeros[fila][columna] > maximo) {
					fmax = fila;
					cmax = columna;
					maximo = numeros[fila][columna];
				} else if (numeros[fila][columna] < minimo) {
					fmin = fila;
					cmin = columna;
					minimo = numeros[fila][columna];
				}

				// comprobamos si el número generado se repite con alguno de los anteriores y si
				// es asi volvemos a crearlo

				do {
					for (int i = 0; i < fila; i++) {
						for (int j = 0; j < columna; j++) {
							if (numeros[fila][columna] == numeros[i][j]) {
								numeros[fila][columna] = (int) (Math.random() * 1000);
								diferente = false;
							} else {
								diferente = true;
							}
						}
					}
				} while (diferente == false);
			}
		}
		// mostramos todos los números para ver que funciona
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(numeros[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println("máximo esta en fila " + fmax + " columna " + cmax + " : " + numeros[fmax][cmax]);
		System.out.println("mínimo esta en fila " + fmin + " columna " + cmin + " : " + numeros[fmin][cmin]);

	}
}
