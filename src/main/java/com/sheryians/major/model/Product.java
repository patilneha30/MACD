package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;

@Entity // for creating table
@Data   //getter n setter methods
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "category_id",referencedColumnName = "category_id")
    private Category category;
    private double price;
    private double weight;
    private String description;
    private String imageName;

}
