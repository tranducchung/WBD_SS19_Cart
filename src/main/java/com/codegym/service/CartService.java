package com.codegym.service;

import com.codegym.model.Cart;
import com.codegym.model.Product;

import java.util.List;

public interface CartService {
    void save(Product product);

    List<Product> findAll();

    Product findById(int id);
}
