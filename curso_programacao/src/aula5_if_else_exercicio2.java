import java.util.Scanner;

public class aula5_if_else_exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A / B == 0 || B / A == 0) {
			System.out.println("S�o M�ltiplos!");
		}
		else {
			System.out.println("N�o s�o m�ltiplos!");
		}

	}

}
