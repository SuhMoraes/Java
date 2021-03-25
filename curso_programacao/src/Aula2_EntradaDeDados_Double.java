import java.util.Locale;
import java.util.Scanner;

public class Aula2_EntradaDeDados_Double {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // ler o número e imprimir com ponto 
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Você diigitou: " + x);
		
		
		sc.close();
	}

}
