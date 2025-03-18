package com.product.productController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.productService.productService;

import jakarta.annotation.PostConstruct;


@RestController
//@CrossOrigin(origins ="http://localhost:5500")
public class productController {

     
    @Autowired
    productService Service;

   // @PostConstruct
    //public void init() {
     //   Service.createSampleProducts();
   // }

    @GetMapping("/products")
    public List<Product> getAllProducts(Product products) {
      //  List<Product> products = Service.getAllProducts();
       // model.addAttribute("products", products);
        return Service.getAllProducts();
    }
    }
