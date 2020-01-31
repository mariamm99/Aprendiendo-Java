package a3EstructurasRepetitivas;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 2. Realizar un algoritmo que pida números (se pedirá por teclado la cantidad 
de números a introducir). El programa debe informar de cuantos números 
introducidos son mayores que 0, menores que 0 e iguales a 0.


Variable a usar:
	* ntotales= numeros que va a dar el usuario
	* n= número a comparar con 0
	* int i;
	* int mayor0;
	* int menor0;
	* int igual0;
	
**/
import java.util.*;

public class Ej2MayorMenorIgual0{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		//declaración de variables
    	Float n;
    	int ntotales;
    	int i;
    	int mayor0;
    	int menor0;
    	int igual0;

    	//lectura de variables
        System.out.println("\n Indique Cuantos números vas a introducir: ");
		ntotales = sc.nextInt();
		i=0;
		mayor0=0;
		menor0=0;
		igual0=0;
		
		while (i!=ntotales){
			System.out.println("\n Indique un número para comparar: ");
			n = sc.nextFloat();
			i+=1;
			
			if(0<n){
				System.out.printf(" el número %.0f es mayor que 0", n);
				mayor0+=1;
			}else if ( 0>n) {
				System.out.printf("El número %.0f es menor que 0", n);
				menor0+=1;
			}else {
			System.out.printf("número igual a 0");
			igual0+=1;
			}
		}
		
		System.out.printf("\n ciclo terminado hay %d numeros mayores que 0, %d numeros menores que 0 y %d numeros iguales que cero", mayor0, menor0, igual0);
		
			
	}
}
