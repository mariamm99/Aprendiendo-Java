package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 19. Escribir un algoritmo para calcular la nota final de un estudiante, 
	considerando que por cada respuesta correcta 5 puntos, por una incorrecta -1 
	y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.

Variable a usar:
	* correctas
	* incorrectas
	* nfinal= nota final del estudiante

**/

import java.util.*;

public class Ej19{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	int correctas;
    	int incorrectas;
    	int nfinal;
    	
    	//pido variables
        System.out.println("Indique el número de preguntas correctas ");
        correctas = sc.nextInt();
        System.out.println("Indique el número de respuestas incorrectas: ");
        incorrectas = sc.nextInt();
      
        //realizo operaciones
        nfinal=correctas*5-incorrectas;

        //muestro resultados
        System.out.printf("calificación final es %d", nfinal);
    }
}
