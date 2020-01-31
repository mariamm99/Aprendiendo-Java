package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 4 Crea un programa que pida al usuario dos números y muestre su división 
	si el segundo no es cero, o un mensaje de aviso en caso contrario.

Variable a usar:
	* n1 y n2 = float, números solicitados al usuario
**/
import java.util.*;

public class Ej4divisionPor0{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	Float n1;
    	Float n2;
    	   	
    	//lectura de variables
        System.out.println("Indique el número a dividir: ");
        n1 = sc.nextFloat();

		System.out.println("Indique el divisor: ");
        n2 = sc.nextFloat();

		if (n2 ==0){
			System.out.printf("La división entre 0 no es posible");
		}else{
			System.out.printf("La división es %f", n1/n2);
		}
	}
}
