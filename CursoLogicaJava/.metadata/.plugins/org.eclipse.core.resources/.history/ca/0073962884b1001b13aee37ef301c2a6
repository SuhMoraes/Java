package aula03;

import java.util.Scanner;

public class aula06_alterandooOValorDaVariavel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a forma de pagamento [1 = à vista / 2 = a prazo ]: ");
		Integer formaPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = formaPagamento.equals(1);
		
		Double juros = 0.0;
		
		Double desconto = 0.0;
		
		if(!pagamentoAVista) {
			juros = 10.0;			
		} 
		
		Double acrescimo = valorProduto * juros / 100;		
		
		
		Double valorTotalJuros =  acrescimo + valorProduto;
		
		System.out.println("Valor total para pagamento a prazo: " + valorTotalJuros);
		
		
		
		scanner.close();

	}

}
