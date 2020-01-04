package com.mms.empgest.demo.models;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class EmployeeNFAdvice {

    @ResponseBody
    @ExceptionHandler(EmployeeNF.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String employeeNotfoundHandler ( EmployeeNF enf) {


        return enf.getMessage();


    }
}