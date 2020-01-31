package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 11. Pide al usuario dos números y muestra la "distancia" entre ellos 
	(el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

Variable a usar:
	* n1, n2 = float = números dados por el usuario


**/

import java.util.*;
import java.lang.Math.*;

public class Ej11{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float n1;
    	Float n2;
    	
    	//pido variables
        System.out.println("Indique el primer número: ");
        n1 = sc.nextFloat();
        System.out.println("Indique el segundo numero: ");
        n2 = sc.nextFloat();

        //muestro resultados
        System.out.printf("La diferencia entre los dos números es %.2f", Math.abs(n1-n2) );

    }
}
