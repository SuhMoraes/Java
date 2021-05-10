package aula03;

import java.util.Scanner;

public class aula01_IntroducaoVariaveis {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do Produto");
		
		Double valorProduto = scanner.nextDouble();
		 
		System.out.println("Valor do produto: " + valorProduto);
		
		Double valorProdutoComFrete = valorProduto + (valorProduto / 5);
		
		System.out.println("Valor do Produto com frete: " + valorProdutoComFrete);
		
		scanner.close();
	}
}