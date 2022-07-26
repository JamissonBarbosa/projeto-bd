package com.projetobd.projBd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobd.projBd.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
