import java.util.Scanner;

public class Aula4_Input_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou: "+ x);
		
		//Encerra o recurso que criamos
		sc.close();
	 
	}

}
