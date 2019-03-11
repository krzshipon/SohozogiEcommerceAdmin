package com.shipon.ecommerce.controller;

import com.shipon.ecommerce.DAO.ProductRepo;
import com.shipon.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @RequestMapping("save")
    public String saveProduct(Product product){
        System.out.println(product);
        productRepo.save(product);

        return "redirect:/home";
    }

    @RequestMapping("dash")
    public String gotoDash(){
        return "productlist";
    }

    @RequestMapping("/")
    public String home(){
        return "login";
    }
}
