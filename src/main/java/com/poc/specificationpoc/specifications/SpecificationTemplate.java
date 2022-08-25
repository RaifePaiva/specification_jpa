package com.poc.specificationpoc.specifications;

import com.poc.specificationpoc.model.Produto;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

public class SpecificationTemplate {

    @And(
            {
                    @Spec(path = "categoria", spec = Equal.class),
                    @Spec(path = "descricao", spec = Like.class)
            }
    )
    public interface ProdutoSpec extends Specification<Produto>{}

}
