import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//22. Modifica  el  programa  anterior  para  que  almacene  en  una  estructura  el  nombre  de  un 
//número cualquiera de personas, introducidos por teclado de uno en uno. La condición de 
//finalización es introducir un 0 por teclado.

public class Ej22 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		List <String> personas = new ArrayList<String>();
		String nombre;
		String numero = null;
		
		System.out.println("Introduzca los nombres deseados, pulse 0 para finalizar: ");
		
		do {			
			nombre = br.readLine();
		
			personas.add(nombre);
			
		}while(numero != "0");	//TODO no reconoce el 0 como string, no cierra el bucle.
		
		personas.forEach(System.out::println);
	}

}
