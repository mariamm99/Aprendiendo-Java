package a4NumerosAleatorios;
import java.util.Arrays;


/** 
 * Ejercicio 5. Muestra 50 n�meros enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra tambi�n el m�ximo, el m�nimo, la moda, la media, la 
 * mediana y la desviaci�n t�pica de esos n�meros.
 * 
 * @author Mar�a Moreno Mu�oz
 * @since 05/11/2019
 */

public class Ej5_moda_varianza_min_max {
	public static void main(String[] args) {
		
		int numeroValores= 100;
		int numeroInicial=100;
		//int numero;
		double maximo=100;
		double minimo=200;
		int sumaNumeros=0;
		double[] numero;
		numero = new double[50];
		double moda = 0;
		int maxRep = 0;
		double varianza= 0;
		

		for (int i = 0; i < 50; i++) {
			numero[i] = (int) (Math.random() * numeroValores + numeroInicial);
			
			if (numero[i]>maximo) {
				maximo=numero[i];
			}
			
			if (numero[i]<minimo) {
				minimo=numero[i];
			}
			sumaNumeros+=numero[i];
		
		}
		
		// doble bucle para ir comparando cual se repite.
			for (int i = 0; i < 50; i++) {
		        int f = 0;
		        for(int j=0; j<50; j++)
		        {
		            if(numero[i]==numero[j])
		            {
		                f++;
		            }   
		            if(f>maxRep)
		            {
		                moda= numero[i];
		                maxRep= f;
		            }   
		        }
		        
		      
		        
		        //para calcular la mediana, ordenamos los n�meros de menor a mayor, y cogemos los dos de el medio
		        //al haber 50 numeros(par) y dividimos entre 2 
		        Arrays.sort(numero);
		        
		      //!!me queda la desviaci�n tipica = la raiz cuadrada de la varianza
		        varianza =  Math.sqrt(sumaNumeros/50);
		             
		}
		
		System.out.println("el maximo es " + maximo);
		System.out.println("el minimo es " + minimo);
		System.out.println("la media es " + sumaNumeros/50);
		System.out.println("la moda es " + moda);
		System.out.println("la mediana es " + (numero[25]+numero[26])/2);
		System.out.println("la desviaci�n t�pica es " + varianza);

		
		
	}
}
