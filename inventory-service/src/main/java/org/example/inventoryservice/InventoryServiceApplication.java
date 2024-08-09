package org.example.inventoryservice;

import org.example.inventoryservice.entities.Product;
import org.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
           productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("TV").price(1238).quantity(32).build());
           productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("PC").price(2238).quantity(32).build());
           productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Phone").price(4234).quantity(32).build());


        };
    }
}
