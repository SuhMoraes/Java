package EstruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int numberParts = sc.nextInt();
		double value = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int numberParts2 = sc.nextInt();
		double value2 = sc.nextDouble();
		
		double totalValue = (numberParts * value) + (numberParts2 * value2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalValue);
		
		sc.close();
		
	}

}
