package com.full.proiectfinal.service;

import com.full.proiectfinal.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        // Adaugă produse existente cu preț și stoc
        products.add(new Product("1", "Laptop", "Electronics", 2500.0, 10));
        products.add(new Product("2", "Phone", "Electronics", 1000.0, 10));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(String id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addOrUpdateProduct(Product product) {
        Product existingProduct = getProductById(product.getId());
        if (existingProduct != null) {
            // Dacă produsul există, actualizăm stocul
            existingProduct.setStock(existingProduct.getStock() + product.getStock());
        } else {
            // Dacă produsul nu există, îl adăugăm
            products.add(product);
        }
    }
}





