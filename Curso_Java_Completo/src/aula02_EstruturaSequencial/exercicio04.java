package EstruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
// o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
// A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.

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
