package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio3: Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

Variable a usar:
	* Cateto1 = Float
	* cateto2 = float
	* hip = hipotenusa = Float

**/
import java.util.*;
import java.lang.Math.*;

public class Ej3{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaración de variables.
    	Float cateto1;
    	Float cateto2;
    	
    	//me obliga a utilizar double por las operaciones
    	double hip;
    	
    	//Leo las variables
        System.out.println("Indique un cateto: ");
        cateto1 = sc.nextFloat();
        
        System.out.println("Indique otro cateto: ");
        cateto2 = sc.nextFloat();

		//realizo las operaciones
        hip= Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        
        //muestro resultado
        System.out.println("La hipotenusa es " + hip);
    }
}
