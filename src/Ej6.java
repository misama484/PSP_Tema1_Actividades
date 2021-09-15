import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//6. Realiza un programa que lea cinco números desde teclado y muestre la suma por pantalla. Sugerencia: utilizar una estructura de bucle. 

public class Ej6 {
	public static void main(String args[]) throws IOException {
		
		System.out.println("--Suma de 5 numeros--");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		int suma = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("ingrese un numero");
			String numero = br.readLine();
			int num1 = Integer.parseInt(numero);
			suma += num1;
		}
		
		
		System.out.println("La suma de los 5 numeros introducidos es " + suma);
	}

	

}
