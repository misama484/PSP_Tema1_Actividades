import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//3. Realiza un programa que lea dos números desde teclado y muestre la suma por pantalla

public class ej3 {
	public static void main(String args[]) throws IOException {			
			
			System.out.println("Ingrese un numero: ");
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String numero = br.readLine();
			
			int num1 = Integer.parseInt(numero);
			
			System.out.println("Ingrese un numero: ");
			
			numero = br.readLine();
			
			int num2 = Integer.parseInt(numero);
			
			int suma = num1 + num2;
			
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + suma);		
		
		
	}

}
