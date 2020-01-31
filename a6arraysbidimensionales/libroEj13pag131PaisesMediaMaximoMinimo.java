package a6arraysbidimensionales;

import java.util.*;

/*
 * 13.Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
 * diferentes países. El array que contiene los nombres de los paises es el siguiente: pais = 
 * {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante 
 * un array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los
 * decimales de la media se pueden despreciar. Los nombres de los países se deben mostrar utilizando 
 * el array de países (no se pueden escribir directamente).

 * @author María Moreno Muñoz
 * @since 26/11/2019
 * */

public class libroEj13pag131PaisesMediaMaximoMinimo {
	public static void main(String[] args) {

		int[][] altura = new int[4][10];
		// String [] pais = new String[4];
		String pais[] = { "España  ", "Rusia   ", "Japón   ", "Australia" };
		int numeroValores = 210 - 140;
		int numeroInicial = 140;

		int maximo = 0;
		int minimo = 220;
		System.out.println("País    " + "\t" + "media" + "\t" + "maximo" + "\t" + "minimo" + "\t");

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
