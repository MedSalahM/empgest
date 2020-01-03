package com.mms.empgest.demo.domain;


import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "int(3)")
    private int id;
    private String lable;


}
