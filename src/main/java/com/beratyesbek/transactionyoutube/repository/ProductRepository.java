package com.beratyesbek.transactionyoutube.repository;


import com.beratyesbek.transactionyoutube.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
