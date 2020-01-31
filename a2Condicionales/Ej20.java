package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 20
Una compañía de transporte internacional tiene servicio en algunos países de América del Norte,
América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa
en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:

ZONA		UBICACIÓN		COSTO/GRAMO
1		América del Norte	24.00 euros
2		América Central		20.00 euros
3		América del Sur		21.00 euros
4		Europa				10.00 euros
5		Asia				18.00 euros

Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados,
 esto por cuestiones de logística y de seguridad. Realice un algoritmo para determinar el 
 cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
 
Variable a usar:
	* zona= int Ubicación donde va dirigido el paquete
	* peso= int indica los gramos que pesa el paquete que vamos a enviar
	
**/
import java.util.*;

public class Ej20{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		//declaración de variables
    	int zona;
    	int peso;
    	
    	//lectura de variables
        System.out.println("indique la zona America del Norte(1), América Central(2), América del Sur(3), Europa(4), Asia(5): ");
        zona = sc.nextInt();
        System.out.println("indique peso en Gramos: ");
        peso = sc.nextInt();
       
	
		
		if (zona==1){
			System.out.printf("El precio total es %.2f euros", 24.0*peso);
		}else if(zona==2){
			System.out.printf("El precio total es %.2f euros ",20.0*peso);
		}else if ( zona==3 ) {
			System.out.printf("El precio total es %.2f euros", 21.0*peso);
		}else if ( zona==4 ) {
			System.out.printf("El precio total es %.2f euros", 10.0*peso);
		}else if ( zona==5 ) {
			System.out.printf("El precio total es %.2f euros", 18.0*peso);
		}else{
			System.out.printf("zona incorrecto");
		}
	}
}
