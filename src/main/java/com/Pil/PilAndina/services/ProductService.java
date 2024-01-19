
package com.Pil.PilAndina.services;

import com.Pil.PilAndina.Models.Product;
import com.Pil.PilAndina.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getById(Long id) {
        return productRepository.getReferenceById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product sellProduct(Long id, Product product) {

    }

    public Product buyProduct (Long id, Product product) {
        
    }

    public Product updateProduct(Long id, Product product) {
        if (id == null || !productRepository.existsById(id)) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new IllegalArgumentException("Invalid product ID");
        }
        productRepository.deleteById(id);
    }
}