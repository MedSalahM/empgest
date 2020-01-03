package com.mms.empgest.demo.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empdet_id",columnDefinition = "int(4)")
    private int id;
    @Column(columnDefinition = "varchar(150)", nullable = true)
    private String adresse;
    @Column(columnDefinition = "varchar(50)", nullable = true)
    private String city;
    @Column(columnDefinition = "varchar(50)", nullable = true)
    private String country;
    @Column(columnDefinition = "varchar(10)", nullable = true)
    private String familystatus;
    @Column(columnDefinition = "int(2)", nullable = true)
    private int numberofkids;

    @OneToOne(mappedBy = "empdet")
    private Employee employee;

    @OneToMany(mappedBy = "employeedetails")
    private List<Contract> contract;






}
