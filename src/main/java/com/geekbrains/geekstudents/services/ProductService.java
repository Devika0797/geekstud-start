package com.geekbrains.geekstudents.services;

import com.geekbrains.geekstudents.entities.Product;
import com.geekbrains.geekstudents.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        Product product = productRepository.myQuery(1L);
        List<Product> products = new ArrayList<>();
        products.add(product);
        return products;
    }


}
