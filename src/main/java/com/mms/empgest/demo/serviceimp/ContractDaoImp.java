package com.mms.empgest.demo.serviceimp;

import com.mms.empgest.demo.domain.Contract;
import com.mms.empgest.demo.domain.Employee;
import org.hibernate.validator.constraints.pl.NIP;

import java.util.List;

public interface ContractDaoImp {



    public Contract findContractByEmpId(int id);

    public Contract addContract(Contract contract);

    public List<Contract> getContracts();



}
