package escritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivo {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
//		Files.write(path, lines);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Lista " + i + ": ");
			String nome = input.nextLine();
			
			linhas.add(nome);
			
			
		}
		
		Path arquivo = Paths.get("C:\\Users\\suhal\\OneDrive\\Documentos\\GitHub\\Java\\files-java\\arquivo.txt");
		Files.write(arquivo, linhas);
		
		input.close();
		System.out.println("Enviado...");
		

	}

}
