package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  8. Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.

Variable a usar:
	* nota = float,
	* edad= int, número edad del usuario
	* sexo= str, F o M
**/
import java.util.*;

public class Ej8{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	Float nota;
    	int edad;
    	String sexo;
    	
    	
    	//lectura de variables
        System.out.println("Indique la nota: ");
        nota = sc.nextFloat();
        
        System.out.println("Indique el edad: ");
        edad = sc.nextInt();
        
        System.out.println("Indique sexo F o M: ");
        sexo = System.console().readLine();;

		if (nota>5){		
			if(edad>=18){
				if(sexo.matches("F")){
					System.out.printf("aceptada");
				}else if (sexo.matches("M")){
					System.out.printf("Posible");
				}else{
					System.out.printf("sexo incorrecto");
				}
			}else{
				System.out.printf("No aceptada edad insuficiente");
			}
		}else{
			System.out.printf("No aceptada nota insuficiente");
		}
	}
}
