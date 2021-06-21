package escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while (true) {
			System.out.print("Tarefa " + i + ": ");
			tarefa = input.nextLine();
			
			if ("x".equals(tarefa)) {
				break; 
			}

			linhas.add(tarefa);
			i++;
		}

		escreverNoArquivo("C:\\Users\\suhal\\OneDrive\\Documentos\\GitHub\\Java\\files-java\\arquivo.txt", linhas);

		input.close();
		
		System.out.println("Fim...");
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}

}
