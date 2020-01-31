package a6arraysbidimensionales;

import java.util.*;

/*
 * 13.Realiza un programa que calcule la estatura media, m�nima y m�xima en cent�metros de personas de
 * diferentes pa�ses. El array que contiene los nombres de los paises es el siguiente: pais = 
 * {�Espa�a�, �Rusia�, �Jap�n�, �Australia�}. Los datos sobre las estaturas se deben simular mediante 
 * un array de 4 filas por 10 columnas con n�meros aleatorios generados al azar entre 140 y 210. Los
 * decimales de la media se pueden despreciar. Los nombres de los pa�ses se deben mostrar utilizando 
 * el array de pa�ses (no se pueden escribir directamente).

 * @author Mar�a Moreno Mu�oz
 * @since 26/11/2019
 * */

public class libroEj13pag131PaisesMediaMaximoMinimo {
	public static void main(String[] args) {

		int[][] altura = new int[4][10];
		// String [] pais = new String[4];
		String pais[] = { "Espa�a  ", "Rusia   ", "Jap�n   ", "Australia" };
		int numeroValores = 210 - 140;
		int numeroInicial = 140;

		int maximo = 0;
		int minimo = 220;
		System.out.println("Pa�s    " + "\t" + "media" + "\t" + "maximo" + "\t" + "minimo" + "\t");

		for (int fila = 0; fila < 4; fila++) {
			int sumaNumeros = 0;
			for (int columna = 0; columna < 10; columna++) {

				altura[fila][columna] = (int) (Math.random() * numeroValores + numeroInicial);

				sumaNumeros += altura[fila][columna];
				if (altura[fila][columna] > maximo) {
					maximo = altura[fila][columna];
				}
				if (altura[fila][columna] < minimo) {
					minimo = altura[fila][columna];
				}
			}
			System.out.print(pais[fila] + "\t" + sumaNumeros / 10.0 + "\t" + maximo + "\t" + minimo + "\t");
			System.out.println();
		}

	}
}
