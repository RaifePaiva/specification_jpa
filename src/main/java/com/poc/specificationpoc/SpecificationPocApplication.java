package com.poc.specificationpoc;

import com.poc.specificationpoc.model.Categoria;
import com.poc.specificationpoc.model.Produto;
import com.poc.specificationpoc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpecificationPocApplication implements CommandLineRunner {

	//Códígo nesta classe somente para testes

	@Autowired
	private ProdutoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpecificationPocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto p1 = new Produto("Placa xpto1", 359.99, Categoria.ELETRONICOS);
		Produto p2 = new Produto("Placa xpto2", 579.99, Categoria.ELETRONICOS);
		Produto p3 = new Produto("Teclado mecanico", 409.99, Categoria.ELETRONICOS);
		Produto p4 = new Produto("Mouse gamer", 209.99, Categoria.ELETRONICOS);
		Produto p5 = new Produto("Windows 10", 99.99, Categoria.SOFTWARE);
		Produto p6 = new Produto("MAC OS", 159.99, Categoria.SOFTWARE);

		repository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
	}
}
