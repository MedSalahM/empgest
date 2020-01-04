package com.mms.empgest.demo.domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "int(3)")
    private int id;
    private String lable;


}
