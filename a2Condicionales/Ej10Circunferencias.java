package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 10. Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
circunferencias y las clasifique en uno de estos estados:

	* exteriores
	* tangentes exteriores
	* secantes
	* tangentes interiores
	* interiores
	* concéntricas

Variable a usar:
	* x1,y1,x2,y2= float los puntos centrales  
	* r1,r2 =float, los radios 
	* distancia= double
	
**/

import java.util.*;
import java.lang.Math.*;

public class Ej10Circunferencias{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	Float x1, x2, y1, y2;
    	Float r1, r2;
    	double distancia;
  
    	
    	
    	//lectura de variables
        System.out.println("Indique x1: ");
        x1 = sc.nextFloat();
        
        System.out.println("Indique x2: ");
        x2 = sc.nextFloat();

        System.out.println("Indique y1: ");
        y1 = sc.nextFloat();
        
        System.out.println("Indique y2: ");
        y2 = sc.nextFloat();
        
         System.out.println("Indique radio1: ");
        r1 = sc.nextFloat();
        
        System.out.println("Indique radio2: ");
        r2 = sc.nextFloat();
        
        distancia= Math.sqrt(Math.pow((x2-x1),2.0)+Math.pow((y2-y1),2.0));
        
		if (distancia == 0){
			System.out.printf("las circunferencias son concentricas");
		}
		if(distancia == (r1+r2)){
			System.out.println("Las circunferencias son tangentes exteriores");
		}
		if(distancia>(r1+r2)){
			System.out.println("las circunferencias son exteriores");
		}
		if(distancia<(r1+r2) && distancia>Math.abs(r1-r2)){
			System.out.println("Circunferencias secantes");
		}
		if(distancia==Math.abs(r1-r2)){
			System.out.println("El exponente es 0, todo número elevado a 0 es 1");
		}
		if(distancia>0 && distancia<Math.abs(r1-r2)){
			System.out.println("Circunferencias interiores");
		}

	}
}
