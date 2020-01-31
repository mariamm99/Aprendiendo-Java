package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 5. Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

Variable a usar:
	* gf = grados en Fahnrenheit
	* gc = grados en Celsius

**/
import java.util.*;

public class Ej5{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float gf;
    	Float gc;
    	
    	//pido variable gf
        System.out.println("Indique los grados Farenheit: ");
        gf = sc.nextFloat();

		//realizo los calculos
		gc= (gf-32)*5/9 ;
        
        //muestro resultado
        System.out.println("Los grados en Celsius son " + gc);
    }
}
