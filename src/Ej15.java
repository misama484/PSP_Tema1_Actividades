import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//15. Amplia  el  programa  anterior  para  que  devuelve  el  volumen  de  una  esfera  definida  por  el 
//mismo radio.

public class Ej15 {
	public static void main (String args[]) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Ingrese el radio de la circunferencia: ");
		
		double radio = Integer.parseInt(br.readLine());
		
		double diametro = radio * 2;
		
		double area = Math.PI * Math.pow(radio, 2);
		
		double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
		
		System.out.println("El diametro de la circunferencia es: " + diametro);
		System.out.println("El area de la circunferencia es: " + String.format("%.2f", area));
		System.out.println("El volumen de la circunferencia es: " + String.format("%.2f", volumen));
		
		
		//System.out.println(String.format("%.2f", area));
	}

}

