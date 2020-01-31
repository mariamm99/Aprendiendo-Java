package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 5. El director de una escuela está organizando un viaje de estudios, y requiere 
determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por
el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por 
cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, 
de 95 euros, y si son menos de 30, el costo de la renta del autobús es de 4000 euros, 
sin importar el número de alumnos. Realice un algoritmo que permita determinar el pago
 a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.

Variable a usar:
n_alumnos= int, número de alumnos que irán al viaje.
	
**/
import java.util.*;
import java.lang.Math.*;

public class Ej15{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	double n_alumnos;
    	
    	
    	//lectura de variables
        System.out.println("Indique el número de alumnos: ");
        n_alumnos = sc.nextDouble();

		if (n_alumnos >= 100){
			System.out.printf("%.0f alumnos pagarán 65 euros",n_alumnos);
		
		}else if(n_alumnos>=50 && n_alumnos<100){
			System.out.printf("%.0f alumnos pagarán 70 euros", n_alumnos);

		}else if (n_alumnos>30 && n_alumnos<50) {
			System.out.printf(" %.0f alumnos pagarán 95 euros",n_alumnos);
			
		}else if (n_alumnos<30) {
			System.out.printf("%.0f alumnos pagarán %f euros", n_alumnos, 4000/n_alumnos);
		}
		
	}
}
