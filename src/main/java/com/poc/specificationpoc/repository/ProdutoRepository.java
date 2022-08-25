package com.poc.specificationpoc.repository;

import com.poc.specificationpoc.model.Produto;
import com.poc.specificationpoc.specifications.SpecificationTemplate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long>, JpaSpecificationExecutor<Produto> {
    List<Produto> findAll(Specification<Produto> spec);
}
