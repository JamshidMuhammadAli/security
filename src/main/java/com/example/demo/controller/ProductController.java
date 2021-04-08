package com.example.demo.controller;

import com.ali.crud.model.Product;
import com.ali.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {


    @Autowired
    private ProductService service;


    @RequestMapping("/")
    public String ListProductPage(Model model){
        List<Product> list = service.listAll();
        model.addAttribute("list",list);
        return "index";
    }
    @RequestMapping("/productCreate")
    public String createProductPage(Model model){
        model.addAttribute("product", new Product());
        return "newProduct";
    }


}
