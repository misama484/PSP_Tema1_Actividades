import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ej12 {
public static void main(String args[]) throws Exception, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		List<Integer> suspenso = new ArrayList<Integer>();
		List<Integer> aprobado = new ArrayList<Integer>();
		List<Integer> notable = new ArrayList<Integer>();
		List<Integer> sobresaliente = new ArrayList<Integer>();
		List<Integer> matricula = new ArrayList<Integer>();
		
		for(int i = 0; i<10; i++) {
			
			System.out.println("Ingrese la nota del alumno:");
			
			int nota = Integer.parseInt(br.readLine());
						
			if(nota < 5) {
				suspenso.add(nota);
			}
			else if(nota >= 5 && nota < 6) {
				aprobado.add(nota);
			}
			else if(nota >= 6 && nota < 8) {
				notable.add(nota);
			}
			else if(nota >= 8 && nota <= 9) {
				sobresaliente.add(nota);
			}
			else if(nota > 9 && nota <= 10) {
				matricula.add(nota);
			}
			else {
				System.out.println("Nota no valida");
			}
		}
		System.out.println("suspensos: " + suspenso.size());
		System.out.println("aprobados: " + aprobado.size());
		System.out.println("notables: " + notable.size());
		System.out.println("sobresalientes: " + sobresaliente.size());
		System.out.println("matriculas: " + matricula.size());
	}

}
