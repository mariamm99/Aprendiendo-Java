package a5ArraysUnaDimension;

/*
 * 2. Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos seg�n la tabla que se muestra a continuaci�n. Muestra el contenido
de todos los elementos del array. �Qu� sucede con los valores de los elementos
que no han sido inicializados?
  
 * @author Mar�a Moreno Mu�oz
 * @since 21/11/2019
 * */
public class libroEj2pag120 {
	public static void main(String[] args) {
		
		char[] simbolo = new char[10];
		
		simbolo[0]='a';
		simbolo[1]='x';
		simbolo[4]='@';
		simbolo[6]=' ';
		simbolo[7]='+';
		simbolo[8]='Q';
		for (int i = 0; i < 10; i++) {
			System.out.println(simbolo[i]);
			
		}
		
	}
}

//RESPUESTA: se guardan como espacio en blanco
