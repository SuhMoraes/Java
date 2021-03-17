import java.util.Scanner;

public class Aula2_EntradaDeDados_Double {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Você diigitou: %.2f", x);
		
		
		sc.close();
	}

}
