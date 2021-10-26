package com.ecommerce.shop.web.controller;

import com.ecommerce.shop.service.ProductService;
import com.ecommerce.shop.data.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    ProductService productServiceImpl;

    @Autowired
    public ProductController(ProductService productServiceImpl){
       this.productServiceImpl = productServiceImpl;
    }


    @GetMapping("/")
    public List<Product> save(){
        return productServiceImpl.findAll();
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product){
        log.info("Product request --> {}", product);
        return productServiceImpl.save(product);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        productServiceImpl.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
