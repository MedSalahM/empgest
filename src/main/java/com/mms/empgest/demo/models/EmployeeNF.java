package com.mms.empgest.demo.models;

public class EmployeeNF extends RuntimeException {

    public EmployeeNF ( int id)
    {

        super("Employee not found with id : "+id);


    }
}
