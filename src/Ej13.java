import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//13. Programa  que  lea  un  valor  de  grados  centígrados  desde  teclado  y  lo  muestre  en  grados 
//Fahrenheit con una precisión de 1 decimal.


//multiplicar los X grados Celsius por 1,8 y sumarle 32.


public class Ej13 {
	public static void main (String args[]) throws Exception, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Ingrese temperatura en Celsius: ");
		double temperatura = Integer.parseInt(br.readLine());
		
		double conversion = temperatura * 1.8 + 32;
		
		System.out.println("La temperatura en Farenheit es: " + conversion);
		
		
	}

}
