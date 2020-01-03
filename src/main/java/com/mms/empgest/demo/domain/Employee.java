package com.mms.empgest.demo.domain;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id",columnDefinition = "int(4)")
    private int id;
    @Column(columnDefinition = "varchar(150)", nullable = true)
    private String lastname ;
    @Column(columnDefinition = "varchar(150)", nullable = true)
    private String firstname;
    @Column(columnDefinition = "varchar(50)", nullable = true)
    private String birthdate;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private EmployeeDetails empdet;


}
