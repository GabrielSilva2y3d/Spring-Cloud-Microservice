package com.digitalinnovationone.productcatalog.controller;

import com.digitalinnovationone.productcatalog.model.Product;
import com.digitalinnovationone.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping // assim é melhor do que usar method.POST tem o mesmo efeito
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }

    @GetMapping(value = "/name/{name}")
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }
  
}
