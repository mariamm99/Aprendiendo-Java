package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 10/11/2019

Ejercicio1: Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

Variable a usar:
	name: Nombre del usuario
**/

public class Ej1{
    public static void main(String[] args){
		
    	String name;
        System.out.println("Indique tu nombre: ");
        name = System.console().readLine();
        System.out.println("Hola " + name + ", Bienvenido.");
     
    }
}
