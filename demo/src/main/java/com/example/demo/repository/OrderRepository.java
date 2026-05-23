package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.OrderResponse;
import com.example.demo.model.Orders;


@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    @Query("""
            SELECT o
            FROM Orders o
            JOIN FETCH o.orderItems oi
            JOIN FETCH oi.product
            WHERE o.user.id = :userId
            AND o.status != 'delivered'
            """)
    public List<Orders> findLastestOrder(Long userId);
   
}
