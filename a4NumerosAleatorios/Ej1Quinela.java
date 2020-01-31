package a4NumerosAleatorios;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 1. Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para
 los 14 partidos y el pleno al quince (15 filas) de forma que la probabilidad de que salga un 1
 sea  de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de
 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.


Variable a usar:

	
**/
import java.util.*;
import java.lang.Math;

public class Ej1Quinela {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num;
		double numLimite = 0.5 + 1.0 / 3.0;
		String resultado;

		for (int i = 0; i <= 15; i++) {
			System.out.print("resultado n� " + i + " es ");

			if (i < 15) {
				for (int j = 0; j < 3; j++) {
					num = Math.random();
					if (num <= 0.5) {
						resultado = "1";
					} else if (num > numLimite) {
						resultado = "2";
					} else {
						resultado = "x";
					}
					System.out.print("\t" + resultado);

				}
				System.out.println();
			} else {
				for (int j = 0; j < 1; j++) {
					num = Math.random();
					if (num <= 0.5) {
						resultado = "1";
					} else if (num > numLimite) {
						resultado = "2";
					} else {
						resultado = "x";
					}
					System.out.print("\t" + resultado);

				}
			}
		}

	}
}
