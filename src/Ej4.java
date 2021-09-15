import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//4. Programa que lea dos números desde teclado y muestre el menor y el mayor en pantalla. Si son iguales deberá mostrar un mensaje indicándolo.
public class Ej4 {
	public static void main(String args[]) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Ingrese un numero a comparar: ");
		
		String numero = br.readLine();
		
		int num1 = Integer.parseInt(numero);
		
		System.out.println("Ingrese el siguente numero a comparar: ");
		
		numero = br.readLine();
		
		int num2 = Integer.parseInt(numero);
		
		if(num1>num2) {
			System.out.println("El numero " + num1 + " es mayor.");
			System.out.println("El numero " + num2 + " es menor.");
			
		}
		
		else if(num1 < num2) {
			System.out.println("El numero " + num2 + " es mayor.");
			System.out.println("El numero " + num1 + " es menor.");
		}
		
		else if(num1 == num2){
			System.out.println("Ambos numeros son iguales.");
		}
		
		
	}

}
