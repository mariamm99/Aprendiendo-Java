package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 19 Escribe un programa que pida un número entero entre uno y doce e imprima
	el número de días que tiene el mes correspondiente.

Variable a usar:
	* dia= int, dia de la semana en número
	
**/
import java.util.*;

public class Ej19{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		//declaración de variables
    	int mes;
    	
    	//lectura de variables
        System.out.println("Resultado dia 1-12: ");
        mes = sc.nextInt();
       
	
		if (mes>12 || mes<1){
			System.out.printf("ERROR: mes incorrecto");
		}else if(mes<7 || mes>1){
			
			if (mes%2 == 0 && mes!=2){
				System.out.printf("el mes tiene 30 días");
			}else if(mes<7 || mes>1){
				System.out.printf("el mes tiene 31 días");
			}else if (mes==2) {
				System.out.printf("El mes de Febrero tiene 28 días");
			}
			
		}else {
			if (mes%2 == 0){
				System.out.printf("el mes tiene 31 d�as");
			}else if( mes%2 != 0){
				System.out.printf("el mes tiene 30 d�as");
			}
		}
	}
}
