package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 7.  Realiza un algoritmo que calcule la potencia, para 
ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:

	* El exponente sea positivo, sólo tienes que imprimir la potencia.
	* El exponente sea 0, el resultado es 1.
	* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

Variable a usar:
	* base = float, números solicitados al usuario
	* exponente= float, número solicitado al usuario
	* resultado= base**exponente
	* absexpon = valor absoluto del exponente 
	
**/
import java.util.*;
import java.lang.Math.*;

public class Ej7Potencia{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	Float exponente;
    	Float base;
    	double absexpon;
    	double resultado;
    	
    	
    	//lectura de variables
        System.out.println("Indique la base: ");
        base = sc.nextFloat();
        
        System.out.println("Indique el exponente: ");
        exponente = sc.nextFloat();
        
       //realizamos comparaciones
		if (exponente>0){
			System.out.printf("La potencia es %f",Math.pow(base,exponente));
		
		}else if(exponente==0){
			System.out.println("El exponente es 0, todo número elevado a 0 es 1");

		}else{
			absexpon=Math.abs(exponente);
			System.out.printf("La potencia es %f", 1.0/Math.pow(base,absexpon));
		}
	}
}
