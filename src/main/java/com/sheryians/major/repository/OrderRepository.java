package com.sheryians.major.repository;

import com.sheryians.major.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
