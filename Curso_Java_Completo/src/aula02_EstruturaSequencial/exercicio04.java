package EstruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
// o valor que recebe por hora e calcula o salário desse funcionário. 
// A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

public class exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numberFunc = sc.nextInt();
		int hourWork = sc.nextInt();
		
		double salary= sc.nextDouble();		
		double totalSalary = hourWork * salary;
		
		System.out.println("NUMBER = " + numberFunc);
		System.out.printf("SALARY = U$ %.2f%n", totalSalary);
		
		sc.close();
	
	}

}
