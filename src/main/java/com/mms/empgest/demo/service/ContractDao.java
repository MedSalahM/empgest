package com.mms.empgest.demo.service;

import com.mms.empgest.demo.domain.Contract;
import com.mms.empgest.demo.domain.Employee;
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
    public Contract addContract(Contract contract) {

             contractRepositorie.save(contract);
              return contract;
    }

    @Override
    public Contract findContractByEmpId(int id) {


        Contract c = new Contract();
        c=contractRepositorie.findContractByEmpDet(id);

        return c;
    }
}
