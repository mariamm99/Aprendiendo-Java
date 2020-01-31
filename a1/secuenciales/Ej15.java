package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 15.  Dadas dos variables numéricas A y B, que el usuario debe teclear, se
		pide realizar un algoritmo que intercambie los valores de ambas variables 
        y muestre cuanto valen al final las dos variables.
        
Variable a usar:
	* A, B= Float = número dado por el usuario
	* aux  =  float = auxiliar para el intercambio de valores

**/

import java.util.*;

public class Ej15{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float A;
    	Float B;
    	Float aux;
    	
    	//pido variables
        System.out.println("Variable númerica A: ");
        A = sc.nextFloat();
        System.out.println("Variable númerica B: ");
        B = sc.nextFloat();
        
        //realizo operaciones
        aux=A;
		A=B;
		B=aux;
		
        //muestro resultados
        System.out.printf("valor de la variable A  = %f y el valor de la variable B es = %f", A, B);
    }
}
