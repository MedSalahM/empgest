package com.mms.empgest.demo.serviceimp;

import com.mms.empgest.demo.domain.Contract;
import com.mms.empgest.demo.domain.Employee;
import org.hibernate.validator.constraints.pl.NIP;

import java.util.List;

public interface ContractDaoImp {



     List<Contract> ContractByEmpId(int id);

     Contract addContract(Contract contract);

     Contract getContractId(int id);

     List<Contract> getContracts();



}
