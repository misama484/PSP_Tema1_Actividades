import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//16. Escribe un programa que dada la fecha de nacimiento de una persona devuelva su número 
//de la suerte (utiliza el algoritmo de cálculo que prefieras). 

public class Ej16 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		//Solicitamos datos al usuario
		System.out.println("Introduce el dia que naciste: ");
		
		int dia = Integer.parseInt(br.readLine());
	
		
		System.out.println("Introduce el mes que naciste: ");
		
		int mes = Integer.parseInt(br.readLine());
		
				
		System.out.println("Introduce el año que naciste: ");
		
		int anyo = Integer.parseInt(br.readLine());
		
		int suma = dia + mes + anyo;
		
		int num1 = suma/1000;
		int num2 = suma/100%10;
		int num3 = suma/10%10;
		int num4 = suma%10;
		
		int numSuerte = num1 + num2 + num3 + num4;
		
		System.out.println("Su numero de la suerte es el: " + numSuerte);
	}

}
