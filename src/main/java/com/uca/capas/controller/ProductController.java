package com.uca.capas.controller;


import com.uca.capas.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@Controller
public class ProductController {

    private List<Product> products =new ArrayList<Product>(){
        {
            add(new Product(01,"Libro",10));
            add(new Product(02,"Cuaderno",20));
            add(new Product(03,"Lapiz",30));
        }
    };

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("product",new Product());
        mav.addObject("products",this.products);
        return mav;
    }

    @PostMapping("/valido")
    public ModelAndView producto(Product product){
        ModelAndView mav = new ModelAndView();
        Product prod = products.get(product.getId());
        if(prod.getCantidad() < product.getCantidad()){
            mav.setViewName("error");
        }
        else {
            mav.setViewName("compra");
        }
        mav.addObject("product",prod);
        return mav;
    }
}
