package aula04;

import java.util.Scanner;

public class Ex_DescontoFrete {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual o valor do Produto: ");
		Double precoProduto = scanner.nextDouble();
		
		Boolean comFrete = precoProduto < 100;
		
		Double total = precoProduto;
		
		if(comFrete) {
			total += 15.00;
		}
		 
		
		System.out.print("Valor total: " + total);
		
		scanner.close();
	}

}
