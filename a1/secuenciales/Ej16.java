package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 16.  Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados 
	por una distancia d. El que está detrás viaja a una velocidad  mayor. Se pide hacer un 
	algoritmo para ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades(km/h)
	y con esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
        
Variable a usar:
	* v1 y v2 = float = velocidad de los coches 
	* distancia= float = distancia entre los dos
	* t= int = El tiempo en alcanzarse
	* tmin = int = tiempo en minutos

**/

import java.util.*;

public class Ej16{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float v1;
    	Float v2;
    	Float distancia;
    	double t;
    	double tmin;
    	
    	//pido variables
        System.out.println("Indique la velocidad del vehículo1, el mas rápido: ");
        v1 = sc.nextFloat();
        System.out.println("Indique la velocidad del vehículo2, el mas lento: ");
        v2 = sc.nextFloat();
        System.out.println("Indique la distancia entre los vehículos: ");
        distancia = sc.nextFloat();
                
        //realizo operaciones
        t=distancia/(v1-v2);
        
			//pasar tiempo a minutos
			tmin=t*60;
		
        //muestro resultados
        System.out.printf("El tiempo en minútos es %f", tmin);
    }
}
