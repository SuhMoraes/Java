package estruturaCondicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
		 System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		
		sc.close();
	}
}
