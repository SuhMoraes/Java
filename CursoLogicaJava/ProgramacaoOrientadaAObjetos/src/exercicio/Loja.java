package exercicio;

//Crie um programa que contenha um m�todo que verifique a necessidade de repor o estoque de determinado produto em 
//uma loja qualquer. Considere que a quantidade m�nima de um produto deva ser 10. Se o estoque for menor que isso, 
//ent�o ele retornar� *true*, pois, ser� necess�ria a reposi��o do estoque, caso contr�rio, ele retornar� false.
//
//Como par�metro, esse m�todo dever� receber um tipo que voc� ir� criar e chamar de Produto, ou seja, voc� vai criar 
//uma classe chamada Produto com os atributos necess�rios. Os atributos da classe ser�o nome e quantidadeEstoque.
//
//Feito isso, implemente o m�todo main do programa. Nele voc� vai criar uma vari�vel do tipo Produto e depois usar essa
//vari�vel para invocar o m�todo que valida a necessidade de reposi��o de estoque.
//
//No final, voc� vai exibir, no console, se � necess�ria a reposi��o ou n�o.

public class Loja {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Ipad 8";
		produto.quantidadeEstoque = 12;
		
		System.out.println("Necess�rio repor estoque do produto " + produto.nome + " ? " + reposicaoEstoque(produto));
		

	}

	static Boolean reposicaoEstoque(Produto produto) {
		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}
