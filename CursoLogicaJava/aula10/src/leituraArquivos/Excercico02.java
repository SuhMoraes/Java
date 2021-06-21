package leituraArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Excercico02 {

	public static void main(String[] args) throws IOException {
		Path lista = Paths.get("C:\\Users\\suhal\\OneDrive\\Documentos\\GitHub\\Java\\files-java\\listasDeCompras.txt");
		
		List<String> linhas = Files.readAllLines(lista);
		
		System.out.println("--------------------------");
		System.out.println("     Lista de compras     ");
		System.out.println("--------------------------");
		
		for(int i = 0; i < linhas.size(); i++) {
			String nome = linhas.get(i);
			
			
			System.out.println("Item " + i + ": " + nome);
		}
	}

}
