import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11. Implementa  un  programa  que  dado  un  DNI  (sin  letra)  por  teclado  devuelva  el  DNI  con  la 
//letra correcta.

public class Ej11 {
	
	public static void main(String args[]) throws Exception, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String letra[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		
		System.out.println("Introduzca los 9 digitos del DNI: ");
		int numDni = Integer.parseInt(br.readLine());
						
		int calculaLetra = numDni%23;
		
		
		
		System.out.println("La letra de su DNI es: " + letra[calculaLetra]);
	}

}
