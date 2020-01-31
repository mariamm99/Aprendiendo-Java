package a5ArraysUnaDimension;
import java.util.Scanner;

/*
 * 3. Escribe un programa que lea 10 números por teclado y que luego los muestre
	en orden inverso, es decir, el primero que se introduce es el último en mostrarse
	y viceversa.
  
 * @author María Moreno Muñoz
 * @since 21/11/2019
 * */

public class libroEj3pag120 {
private static Scanner sc;

public static void main(String[] args) {
		
	sc = new Scanner(System.in);

		double[] num = new double[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("indique el numero a introducir en el array");
			num[i]=sc.nextDouble();
		}
		
		for (int i = 9; i > 0; i--) {
			System.out.println(num[i]);
		}
	}
}
