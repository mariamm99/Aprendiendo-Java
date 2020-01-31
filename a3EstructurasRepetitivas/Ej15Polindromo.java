package a3EstructurasRepetitivas;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 15. Introducir una cadena de caracteres e indicar si es un palíndromo. 
Una palabra palindroma es aquella que se lee igual adelante que atrás.


Variable a usar:
	* cadena		= srt =	base de la operación
	* 

**/

import java.util.*;


public class Ej15Polindromo{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		//declaración de variables
		String cadena;
		String cadena2;
		int posicionIzquierda = 0;
		boolean esPalindromo=false;
		
		System.out.printf("indique la cadena:");
		cadena=sc.nextLine();
		
		//paso a minuscula y quito espacios
		cadena2=cadena.toLowerCase();
		cadena2=cadena2.replace(" ","");
		
		int posicionDerecha = cadena2.length()-1;
		
		while((posicionIzquierda<posicionDerecha) && (!esPalindromo)) {
			if (cadena2.charAt(posicionIzquierda)==cadena2.charAt(posicionDerecha)){				
				posicionDerecha--;
				posicionIzquierda++;
			} else {
				esPalindromo = true;
			}
		}
		
		if (!esPalindromo) {
			System.out.println(cadena + " es un PALINDROMO");
		}else {
			System.out.println(cadena + " NO es un palindromo");	
		}
			
				
	}
}
