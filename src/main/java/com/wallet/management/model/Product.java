package com.wallet.management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * Entity that is responsible for product table
 *
 * @author Saivarma Akarapu
 */
@Data
@Entity
@Table(name = "product")
@NoArgsConstructor
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = -3242031117562485368L;

    /**
     * ID of the product
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    /**
     * Name of the product
     */
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

}
