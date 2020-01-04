package com.mms.empgest.demo.domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "int(4)", name = "contract_id")
    private int id;


    private String startdate;
    private  String enddate;
    private boolean active;

    @OneToOne
    @JoinColumn(name ="occ_id" )
    private Occupation occupation;

    @OneToOne
    @JoinColumn(name ="department_id" )
    private Department department;

    @OneToOne
    private EmployeeDetails employeedetails;









}
