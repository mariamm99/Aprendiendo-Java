package a1.secuenciales;
/**
*@author María Moreno Muñoz

@Fecha 02/11/2019

Ejercicio  8. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
      el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que 
      realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

Variable a usar:
	* sbase
	* venta1
	* venta2
	* venta3
	* comision
	* stotal = salario total

**/
import java.util.*;

public class Ej8{
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//declaro variables
    	Float sbase;
    	Float venta1;
    	Float venta2;
    	Float venta3;
    	double comision;
    	double stotal;
    	
    	//pido variables
        System.out.println("Indique venta 1: ");
        venta1 = sc.nextFloat();
        System.out.println("Indique venta 2: ");
        venta2 = sc.nextFloat();
        System.out.println("Indique venta 3: ");
        venta3 = sc.nextFloat();
        System.out.println("Indique salario base: ");
		sbase = sc.nextFloat();

        //operaciones
        comision= (venta1 + venta2 + venta3)*0.1;
        stotal = comision + sbase;
        
        //muestro resultados
        System.out.printf("La comisión obtenida es %.2f euros", comision );
        
        System.out.printf("El salario total es %.2f euros ", stotal);

    }
}
