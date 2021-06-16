package primeiraClasse;

public class PrimeiraClasse {
	
	// Estrutura do programa

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		// Colocando valores nas propriedades do objeto produto
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.00;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
		
		

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto " + produto.nome + " é de "  + produto.quantidade + " unidade(s) ");
	}

}
