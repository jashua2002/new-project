package com.product.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository
public interface productRepositary extends JpaRepository< Product, Integer> {

}
