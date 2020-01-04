package com.mms.empgest.demo.domain;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Occupation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "int(3)")
    private int id;
    private String label;
    @Column(columnDefinition = "int(3)")
    private int code;


}
