package com.codegym.model;

import java.util.List;

public class Cart {
    private List<Product> product;

    public Cart() {
    }

    public Cart(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }


}
