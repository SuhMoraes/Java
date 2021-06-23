package com.suhmoraes;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 34 11111 11111"));
		LISTA_CONTATOS.add(new Contato("2", "João", "+55 61 00000 11111"));
		LISTA_CONTATOS.add(new Contato("3", "José", "+55 53 22222 0000"));
		LISTA_CONTATOS.add(new Contato("4", "Sônia", "+55 21 01010 2222"));
		LISTA_CONTATOS.add(new Contato("5", "Fernanda", "+55 11 88888 8888"));		
	 }
	
		
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		// Criar uma variável com o nome da página que será renderizada no Browser
		ModelAndView modelAndView = new ModelAndView("listar");
		
		//Passar a lista de contatos no addObject como parâmetro
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
	}
	
	@GetMapping("/contatos/novo")
	public ModelAndView novo() {		
		ModelAndView modelAndView = new ModelAndView("formulario");
	
		modelAndView.addObject("contato",new Contato());
		
		return modelAndView;
	}
	
	@PostMapping("/contatos")
	public String cadastrar(Contato contato) {
		String id = UUID.randomUUID().toString();
		
		contato.setId(id);
		
		LISTA_CONTATOS.add(contato);
		
		return "redirect:/contatos";
		
	}
	
	@GetMapping("/contatos/{id}/editar")
	public ModelAndView editar(@PathVariable String id) {		
		ModelAndView modelAndView = new ModelAndView("formulario");
		
		Contato contato = procurarContato(id);
	
		modelAndView.addObject("contato", contato);
		
		return modelAndView;
	}
	
	@PutMapping("/contatos/{id}")
	public String atualizar(Contato contato) {
		Integer indice = procurarIndiceContato(contato.getId());
		
		Contato contatoVelho = LISTA_CONTATOS.get(indice);
		
		LISTA_CONTATOS.remove(contatoVelho);
		
		LISTA_CONTATOS.add(indice, contato);;
		
		return "redirect:/contatos";
	}
	
	@DeleteMapping("/contatos/{id}")
	public String remover(@PathVariable String id) {
		Contato contato = procurarContato(id);{
			
			LISTA_CONTATOS.remove(contato);
			
			return "redirect:/contatos";
		}
		
	}
	
	
	// ------------------------------------------------- Métodos Auxiliares
	// Método que fará a procura do Id
	public Contato procurarContato(String id) {
		Integer indice = procurarIndiceContato(id);
		
		if (indice != null) {
			Contato contato = LISTA_CONTATOS.get(indice);
			return contato;
		}
		 return null;
	}
	
	//
	public Integer procurarIndiceContato(String id) {
		for(int i = 0; i < LISTA_CONTATOS.size(); i++) {
			Contato contato = LISTA_CONTATOS.get(i);
			
			if(contato.getId().equals(id)) {
				return i;
			}
		}
		 return null;
	}
}
