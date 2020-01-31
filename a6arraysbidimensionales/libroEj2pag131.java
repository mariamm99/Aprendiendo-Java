package a6arraysbidimensionales;

import java.util.*;

/*
 * 2.Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.

 * @author María Moreno Muñoz
 * @since 24/11/2019
 * */

public class libroEj2pag131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] numeros = new int[4][5];

		int fila, columna;
		double sumaTotal = 0;
			
		for (fila = 0; fila < 4; fila++) {
			for (columna = 0; columna < 5; columna++) {
				System.out.println("indique el numero que se guardara en la posición" + fila + "," + columna);
				numeros[fila][columna] = sc.nextInt();
				sumaTotal += numeros[fila][columna];
				
			}
		}
		columna=0;
		int i=0;
		System.out.println("     |colum0 |colum1 |colum2 |colum3 |colum4 |total");
		for ( fila = 0; fila < 5; fila++) {
			
			if (fila < 4) {
				System.out.print("\n Fila" + i + " | ");
				
				double sumaFila = 0;
				
				for ( columna = 0; columna < 5; columna++) {
					System.out.print(  numeros[fila][columna] + " \t" );
					sumaFila+= numeros[fila][columna] ;
				}
				System.out.print( sumaFila);
				
			} else {
				System.out.print("\n total | " );
				for (int c = 0; c < 5; c++) {
					double sumaColumna = 0;
					
					for (int f = 0; f < 4; f++) {
						sumaColumna += numeros[f][c];
					}
					System.out.print( sumaColumna + " \t");

				}
				System.out.print( sumaTotal);

			}
			
		}
		
	}

}
