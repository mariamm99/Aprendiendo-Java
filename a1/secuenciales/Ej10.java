package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 10. Un alumno desea saber cual será su calificación final en la materia
	de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
   	* 55% del promedio de sus tres calificaciones parciales.
	* 30% de la calificación del examen final.
	* 15% de la calificación de un trabajo final.

Variable a usar:
	* parcial1, parcial2, parcial3 = float
	* examenf = float
	* trabajof= float
	* notafinal = double

**/

import java.util.*;

public class Ej10{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float parcial1;
    	Float parcial2;
    	Float parcial3;
    	Float examenf;
    	Float trabajof;
    	double notafinal;
    	
    	//pido variables
        System.out.println("Indique nota del parcial 1: ");
        parcial1 = sc.nextFloat();
        System.out.println("Indique nota del parcial 2: ");
        parcial2 = sc.nextFloat();
        System.out.println("Indique nota del parcial 3: ");
        parcial3 = sc.nextFloat();
        System.out.println("Indique nota del examen final: ");
		examenf = sc.nextFloat();
		System.out.println("Indique nota del trabajo final: ");
		trabajof = sc.nextFloat();

        //operaciones
		notafinal = (parcial1 + parcial2 + parcial3)/3 * 0.55 + examenf*0.3 + trabajof*0.15;
		
        //muestro resultados
        System.out.printf("La nota final es %.2f ", notafinal );

    }
}
