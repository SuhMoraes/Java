import java.util.Locale;
import java.util.Scanner;

public class Aula2_EntradaDeDados_Double {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // ler o n�mero e imprimir com ponto 
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Voc� diigitou: " + x);
		
		
		sc.close();
	}

}
