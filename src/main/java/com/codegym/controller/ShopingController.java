package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.CartService;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("cart")
public class ShopingController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @ModelAttribute("cart")
    public Cart setUpCart(){
        return new Cart();
    }

    @GetMapping("/shop")
    public String showListProduct(Model model){
        model.addAttribute("products",productService.findAll());
        return "list";
    }
    @GetMapping("/buy-product/{id}")
    public String BuyProduct(@PathVariable int id,Model model,@ModelAttribute("cart") Cart cart){
        Product product = productService.findById(id);
        cartService.save(product);
        cart.setProduct(cartService.findAll());
        model.addAttribute("productC",cart.getProduct());
        return "cart";
    }
}
