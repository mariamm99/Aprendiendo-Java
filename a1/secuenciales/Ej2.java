package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 10/11/2019

Ejercicio2: Calcular el perí­metro y área de un rectángulo dada su base y su altura.

Variable a usar:
	* base
	* altura
	* area
	* perimetro
**/
import java.util.*;

public class Ej2{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
    	Float base;
    	Float altura;
    	Float area;
    	Float perimetro;
    	
        System.out.println("Indique la base del recteángulo: ");
        base = sc.nextFloat();
        
        System.out.println("Indique la altura del rectángulo: ");
        altura = sc.nextFloat();


        area = base * altura;
		perimetro = base*2 + altura*2;
        
        
        System.out.println("El area es " + area);
		System.out.println("el perímetro es " + perimetro);
    }
}
