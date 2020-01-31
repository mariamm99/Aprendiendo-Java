package a5ArraysUnaDimension;

import java.util.Scanner;

/*
 * 8. Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.

 * @author María Moreno Muñoz
 * @since 21/11/2019
 * */
public class libroEj8pag120grafica {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] mes = new double[12];
		String totalAsteriscos;
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Indique la temperatura media del mes " + i + ": ");
			mes[i]=sc.nextDouble();
		}
		
		for (int i = 0; i < 12; i++) {
			totalAsteriscos = new String(new char[(int) mes[i]]).replace("\0", "*");
			System.out.println("mes " + (i+1) + totalAsteriscos);
			
		}
	}
}
