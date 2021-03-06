package com.digitalinnovationone.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data // Getter e Setter, bem melhor e mais limpo assim.
@Document(indexName = "product", type = "catalog")
public class Product {

    @Id 
    private Integer id;
    private String name;
    private Integer amount;

}
