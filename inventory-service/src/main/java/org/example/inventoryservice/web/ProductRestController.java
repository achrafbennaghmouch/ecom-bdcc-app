package org.example.inventoryservice.web;

import org.example.inventoryservice.entities.Product;
import org.example.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class ProductRestController {
  private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/allproducts")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Long id){
        return productRepository.findById(id).get();
    }
}
