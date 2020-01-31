package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 7. Realiza un programa que reciba una cantidad de minutos 
			y muestre por pantalla a cuantas horas y minutos corresponde.
			
Variable a usar:
	* minutos= int = minutos solicitados al usuario

**/

import java.util.*;

public class Ej7{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	int minutos;
    	
    	
    	//pido variable
        System.out.println("Indique los minutos: ");
        minutos = sc.nextInt();

        
        //muestro resultado
       System.out.printf("son %d horas y de %d miutos ", minutos/60, minutos%60 ) ;
    }
}
