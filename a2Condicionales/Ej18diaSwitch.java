package a2Condicionales;

/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 18 Realiza un programa que pida el día de la semana (del 1 al 7) y escriba
	el día correspondiente. Si introducimos otro número nos da un error.

Variable a usar:
	* dia= int, dia de la semana en número
	
**/
import java.util.*;

public class Ej18diaSwitch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// declaración de variables
		int dia;

		// lectura de variables
		System.out.println("Resultado dia 1-7: ");
		dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.printf("Lunes");
			break;
		case 2:
			System.out.printf("Martes");
			break;
		case 3:
			System.out.printf("Miercoles");
			break;
		case 4:
			System.out.printf("Jueves");
			break;
		case 5:
			System.out.printf("Viernes");
			break;
		case 6:
			System.out.printf("Sabado");
			break;
		case 7:
			System.out.printf("Domingo");
			break;
		default:
			System.out.printf("ERROR: numero incorrecto");
			break;
		}
	}
}
