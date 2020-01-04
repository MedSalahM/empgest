package com.mms.empgest.demo.service;

import com.mms.empgest.demo.domain.Contract;
import com.mms.empgest.demo.domain.Employee;
import com.mms.empgest.demo.models.ContractNF;
import com.mms.empgest.demo.models.EmployeeNF;
import com.mms.empgest.demo.repositories.ContractRepositorie;
import com.mms.empgest.demo.serviceimp.ContractDaoImp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractDao implements ContractDaoImp {
     ContractRepositorie contractRepositorie;

    public ContractDao(ContractRepositorie contractRepositorie) {
        this.contractRepositorie = contractRepositorie;
    }

    @Override
    public List<Contract> getContracts() {

        List<Contract> contracts = new ArrayList<>();
        contractRepositorie.findAll().forEach(contracts::add);

        return contracts;

    }

    @Override
    public Contract getContractId(int id) {
        Contract c;
        c=contractRepositorie.findById(id).orElseThrow(() -> new ContractNF(id));
        return c;
    }

    @Override
    public Contract addContract(Contract contract) {

             contractRepositorie.save(contract);
              return contract;
    }

    @Override
    public List<Contract> ContractByEmpId(int id) {

        List<Contract> c =new ArrayList<>();
        contractRepositorie.findContractByEmpDet(id).forEach(c::add);
        return c;
    }
}
