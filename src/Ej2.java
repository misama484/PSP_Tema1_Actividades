
//2. Programa  Java  que  lea  un nombre  desde  teclado  y muestre  por  pantalla  un mensaje  tipo “Hola xxxxx”.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej2 {
	public static void main (String args[]) throws IOException {
		
		System.out.println("Ingrese nombre: ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String nombre = br.readLine();
		
		System.out.println("Hola " + nombre);
		
	}

}
