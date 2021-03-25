import java.util.Scanner;

public class aula05_if_else_exercicios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		
	   number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("Negativo");			
		} else {
			System.out.println("Não negativo");
		}
	}

}
