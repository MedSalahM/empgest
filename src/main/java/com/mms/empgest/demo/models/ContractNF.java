package com.mms.empgest.demo.models;

public class ContractNF extends RuntimeException {

    public ContractNF (int id){

        super("Contract not found number "+id);

    }
}
