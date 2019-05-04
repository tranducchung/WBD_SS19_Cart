package com.codegym.service.impl;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.CartService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartServiceimpl implements CartService {

    private static Map<Integer,Product> carts;

    static {
        carts = new HashMap<>();
    }

    @Override
    public void save(Product product) {
        if(product.equals(findById(product.getId()))){
            product.setCount(product.getCount()+1);
        }else {
            carts.put(product.getId(),product);
        }
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(carts.values());
    }

    @Override
    public Product findById(int id) {
        return carts.get(id);
    }
}
