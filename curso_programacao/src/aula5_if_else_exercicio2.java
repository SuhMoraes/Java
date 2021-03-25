import java.util.Scanner;

public class aula5_if_else_exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A / B == 0 || B / A == 0) {
			System.out.println("São Múltiplos!");
		}
		else {
			System.out.println("Não são múltiplos!");
		}

	}

}
