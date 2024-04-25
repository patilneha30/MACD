//package com.sheryians.major.service.IMPL;
//
//import com.sheryians.major.model.Order;
//import com.sheryians.major.model.OrderStatus;
//import com.sheryians.major.repository.OrderRepository;
//import com.sheryians.major.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderServiceimpl implements OrderService {
//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Override
//    public List<Order> allOrders(){
//        return orderRepository.findAll();
//
//    }
//
//    @Override
//    public Order createOrder(Order order){
//        return orderRepository.save(order);
//    }
//    @Override
//    public void deleteOrderById(Long id){
//        orderRepository.deleteById(id);
//    }
//
//    @Override
//    public void updateOrderStatus(Long id,OrderStatus orderStatus) {
//        Order updatedOrder=orderRepository.findById(id).orElse(null);
////        updatedOrder.setOrderStatus(orderStatus);
//        orderRepository.save(updatedOrder);
//
//    }
//
//}
