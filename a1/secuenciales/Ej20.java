package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 20. Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
   después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).

Variable a usar:
	* e2= int =
	* e1 =int =
 	* cent50= int= 
	* cent20 = int= 
	* cent10 = int=
	* totaleur = total dinero en euros
	* totalcent = total dinero en céntimos

**/

import java.util.*;

public class Ej20{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	int e2;
    	int e1;
    	int cent50;
    	int cent20;
    	int cent10;
    	int totaleur;
    	int totalcent;
    	
    	//pido variables
        System.out.println("Indique monedas de 2 euros ");
        e2 = sc.nextInt();
        System.out.println("Indique monedas de 1 euro: ");
        e1 = sc.nextInt();
        System.out.println("Indique monedas de 50 céntimos: ");
        cent50 = sc.nextInt();
		System.out.println("Indique monedas de 20 céntimos: ");
        cent20 = sc.nextInt();
        System.out.println("Indique monedas de 10 céntimos: ");
        cent10 = sc.nextInt();
       
        //realizo operaciones
        totalcent=(cent50*50+cent20*20+cent10*10)%100;
		totaleur= e2*2+e1*1+ (cent50*50+cent20*20+cent10*10)/100;
		
        //muestro resultados
        System.out.printf("El total de dinero es %d euros y %d céntimos", totaleur, totalcent);
    }
}
