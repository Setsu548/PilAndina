package com.Pil.PilAndina.repository;

import com.Pil.PilAndina.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}