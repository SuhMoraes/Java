package exEncapsulamento;

public class Cliente {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();		
		pedido.codigo = 20;
		pedido.subtotal = 231.50;
		pedido.desconto = 20;
		
		System.out.println("Código: " + pedido.getCodigo() + ", Subtotal: " + pedido.getSubtotal() + 
				", Desconto: " + pedido.getDesconto() + ", Total: " + pedido.getTotal());
	}

}
