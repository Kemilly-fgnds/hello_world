package com.generation.atividades.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class AtividadesController {

	List<String> lista = new ArrayList<>();

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/bsms")
	public List<String> bsms() {
		return List.of("Mentalidades:", "Orientação ao Futuro", "Orientação ao Detalhe", "Responsabilidade Pessoal",
				"Mentalidade de Crescimento", "Habilidades:", "Comunicação", "Proatividade", "Persistência",
				"Trabalho em Equipe");
	}

	@GetMapping("/aprendizado")
	public List<String> aprendizadoSemanal() {
		return List.of("MySQL", "TCP/IP", "Framework Spring");
	}
}
