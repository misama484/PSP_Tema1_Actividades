import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//18. Amplía el programa anterior haciendo que el usuario repita la contraseña y comprobando 
//que lo ha hecho correctamente. 

public class Ej18 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		char letra;
		int num = 0;
		int may = 0;
		String pass;
		String pass2;
		Boolean test = false ;
		
		do {
		System.out.println("Introduzca Password (minimo 5 caracteres, 1 numero y 1 mayuscula): ");
		
		pass = br.readLine();
		
		System.out.println("Vuelva a introducir el password: ");
		
		pass2 = br.readLine();
		//COMPROBAMOS QUE AMBAS PASSWORDS SON IGUALES
			
		if(pass.equals(pass2)) {
			test = true;
		}
		}while(test = false);
			
		//AQUI LOCALIZAMOS LA MAYUSCULA Y NUMERO
		for(int i = 0; i<pass.length(); i++) {
			//asignamos a letra en cada iteracion el char de pass.
			letra = pass.charAt(i);
			
			//convierte el char en string
			String valorPass = String.valueOf(letra);
			//buscamos mayusculas y numeros
			if(valorPass.matches("[A-Z]")) {
				may++;
			}
			else if(valorPass.matches("[0-9]")) {
				num++;
			}
			
		}
		
		//AQUI VALIDAMOS LA LONGITUD Y LA MAYUSCULA Y NUMERO
		
		if(pass.length()>=5) {
			//comprobamos las mayusculas
			if(may >= 1) {
				//comprobamos el numero
				if(num >= 1) {
					System.out.println("Enhorabuena, el password cumple con los parametros");
				}else {
					System.out.println("Como minimo debe tener un numero. ");
				}
				
			}else {
				System.out.println("Debe contener al menos una mayuscula. ");
			}
			
		}else {
			System.out.println("Introduzca minimo 5 caracteres. ");
		}
		

	}

}
