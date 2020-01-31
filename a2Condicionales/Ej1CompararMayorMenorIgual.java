package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 1.Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.

Variable a usar:
	* n1 y n2 = float
**/
import java.util.*;

public class Ej1CompararMayorMenorIgual{
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

		if (n1>n2){
			System.out.printf("El primer número %.2f es mayor que el segundo número %.2f", n1, n2);
		}else if(n2>n1){
			System.out.printf("El segundo número %.2f es mayor que el primer número %.2f", n2, n1);
		}else{
			System.out.printf("los dos números son iguales %.2f, %.2f ", n1, n2);
		}
	}
}
