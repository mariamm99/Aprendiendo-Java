package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 12. Pide al usuario dos pares de números x1,y1 y x2,y2, que representen
		dos puntos en el plano. Calcula y muestra la distancia entre ellos.

Variable a usar:
	* x1, x2, y1, y2 = float = puntos en el plano
	* distancia = double

**/

import java.util.*;
import java.lang.Math.*;

public class Ej12{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float x1;
    	Float x2;
    	Float y1;
    	Float y2;
    	double distancia;
    	
    	//pido variables
        System.out.println("Indique del primer punto x1: ");
        x1 = sc.nextFloat();
        System.out.println("Indique del primer punto x2: ");
        x2 = sc.nextFloat();
		System.out.println("Indique del segundo punto y1: ");
        y1 = sc.nextFloat();
        System.out.println("Indique del segundo punto y2: ");
        y2 = sc.nextFloat();
		
		//realizo las operaciones
		distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

		
        //muestro resultados
        System.out.printf("La diferencia entre los dos números es %.2f", distancia );

    }
}
