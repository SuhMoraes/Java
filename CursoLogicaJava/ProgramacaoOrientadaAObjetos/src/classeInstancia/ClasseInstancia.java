package classeInstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		
		System.out.println("Quantidade mínima estoque: " + Produto.quantidade_minima_estoque);
		
		Produto produto = new Produto();
		produto.quantidade_minima_estoque = 20;
		produto.nome = "Livro";
		
		System.out.println("Quantidade mínima estoque: " + Produto.quantidade_minima_estoque);
	
		
		
		Produto produto2 = new Produto();
		
		System.out.println("Quantidade mínima estoque: " + Produto.quantidade_minima_estoque);
		produto2.nome = "Smarthone";
		
		System.out.println("Produto 1: " + produto.nome);
		System.out.println("Produto 2: " + produto2.nome);
	}
	
	

}
