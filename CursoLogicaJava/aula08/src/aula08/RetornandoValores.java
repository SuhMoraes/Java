package aula08;

public class RetornandoValores {

	public static void main(String[] args) {
		
		Double[] premissaInicial = new Double[] {725.0, 100.00};
		Double proporcao = 35.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
	System.out.println("Resultado: " + resultadoFinal);
	
	}
	
	
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado =  (premissa[0] * proporcao) / premissa[1];
		return resultado;
	}
	
}
