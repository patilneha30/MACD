package com.sheryians.major.controller;

import com.sheryians.major.model.Order;
//import com.sheryians.major.model.OrderStatus;
import com.sheryians.major.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/allOrders")
    public List<Order> allOrders(){
        return orderService.allOrders();
    }

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);

    }
    @DeleteMapping("/deleteOrder/{id}")
    public String deleteOrderById(@PathVariable Long id){
        orderService.deleteOrderById(id);
        return "Order deleted"+id;
    }

//    @PutMapping("/updateStatus/{id}")
//    public String updateOrderStatus(@PathVariable Long id,@RequestParam OrderStatus orderStatus){
//        orderService.updateOrderStatus(id,orderStatus);
//        return "order status updated";
//
//    }
}
