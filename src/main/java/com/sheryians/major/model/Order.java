package com.sheryians.major.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Data
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

//    @Enumerated(EnumType.STRING)
//    private OrderStatus orderStatus=OrderStatus.PENDING;
}
