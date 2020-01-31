package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio  14. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de 
uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza 
la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto 
recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente: 
si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 
céntimos si es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1,
y 50 céntimos cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.


Variable a usar:
	* pinicial= float precio inicial
	* tipo= str A o B
	* tamaño= int 1 0 2	
	* kg = kilos llevados
	
**/

import java.util.*;

public class Ej14PrecioAoB{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
		int tamano;
		Float pinicial;    	
    	String tipo;
    	Float kg;
    	
    	//lectura de variables
    	System.out.println("Indique el pinical: ");
		pinicial = sc.nextFloat();

    	System.out.println("Indique el tipo A o B: ");
		tipo = sc.next();
		
		System.out.println("Indique los kg: ");
		kg = sc.nextFloat();
    	
        System.out.println("Indique el tamano 1 O 2: ");
		tamano = sc.nextInt();
        
        
		if (tipo.matches("[A]")){
			if (tamano == 1){
				System.out.printf("precio es igual a %f ", (pinicial+0.20)*kg);
			}else if (tamano == 2){
				System.out.printf("precio es igual a %f ", (pinicial+0.30)*kg);
			}else{
				System.out.printf("tamaño erroneo");
				}
		}else if(tipo.matches("[B]")){
			if (tamano == 1){
				System.out.printf("precio es igual a %f ", (pinicial-0.30)*kg);
			}else if (tamano == 2){
				System.out.printf("precio es igual a %f ", (pinicial-0.50)*kg);
			}else{
				System.out.printf("tamaño erroneo");
				}
		}else{
			System.out.printf("tipo incorrecto");
		}
	}
}
