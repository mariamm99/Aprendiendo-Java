package a3EstructurasRepetitivas;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 4. Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.

Variable a usar:
	* n1 y n2	= int 	= números que se le pide al usuario
	* i 		= int 	= números dentro del rango
	
**/
import java.util.*;

public class Ej4{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		//declaración de variables
    	int n1;
    	int n2;
    	int i;
    	int aux;
    	
    	//lectura de variables
        System.out.println("\n Indique el primer número del rango: ");
		n1 = sc.nextInt();
		System.out.println("\n Indique el segundo número del rango: ");
		n2 = sc.nextInt();
		
		//MEJORADO
		if (n1>n2){
			aux=n1;
			n1=n2;
			n2=aux;
//		en python = n1, n2 = n2,, n1;
		}
		
		for (i=n1; i <= n2; i++ ){
			if (i%2==0){
				System.out.printf("\n %d es numero par", i);
			}
		}

	}							
}
