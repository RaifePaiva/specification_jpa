package com.poc.specificationpoc.resource;

import com.poc.specificationpoc.model.Produto;
import com.poc.specificationpoc.repository.ProdutoRepository;
import com.poc.specificationpoc.specifications.SpecificationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public ResponseEntity<List<Produto>> buscaProdutosSpecification(SpecificationTemplate.ProdutoSpec spec){
        List<Produto> produtos = repository.findAll(spec);
        return ResponseEntity.ok().body(produtos);
    }

}
