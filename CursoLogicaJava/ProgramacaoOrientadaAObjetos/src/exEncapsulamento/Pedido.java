package exEncapsulamento;

//Crie uma programa que vai, simplesmente, mostrar os dados de um pedido de vendas no console.
//
//O conceito de pedido de vendas ser� abstra�do em uma classe que voc� ir� chamar de Pedido. 
//Essa classe ter� 4 atributos: c�digo, subtotal, desconto e total.
//
//No m�todo main do programa voc� vai criar uma vari�vel que poder� chamar de pedido, do tipo Pedido, e instanciar ela.
//Coloque os valores de cada atributo, da vari�vel pedido, como achar melhor.
//
//Feito isso, mostre todas essas propriedades no console. N�o esque�a de encapsular cada propriedade antes de exibir os 
//dados no console. Isso � para que voc� n�o use as vari�veis diretamente e sim os m�todos getters e setters.
//
//Depois dessa primeira etapa, voc� far� o seguinte... Remova a propriedade total da classe Pedido.
//
//Vai dar um erro nos m�todos getTotal e setTotal. No m�todo getTotal mude a implementa��o de forma que o retorno dele 
//seja a subtra��o da propriedade subtotal pela propriedade desconto.
//
//O m�todo setTotal voc� pode, simplesmente, deix�-lo vazio, pois, n�o ser� mais �til. Em um caso real, ele seria 
//removido de todo o programa aos poucos e sem a necessidade de urg�ncia.
//
//PS: O exerc�cio � feito em dois passos para que voc� perceba a import�ncia do encapsulamento.

public class Pedido {

	Integer codigo;
	
	Double subtotal;
	
	Integer desconto;
	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getTotal() {		
		return subtotal - desconto ;
	}

	
	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}
	
}
