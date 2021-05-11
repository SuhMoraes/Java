package aula04;

//Faça um programa que receba:
//
//O valor da conta de luz
//Conta de água
//Conta de telefone
//Escola do filho
//Fatura do cartão
//Gastos com supermercado
//... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".

import java.util.Scanner;

public class Ex_GastoFamiliar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite abaixo as contas de casa desse mês...");
		
		Double gastosCasa = 0.0;
		
		System.out.print("Conta de Luz: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Conta de Água: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Conta de Telefone: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Colégio: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Fatura cartão: ");
		gastosCasa += scanner.nextDouble();
		
		System.out.print("Supermecado: ");
		gastosCasa += scanner.nextDouble();
		
		
		System.out.println("Total de despesas: " + gastosCasa);
		
		
		
		scanner.close();
	}

}
