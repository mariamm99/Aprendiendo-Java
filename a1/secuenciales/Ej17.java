package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 17. Un ciclista parte de una ciudad A a las HH horas, MM minutos
    y SS segundos. El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
    Escribir un algoritmo que determine la hora de llegada a la ciudad B.

Variable a usar:
	* hora= Formato HH:MM:SS,  para la hora de salida.
	* duracion= int=  tiempo en segundos que tarda en llegar
	* salidaseg=hora de salida en segundos = int 
	* llegada= int en segundos, tiempo en el que llega en segundos.
	* llegadahora= la llegada en HH
	* llegadamint= la llegada en MM
	* llegadaseg= la llegada en SS 

**/

import java.util.*;

public class Ej17{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	int hora;
    	int min;
    	int seg;
    	int salidaseg;
    	int duracion;
    	int llegada;
    	int llegadahora;
    	int llegadamint;
    	int llegadaseg;
    	
    	
    	//pido variables
        System.out.println("Indique las horas ");
        hora = sc.nextInt();
        System.out.println("Indique los minutos: ");
        min =  sc.nextInt();
        System.out.println("Indique los segundos: ");
        seg =  sc.nextInt();
        System.out.println("duracion: ");
        duracion =  sc.nextInt();
                
        //realizo operaciones
        salidaseg= hora*3600+min*60+seg;
		llegada= salidaseg+duracion;
		llegadahora= llegada/3600;
		llegadamint= llegada%3600/60;
		llegadaseg= llegada%3600%60;

		
        //muestro resultados
        System.out.printf("El tiempo en minútos es %d:%d:%d", llegadahora, llegadamint, llegadaseg);
    }
}
