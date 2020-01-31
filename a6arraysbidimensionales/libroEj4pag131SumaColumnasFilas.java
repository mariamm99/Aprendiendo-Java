package a6arraysbidimensionales;

import java.util.*;

/*
 *Modifica el programa anterior de tal forma que los n�meros que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).

 *3.Estos n�meros se deben introducir en un array de 4 filas por 5 columnas. El 
 *programa mostrar� las sumas parciales de filas y columnas igual que si de una 
 *hoja de c�lculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 *Modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un peque�o retardo, dando la impresi�n de
que el ordenador se queda �pensando� antes de mostrar los n�meros


 * @author Mar�a Moreno Mu�oz
 * @since 24/11/2019
 * */

public class libroEj4pag131SumaColumnasFilas {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[4][5];

		int fila, columna;
		double sumaTotal = 0;
		int numeroValores = 100;
		int minimo = 100;

		for (fila = 0; fila < 4; fila++) {
			for (columna = 0; columna < 5; columna++) {
				numeros[fila][columna] = (int) (Math.random() * numeroValores + minimo);
				sumaTotal += numeros[fila][columna];
			}
		}

		columna = 0;
		int i = 0;
		System.out.println("       |columna0| columna1| columna2| columna3| columna4|  total");

		for (fila = 0; fila < 5; fila++) {

			if (i < 4) {
				System.out.print("\n Fila" + i + " |  ");
				i++;

				double sumaFila = 0;

				for (columna = 0; columna < 5; columna++) {
					System.out.print(numeros[fila][columna] + "   |   ");
					sumaFila += numeros[fila][columna];
				}
				Thread.sleep(2000);

				System.out.print(sumaFila);

			} else {
				System.out.print("\n total | ");
				for (int c = 0; c < 5; c++) {
					double sumaColumna = 0;

					for (int f = 0; f < 4; f++) {
						sumaColumna += numeros[f][c];
					}

					Thread.sleep(2000);
					System.out.print(sumaColumna + "  |  ");

				}
				Thread.sleep(2000);

				System.out.print(sumaTotal);

			}

		}
	}
}
