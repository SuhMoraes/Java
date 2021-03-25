import java.util.Scanner;

public class aula5_if_else_exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		
		number = sc.nextInt();	
		
		
		if(number % 2 == 0) {
			System.out.println("Par!");
		}else {
			System.out.println("Ímpar!");
		}
		
		sc.close();
	}
	
	
}
