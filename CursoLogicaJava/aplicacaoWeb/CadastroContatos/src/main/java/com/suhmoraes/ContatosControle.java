package com.suhmoraes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContatosControle {
		
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/formulario")
	public String formulario() {
		return "formulario";
	}
	

}
