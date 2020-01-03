package com.mms.empgest.demo.repositories;

import com.mms.empgest.demo.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepositorie extends CrudRepository<Employee,Integer> {
}
