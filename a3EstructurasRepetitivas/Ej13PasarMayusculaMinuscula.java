package a3EstructurasRepetitivas;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 13. Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.


Variable a usar:
	* cadena		= srt =	base de la operación
	* cadenafinal= cadena cambiada


**/

import java.util.*;


public class Ej13PasarMayusculaMinuscula{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		//declaración de variables
		String cadena;
		String cadenafinal=" ";
		int i;
		
		System.out.printf("indique la cadena:");
		cadena=sc.nextLine();
	
		for (i=1; i<=cadena.length(); i++){
			
			if (cadena.substring((i-1),i).matches("[A-Z]")){
				cadenafinal+=cadena.substring((i-1),i).toLowerCase();
			}else{
				cadenafinal+=cadena.substring((i-1),i).toUpperCase();
			}
		}
		
		System.out.println(":" + cadenafinal);

				
	}
}
