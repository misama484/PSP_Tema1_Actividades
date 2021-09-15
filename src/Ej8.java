import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8. Desarrolla un programa que lea por teclado un número del 1 al 12 e indique por pantalla a 
//qué mes del año en texto corresponde. Sugerencia: utilizar una estructura de programación if ... else
public class Ej8 {
	public static void main (String args[]) throws Exception, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Escriba el numero de mes: ");
		
		int mes = Integer.parseInt(br.readLine());
		
		if(mes == 1) {
			System.out.println("El mes 1 es Enero. ");
		}
		else if(mes ==2) {
			System.out.println("El mes 2 es Febrero. ");
		}
		else if(mes ==3) {
			System.out.println("El mes 3 es Marzo. ");
		}
		else if(mes ==4) {
			System.out.println("El mes 4 es Abril. ");
		}
		else if(mes == 5) {
			System.out.println("El mes 5 es Mayo. ");
		}
		else if(mes == 6) {
			System.out.println("El mes 6 es Junio. ");
		}
		else if(mes == 7) {
			System.out.println("El mes 7 es Julio. ");
		}
		else if(mes == 8) {
			System.out.println("El mes 8 es Agosto. ");
		}
		else if(mes == 9) {
			System.out.println("El mes 9 es Semptiembre. ");
		}
		else if(mes == 10) {
			System.out.println("El mes 10 es Octubre. ");
		}
		else if(mes == 11) {
			System.out.println("El mes 11 es Noviembre. ");
		}
		else if(mes == 12) {
			System.out.println("El mes 12 es Diciembre. ");
		}
		else {
			System.out.println("Ese mes no existe");
		}
		
	}
}
