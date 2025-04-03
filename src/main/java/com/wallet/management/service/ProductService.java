package com.wallet.management.service;

import com.wallet.management.model.Product;
import com.wallet.management.repository.ProductRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Service class which takes complete care of product entity data
 *
 * @author Saivarma Akarapu
 */
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Method to get product object by unique id probably product id
     * @param productId ID of the product to get from the database
     * @return Optional of Product object
     */
    @Cacheable(value = "products", key = "#productId", unless = "#result == null")
    public Product getProductById(int productId) {
        System.out.println("About to call repository method to get the product details");
        return productRepository.findById(productId).orElse(null);
    }

    /**
     * Method to add a product to the database
     * @param productName Name of the product sent by the API user
     * @return A string which is actually a success message of add product
     */
    public String addProduct(String productName) {
        Product product = productRepository.save(new Product(productName));

        return "Product saved successfully with id: " + product.getProductId();
    }
}
