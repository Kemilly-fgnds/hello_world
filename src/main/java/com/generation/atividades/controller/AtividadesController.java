package com.generation.atividades.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class AtividadesController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/bsms")
    public List<String> bsms() {
        List<String> lista = new ArrayList<>();
        lista.add("Mentalidades:");
        lista.add("Orientação ao Futuro");
        lista.add("Orientação ao Detalhe");
        lista.add("Responsabilidade Pessoal");
        lista.add("Mentalidade de Crescimento");
        lista.add("Habilidades:");
        lista.add("Comunicação");
        lista.add("Proatividade");
        lista.add("Persistência");
        lista.add("Trabalho em Equipe");
        return lista;
    }

    @GetMapping("/aprendizado")
    public List<String> aprendizadoSemanal() {
        List<String> lista = new ArrayList<>();
        lista.add("MySQL");
        lista.add("TCP/IP");
        lista.add("Framework Spring");
        return lista;
	}
}
