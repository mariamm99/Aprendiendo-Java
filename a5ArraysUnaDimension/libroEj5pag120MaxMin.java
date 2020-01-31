package a5ArraysUnaDimension;
/*
 * 5. Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.

 @author María Moreno Muñoz
 * @since 21/11/2019
 * */

import java.util.Scanner;

import javax.swing.plaf.*;

public class libroEj5pag120MaxMin {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[10];
		double maximo = Double.MIN_VALUE;
		double minimo = Double.MAX_VALUE;
		int max = 0;
		int min = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("introduzca el " + i + " numero: ");
			numeros[i] = sc.nextInt();

			if (numeros[i] > maximo) {
				maximo = numeros[i];
				max = i;
			}
			if (numeros[i] < minimo) {
				minimo = numeros[i];
				min = i;
			}
		}

		for (int i = 0; i < 10; i++) {
			if (min == i) {
				System.out.println("minimo: " + numeros[i]);
			} else if (max == i) {
				System.out.println("maximo: " + numeros[i]);
			} else {
				System.out.println(numeros[i]);
			}
		}

	}

}
