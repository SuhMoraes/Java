package aula07;

public class vetores2Dimensoes {

	public static void main(String[] args) {
		
		Double faturamentoDia = 1000.0;
		
		Double[] faturamentoJaneiro = new Double[] {1500.00, 900.00, 750.00};
		Double[] faturamentoFeveiro = new Double[] {3200.00, 4000.00, 2100.00};
		Double[] faturamentoMarco = new Double[] {1800.00, 2000.00, 100.00};
		
		Double[][] faturamentoPrimeiroTrimestre = new Double[][] {faturamentoJaneiro, faturamentoFeveiro, faturamentoMarco};
		
		// Acesso o Array do primeiro dia de Janeiro
//		System.out.println("Faturamento do dia 1° de Janeiro: " + faturamentoPrimeiroTrimestre[0][0]);
//		System.out.println("Faturamento do dia 3° de Fevereiro: " + faturamentoPrimeiroTrimestre[1][2]);

		
		// Percorrer o Array
		
		for(int i = 0; i < faturamentoPrimeiroTrimestre.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoPrimeiroTrimestre[i];
			
			for(int x = 0; x < mes.length; x++) {
				Double dia = mes[x];
				System.out.println("Dia " +( x + 1) +  ": " + dia);
			}
		}
	}

}
