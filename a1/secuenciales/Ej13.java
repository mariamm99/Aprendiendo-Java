package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 13. Pide al usuario dos números y muestra la "distancia" entre ellos 
	(el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

Variable a usar:
	* num = float = numero


**/

import java.util.*;
import java.lang.Math.*;    // para poder realizar loas raices

public class Ej13{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	double num;

    	
    	//pido variables
        System.out.println("Indique el número: ");
        num = sc.nextDouble();
        
        //muestro resultados. importante que se indique 1.0 y 2.0 para que no coja solo como números enteros
        System.out.printf("La raiz cuadrada es %.2f", Math.pow(num,1.0/2.0));
		System.out.printf("La raiz cúbica es %.2f", Math.pow(num,1.0/3.0));
    }
}
