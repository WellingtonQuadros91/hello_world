package com.generation.ListaoObjetivo.controller;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/lista-objetivo")
	public class ListaObjetivo {

	    @GetMapping
	    public String listaObjetivo() {

	        return"|-----Lista de Objetivos----|\n" 

	            + "1ª - Estudar mySQL\n" 
	            + "2ª - Finalizar os exercícios de mySQL\n"
	            + "3ª - Revisar os contéudos de JAVA\n"
	            + "4ª - Pesquisar sobre o Spring Tools\n"
	            + "5ª - Refazer os exercicios\n"

	            + "|----Encerramento---|";


	}
	}

