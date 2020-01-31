package a6arraysbidimensionales;

import java.util.Scanner;

/*
*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.

 * @author María Moreno Muñoz
 * @since 24/11/2019
 * */

public class libroEj5pag131 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[6][10];
		int maximo = 0;
		int minimo = 2000;
		int fmax = 0;
		int cmax = 0;
		int fmin = 0;
		int cmin = 0;

		for (int fila = 0; fila < 6; fila++) {
			for (int columna = 0; columna < 10; columna++) {

				numeros[fila][columna] = (int) (Math.random() * 1000);

				if (numeros[fila][columna] > maximo) {
					fmax = fila;
					cmax = columna;
					maximo = numeros[fila][columna];
				}
				if (numeros[fila][columna] < minimo) {
					fmin = fila;
					cmin = columna;
					minimo = numeros[fila][columna];
				}
			}
		}
		for (int k = 0; k < 6; k++) {
			for (int k2 = 0; k2 < 10; k2++) {
				System.out.print(numeros[k][k2] + "\t");

			}
			System.out.println();

		}
		System.out.println("máximo esta en fila " + fmax + " columna " + cmax + " : " + numeros[fmax][cmax]);
		System.out.println("mínimo esta en fila " + fmin + " columna " + cmin + " : " + numeros[fmin][cmin]);

	}
}
