package com.generation.helloword.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsm")
	public List<String> listarBSMs() {
		return Arrays.asList("HABILIDADES: ", "Trabalho em Equipe", "Orientação ao detalhe", "Proatividade",
				"Comunicação",

				"MENTALIDADES: ", "Orientação ao Futuro", "Responsabilidade Pessoal", "Mentalidade de Crescimento",
				"Persistência");

	}

	@GetMapping("/objetivos")
	public List<String> listarObjetivos() {
		return Arrays.asList("Praticar a linguagem Java", "Praticar Spring", "Praticar exercicios de MySQL",
				"Desenvolver alguns projetos");
	}
}
