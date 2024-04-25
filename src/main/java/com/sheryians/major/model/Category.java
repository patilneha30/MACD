package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;

//for table in database
@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private int id;
    private String name;
}
