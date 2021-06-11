package EstruturaIf;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o mês: ");
		Integer mes = scanner.nextInt();
		
		Double desconto = 0.0;
		
		switch(mes) {
		case 1: desconto = 4.0;
			break;
		case 2: desconto = 8.0;
			break;
		case 3: desconto = 12.0;
			break;
		case 4: desconto = 16.0;
			break;
		case 5: desconto = 20.0;
			break;
		case 6: desconto = 24.0;
			break;
		case 7: desconto = 28.0;
			break;	
		case 8: desconto = 32.0;
			break;
		case 9: desconto = 36.0;
			break;
		case 10: desconto = 40.0;
			break;
		case 11: desconto = 44.0;
			break;	
		case 12: desconto = 0.0;
			break;
		default:
			System.err.println("Digite um mês válido!");
			System.exit(0);
		}
		System.out.println("Seu desconto será de: " + desconto + "%" );
		
		
		scanner.close();
	}

}
