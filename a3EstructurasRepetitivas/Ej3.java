package a3EstructurasRepetitivas;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio3

Algoritmo que pida caracteres e imprima VOCAL si son vocales y NO VOCAL 
en caso contrario, el programa termina cuando se introduce un espacio.

Variable a usar:
	* caracter=	srt 	= caracter a comparar

**/
import java.util.*;

public class Ej3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		String caracter = "";
		
		// while(caracter.compareTo(" ")!=0){
		while (true) {
			System.out.println("\n Indique el caracter: ");
			caracter = sc.nextLine();

			if (caracter.matches("[aeiouAEIOU]{1}")) {
				System.out.printf("\n %s vocal ", caracter);
			} else if (caracter.compareTo(" ") == 0) {
				System.out.println("fin del programa");
				break;
			} else {
				System.out.printf("\n %s No vocal ", caracter);
			}
		}
	}
}
