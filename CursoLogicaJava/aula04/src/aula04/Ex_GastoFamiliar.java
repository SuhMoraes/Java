package aula04;

//Fa�a um programa que receba:
//
//O valor da conta de luz
//Conta de �gua
//Conta de telefone
//Escola do filho
//Fatura do cart�o
//Gastos com supermercado
//... e mostre o gasto total que a fam�lia teve no m�s. N�o esque�a de usar muito o operador "+=".

import java.util.Scanner;

public class Ex_GastoFamiliar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite abaixo as contas de casa desse m�s...");
		
		Double gastosCasa = 0.0;
		
		System.out.print("Conta de Luz: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Conta de �gua: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Conta de Telefone: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Col�gio: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Fatura cart�o: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Supermecado: ");
		gastosCasa += scanner.nextDouble();
		
		
		System.out.println("Total de despesas: " + gastosCasa);
		
		
		
		scanner.close();
	}

}
