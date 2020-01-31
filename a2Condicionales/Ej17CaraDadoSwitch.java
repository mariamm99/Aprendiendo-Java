package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 17. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.

Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
	ERROR: número incorrecto.

Variable a usar:
	* resultado= int, nº obtenido al lanzar el dado
	
**/
import java.util.*;

public class Ej17CaraDadoSwitch{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		//declaración de variables
    	int resultado;
    	
    	//lectura de variables
        System.out.println("Resultado del dado: ");
        resultado = sc.nextInt();
		
		switch (resultado) {
		case 1:
			System.out.printf("Su cara opuesta es seis");
			break;
		case 2:
			System.out.printf("Su cara opuesta es cinco");
			break;
		case 3:
			System.out.printf("Su cara opuesta es cuatro");
			break;
		case 4:
			System.out.printf("Su cara opuesta es tres");
			break;
		case 5:
			System.out.printf("Su cara opuesta es dos");
			break;
		case 6:
			System.out.printf("Su cara opuesta es uno");
			break;
		default:
			System.out.printf("ERROR: numero incorrecto");
			break;
		}
	}
}
