import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9. Desarrolla un programa que lea por teclado un número del 1 al 12 e indique por pantalla a 
//qué mes del año en texto corresponde. Utilizar una estructura de programación distinta a if ... else
public class Ej9 {
	public static void main(String args[]) throws Exception, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Escriba el numero de mes: ");
		
		int mes = Integer.parseInt(br.readLine());
		
		switch(mes) {
		case 1:
			System.out.println("El mes 1 es Enero. ");
			break;
		case 2:
			System.out.println("El mes 2 es Febrero. ");
			break;
		case 3:
			System.out.println("El mes 3 es Marzo. ");
			break;
		case 4:
			System.out.println("El mes 4 es Abril. ");
			break;
		case 5:
			System.out.println("El mes 5 es Mayo. ");
			break;
		case 6:
			System.out.println("El mes 6 es Junio. ");
			break;
		case 7:
			System.out.println("El mes 7 es Julio. ");
			break;
		case 8:
			System.out.println("El mes 8 es Agosto. ");
			break;
		case 9:
			System.out.println("El mes 9 es Semptiembre. ");
			break;
		case 10:
			System.out.println("El mes 10 es Octubre. ");
			break;
		case 11:
			System.out.println("El mes 11 es Noviembre. ");
			break;
		case 12:
			System.out.println("El mes 12 es Diciembre. ");
			break;
		
		}
	}

}
