package com.britney.crud_app.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.britney.crud_app.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
