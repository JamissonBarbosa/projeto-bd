package com.projetobd.projBd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobd.projBd.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
