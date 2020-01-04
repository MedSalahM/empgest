package com.mms.empgest.demo.repositories;

import com.mms.empgest.demo.domain.Contract;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContractRepositorie extends CrudRepository<Contract,Integer> {


    @Query(value="select * from Contract c where c.employee_emp_id=:idempdet", nativeQuery=true)
    List<Contract> findContractByEmpDet(@Param("idempdet") int idempdet);


}
