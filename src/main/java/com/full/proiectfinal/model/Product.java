package com.full.proiectfinal.model;

public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
    private int stock;

    // Constructor fără parametri (necesar pentru Spring și alte framework-uri)
    public Product() {}

    // Constructor cu toți parametrii (pentru inițializarea produselor)
    public Product(String id, String name, String category, double price, int stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getteri și Setteri
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}




