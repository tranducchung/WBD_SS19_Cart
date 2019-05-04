package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.ProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceimpl implements ProductService {

    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Apple",100,1));
        products.put(2,new Product(2,"Banana",150,1));
        products.put(3,new Product(3,"Demon",200,1));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
