package a4NumerosAleatorios;
import java.util.*;

/**
*@author Mar�a Moreno Mu�oz

@Fecha 05/11/2019

Ejercicio 2. Realiza un programa que vaya generando n�meros aleatorios pares entre 0 y
 100 y que no termine de generar n�meros hasta que no saque el 24. El  programa deber� 
 decir al final cu�ntos n�meros se han generado.


Variable a usar:

	
**/


public class Ej2ArrayQueFinalizaAlSacar24 {	
	public static void main(String[] args) {
	
		
		int numero;
		int i=0;
		
		do {
			numero = (int)(Math.random() * 100 );
			if (numero%2==0) {
				i++;
				System.out.println(i +":" + numero);
			}
			
		} while (numero!=24);
		System.out.println("se han generado " + i + " numeros");
		
	
	}

}
