package com.wallet.management.controller;

import com.wallet.management.model.Product;
import com.wallet.management.service.ProductService;
import org.springframework.web.bind.annotation.*;

/**
 * Controller to handle request to create or modify product entities
 *
 * @author Saivarma Akarapu
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * API to get product object by product id
     * @param id which is actually product id for unique identification
     * @return Optional of Product object
     */
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProductById(id);
    }

    /**
     * Method to add a product object to the database
     * @param productName Name of the product to create a Product object in order to save into DB
     * @return A message that shows status of product object insertion with product id
     */
    @PostMapping("/addProduct")
    public String addAProduct(@RequestParam String productName) {
        return productService.addProduct(productName);
    }

}
