package com.example.demo.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.product;

@Repository
public interface ProductRepository extends JpaRepository<product,Long> {

}
