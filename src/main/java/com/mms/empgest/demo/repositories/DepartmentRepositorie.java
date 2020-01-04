package com.mms.empgest.demo.repositories;

import com.mms.empgest.demo.domain.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepositorie extends CrudRepository<Department, Integer> {
}
