package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  11. Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados
de un triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:

	* Si se cumple Pitágoras entonces es triángulo rectángulo
	* Si sólo dos lados del triángulo son iguales entonces es isósceles.
	* Si los 3 lados son iguales entonces es equilátero.
	* Si no se cumple ninguna de las condiciones anteriores, es escaleno.

Variable a usar:
	* A, B, C= float, longitud de los lados del triángulo
	
**/

import java.util.*;
import java.lang.Math.*;

public class Ej11Triangulos{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	Float A;
    	Float B;
    	Float C;
    	
    	
    	//lectura de variables
        System.out.println("Indique lado A: ");
        A = sc.nextFloat();
        
        System.out.println("Indique lado B: ");
        B = sc.nextFloat();

        System.out.println("Indique lado C: ");
        C = sc.nextFloat();
        
        
		if (A.equals(B) && A.equals(C) ){
			System.out.printf("El triangulo es equilátero");
		}else if(A.equals(B) || A.equals(C) || B.equals(C)){
			System.out.println("El triangulo es isósceles");
		}else{
			System.out.println("El triangulo es escaleno");
		}
		
		
		if(C.equals(Math.sqrt(Math.pow(A,2)+Math.pow(B,2))) || A.equals(Math.sqrt(Math.pow(B,2)+Math.pow(C,2))) || B.equals(Math.sqrt(Math.pow(C,2)+Math.pow(A,2)))){
			System.out.println("el triangulo es réctangulo");
		}
	}
}
