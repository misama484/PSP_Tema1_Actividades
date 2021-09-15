import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//17. Realiza un programa que controle los requisitos de una contraseña introducida por teclado 
//(mínimo 5 caracteres, 1 número y 1 letra mayúscula). 


public class Ej17 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Introduzca Password (minimo 5 caracteres, 1 numero y 1 mayuscula): ");
		
		String pass = br.readLine();
		
		char letra;
		int num = 0;
		int may = 0;
		
		
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
