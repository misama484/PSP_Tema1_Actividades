import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Realiza un programa que lea cinco números desde teclado y muestre la suma por pantalla. 
//Sugerencia: utilizar una estructura de bucle. 
//7. Resolver el ejercicio anterior empleando otra estructura de bucle.

public class Ej7 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		List<Integer> suma = new ArrayList<Integer>();
		int total = 0;
		
	
		do {
			System.out.println("Ingrese un numero: ");
			int numero = Integer.parseInt(br.readLine());			
			suma.add(numero);
			
		
		}
		while(suma.size() != 5);
		
		for(int sum : suma) {
			total += sum;
		}
		System.out.println("La suma de los numeros: " + suma + " es de: " + total);
		
		}

}
