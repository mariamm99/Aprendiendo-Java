package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  12. Escribir un programa que lea un año indicar si es bisiesto. Nota: un 
año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, 
excepto que también sea divisible por 400.


Variable a usar:
	* year	= int =	año dado por el usuario para saber si es bisiesto
	
**/

import java.util.*;

public class Ej12AnoBisiesto{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
		int year;    	
    	
    	//lectura de variables
        System.out.println("Indique el año: ");
		year = sc.nextInt();
        
        
		if ((year%100!=0 || year/400==0) && year%4==0){
			System.out.printf("el año %d es bisiesto", year);
		
		}else{
			System.out.printf("El año %d NO es bisiesto",year);
		}
	}
}
