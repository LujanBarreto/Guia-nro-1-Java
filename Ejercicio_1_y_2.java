
public class Ejercicio_1_y_2 {

	public static void main(String[] args) {
		int variableInicio = 5;
		int variableFinal = 14;
		boolean imprimirPares = false;
		
		while (variableInicio <= variableFinal) {
			if (imprimirPares == true) {
				if (variableInicio %2 == 0) {
					System.out.print(variableInicio + " ");
				}
			}else {
				if (variableInicio %2 != 0) {
					System.out.print(variableInicio + " ");
				}
			}
			variableInicio++;
		}
		/* punto d) con estructura for */
		int variableInicio = 14, variableFinal = 5;
		for (int i=variableInicio ; i>=variableFinal ; i--) {
			if (i%2==0) {
				System.out.print( i+" ");
			}
		}
	}
}

package Ejercitacion2;

public class SegundoPunto {
	public static void main(String[] args){ 
		float ingresos = 25000;
		int vehiculos = 5;
		int antiguedadVehiculo = 5;
		int inmuebles = 1;
		boolean embarcacion = false;
		boolean aeronaveDeLujo = false;
		boolean tituloSocietario = false;
		
		if ( (ingresos >= 489083) ||
				(vehiculos >= 3 && antiguedadVehiculo <= 5) ||
				(inmuebles >= 3) || 
				(embarcacion || aeronaveDeLujo || tituloSocietario == true) ) {
				System.out.println("Categoria Ingresos Altos");
				} else {
					System.out.print("No es Categoria de Ingresos Altos");
				}
}
