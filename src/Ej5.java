import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//5. Realiza  un  programa  que  lea  dos  números  desde  teclado  en  un  bucle  repetitivo.  El  bucle deberá finalizar cuando los números leídos sean iguales.

public class Ej5 {
	public static void main(String args[]) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int num1;
		int num2;
		
		do {
		System.out.println("Ingrese el primer nuemro: ");
		String numero = br.readLine();
		num1 = Integer.parseInt(numero);
		
		System.out.println("Ingrese el segundo numero: ");
		numero = br.readLine();
		num2 = Integer.parseInt(numero);
		}
		
		while(num1 != num2);
		
		System.out.println("Enhorabuena, son iguales!");
	}

}
