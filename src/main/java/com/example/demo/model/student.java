package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "studentttt")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public student(){}

    public student (int id,String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
