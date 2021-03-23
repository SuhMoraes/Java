import java.util.Scanner;

public class Aula2_EntradaDeDados_Caractere {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		char x;
		
		x = sc.next().charAt(0);
		
		System.out.println("Você diigitou: " + x);
		
		
		sc.close();
	}


}
