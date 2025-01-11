package com.full.proiectfinal.controller;

import com.full.proiectfinal.model.Product;
import com.full.proiectfinal.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("product", new Product()); // Pregătește obiectul pentru formular
        return "index";
    }

    @PostMapping("/add")
    public String addOrUpdateProduct(@ModelAttribute Product product) {
        productService.addOrUpdateProduct(product);
        return "redirect:/";
    }
}



