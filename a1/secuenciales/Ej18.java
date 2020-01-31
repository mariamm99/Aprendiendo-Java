package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 18.Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.

Variable a usar:
	* nombre, apellido1, apellido2= Formato string.
	* iniciales = string

**/

import java.util.*;

public class Ej18{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	String nombre;
    	String apellido1;
    	String apellido2;
    	String iniciales;
    	
    	//pido variables
        System.out.println("Indique nombre ");
        nombre =System.console().readLine();
        System.out.println("Indique apellido 1 ");
        apellido1 =System.console().readLine();
        System.out.println("Indique apellido 2 ");
        apellido2 =System.console().readLine();
        
        
        //realizo operaciones, voy incrementado el valor de inicales con la inicial de cada palabra
		iniciales=nombre.substring(0,1);
		iniciales+=apellido1.substring(0,1);
		iniciales+=apellido2.substring(0,1);
		
        //muestro resultados
        System.out.println("las iniciales son " + iniciales);

    }
}
