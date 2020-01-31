package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  6 Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

Variable a usar:
	* cadena = float, letra solicitada al usuario
**/
import java.util.*;

public class Ej6{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	String cadena;
    	
    	//lectura de variables
        System.out.println("Indique la cadena de texto: ");
        cadena = System.console().readLine();

		if (cadena.length()==1 && cadena.matches("[A-Z]") ){
			System.out.println("La cadena tiene una letra mayuscula " + cadena);
		}else{
			System.out.println("a cadena tiene mas de una letra y/o es minuscula " + cadena);
		}
	}
}
