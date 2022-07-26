package com.projetobd.projBd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetobd.projBd.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
