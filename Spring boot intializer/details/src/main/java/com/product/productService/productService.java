package com.product.productService;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repositary.productRepositary;

@Service
@EnableAutoConfiguration
public class productService {
	 @Autowired
	
	  public Scanner sc =new Scanner(System.in);
	    productRepositary productRepository;
	

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	     
	    public void getProducts() {
	        for (int i = 1; i <= 30; i++) {
	            Product product = new Product();
	            product.setName(sc.next() + i);
	            product.setDescription(sc.next() + i);
	            product.setPrice(sc.nextByte() * 10.0);
	            productRepository.save(product);
	            
	        }
	    }
	}

