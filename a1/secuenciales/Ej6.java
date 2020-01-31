package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 6. Calcular la media de tres números pedidos por teclado.

Variable a usar:
	* n1, n2, n3 = Float = numeros dados por el usuario

**/
import java.util.*;

public class Ej6{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float n1;
    	Float n2;
    	Float n3;
    	
    	//pido variables
        System.out.println("Indique número 1: ");
        n1 = sc.nextFloat();
        System.out.println("Indique número 2: ");
        n2 = sc.nextFloat();
        System.out.println("Indique número 3: ");
        n3 = sc.nextFloat();

        
        //muestro resultado
        System.out.printf("La medía de los tres números es %.3f ", (n1+n2+n3)/3);
    }
}
