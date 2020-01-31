package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio4: Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.

Variable a usar:
	* n1
	* n2
**/
import java.util.*;

public class Ej4{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	Float n1;
    	Float n2;
    	
    	//lectura de variables
        System.out.println("Indique un número: ");
        n1 = sc.nextFloat();
        
        System.out.println("Indique otro número: ");
        n2 = sc.nextFloat();

		//utilizo el printf para poder indicar las operaciones directas, no crear mas variables.
        System.out.printf("La suma es %f", n1+n2);
        System.out.printf("La resta es %f", n1-n2);
        System.out.printf("La división es %f", n1/n2);
        System.out.printf("La multiplicación es %f", n1*n2);
    }
}
