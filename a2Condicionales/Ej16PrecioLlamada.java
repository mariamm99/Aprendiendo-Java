package a2Condicionales;
/**
*@author María Moreno Muñoz

@Fecha 05/11/2019

Ejercicio 16. La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro 
es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes 
tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. 
Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %, y 
en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una 
persona que realiza una llamada.

Variable a usar:
	* min_llamada= int, minutos de llamada
	* dia= Domingo, mañana o tarde
	* precio=	pago sin sumar el inpuesto
	
**/
import java.util.*;

public class Ej16PrecioLlamada{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	//para poder leer variables
		
		//declaración de variables
    	double precio;
    	String dia;
    	int min_llamada;
    	
    	
    	//lectura de variables
        System.out.println("Indique los minutos de la llamada: ");
        min_llamada = sc.nextInt();
        System.out.println("Indique el dia D domingo, si no es domingo --> M mañana y T Tarde: ");
        dia = sc.next();

		if (min_llamada<=5){
			precio=min_llamada;
		}else if(min_llamada<=8){
			min_llamada=min_llamada-5;
			precio=min_llamada*0.8+5;
		}else if ( min_llamada<=10) {
			min_llamada=min_llamada-8;
			precio=min_llamada*0.7+7.7;			
		}else{
			min_llamada=min_llamada-10;
			precio=min_llamada*0.5+8.8;
		}
		
		
		if (dia.equals("D")){
			System.out.printf("el precio final es de %.2f euros", precio+precio*0.03);
		}else if(dia.equals("T")){
			System.out.printf("el precio final es de %.2f euros ",precio+precio*0.1);

		}else if ( dia.equals("M")) {
			System.out.printf("el precio final es de %.2f euros", precio+precio*0.03);
		
		}else{
			System.out.printf("el dia es incorrecto");

		}
	
	}
}
