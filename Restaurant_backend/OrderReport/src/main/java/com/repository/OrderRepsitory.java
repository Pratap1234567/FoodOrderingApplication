package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Order;

@Repository
public interface OrderRepsitory extends JpaRepository<Order, Integer>{
	
	

}
