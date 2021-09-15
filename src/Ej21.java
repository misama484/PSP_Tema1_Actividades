import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//21. Crea  un  programa  que  almacene  en  una  estructura  el  nombre  de  5  personas  que  se  irán 
//introduciendo por teclado de uno en uno.

public class Ej21 {

	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		String personas [] = new String [5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Introduce un nombre: ");
			personas[i] = br.readLine();
			
		}
		
		for(int i=0; i<5; i++) {
			
			System.out.println(personas[i]);
		}
		

	}

}
