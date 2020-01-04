package com.mms.empgest.demo.repositories;

import com.mms.empgest.demo.domain.Contract;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ContractRepositorie extends CrudRepository<Contract,Integer> {


    @Query(value="select * from Contract c where c.employee_emp_id =:idempdet", nativeQuery=true)
    Contract findContractByEmpDet(@Param("idempdet") int idempdet);


}
