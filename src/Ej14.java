import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//14. Desarrolla  un  programa  que  lea  el  valor  del  radio  de  una  circunferencia  y  devuelva  por 
//pantalla el diámetro y el área con una precisión de 3 decimales. 

//diametro = radio*2
//area = pi*radio cuadrado

public class Ej14 {
	public static void main (String args[]) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Ingrese el radio de la circunferencia: ");
		
		double radio = Integer.parseInt(br.readLine());
		
		double diametro = radio * 2;
		
		double area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("El diametro de la circunferencia es: " + diametro);
		System.out.println("El area de la circunferencia es: " + String.format("%.2f", area));
		
		//System.out.println(String.format("%.2f", area));
	}

}
