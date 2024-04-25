package com.sheryians.major.service;

import com.sheryians.major.model.Order;
//import com.sheryians.major.model.OrderStatus;
import com.sheryians.major.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public List<Order> allOrders(){
        return orderRepository.findAll();
    }

//    Order createOrder(Order order);
    public Order createOrder(Order order){
        return orderRepository.save(order);
    }
    public void deleteOrderById(Long id){
        orderRepository.deleteById(id);
    }
//    void deleteOrderById(Long id);
//    void updateOrderStatus(Long id,OrderStatus orderStatus);

}
