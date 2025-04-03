package com.wallet.management.repository;

import com.wallet.management.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class to handle DAO for product entity
 *
 * @author Saivarma Akarapu
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
