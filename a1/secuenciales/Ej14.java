package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 14. Dado un número de dos cifras, diseñe un 
		algoritmo que permita obtener el número invertido.

Variable a usar:
	* num = int = numero de dos cifras
	* n1 = int  = 
	* n2=  int  =

**/

import java.util.*;

public class Ej14{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	int num;
    	int n1;
		int n2;
    	
    	//pido variables
        System.out.println("Indique el número: ");
        num = sc.nextInt();
        
        //Realizo operacion
        if (num>10 && num<100){
			n1=num/10;
			n2=num%10*10;
			
			System.out.printf("El numero invertido es %d", n1+n2 );

		}else{
			System.out.printf("El número no tiene dos cifras");        
		}
    }
}
