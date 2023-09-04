package com.getinfy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getinfy.entity.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{

}
