package EstruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
// c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

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
