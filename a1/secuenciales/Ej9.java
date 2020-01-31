package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio 9.Una tienda ofrece un descuento del 15% sobre el total de la compra y
			un cliente desea saber cuanto deberá pagar finalmente por su compra.

Variable a usar:
	* pinicial = Float = precio inicial del producto

**/
import java.util.*;

public class Ej9{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float pinicial;
    	
    	//pido variable gf
        System.out.println("Indique los grados Farenheit: ");
        pinicial = sc.nextFloat();
        
        //muestro resultado
        System.out.printf("El precio final es %.2f  ",  pinicial-pinicial*0.15 ) ;
    }
}
