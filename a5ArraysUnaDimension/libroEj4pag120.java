package a5ArraysUnaDimension;

/*
 * 4. Define tres arrays de 20 n�meros enteros cada una, con nombres numero, cuadrado y cubo. Carga el 
 * array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados
 * de los valores que hay en el array numero. En el array cubo se deben almacenar los cubos de los valores
 * que hay en numero. A continuaci�n, muestra el contenido de los tres arrays dispuesto en tres columnas.
 * @author Mar�a Moreno Mu�oz
 * @since 21/11/2019
 * */

public class libroEj4pag120 {
	public static void main(String[] args) {
		
		double[] numero = new double[20];
		double[] cuadrado = new double[20];
		double[] cubo = new double[20];
		
		for (int i = 0; i < 20; i++) {
			numero[i] = (int)(Math.random() * 100 );
			cuadrado[i]= Math.pow(numero[i], 2); 
			cubo[i]= Math.pow(numero[i], 3); 
			System.out.println( "\t " + numero[i] + "\t " + cuadrado[i]+ "\t" + cubo[i] + "\t");

		}
		
		
		
	}
}
