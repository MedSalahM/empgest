package com.mms.empgest.demo.dao;


import com.mms.empgest.demo.domain.Department;
import com.mms.empgest.demo.repositories.DepartmentRepositorie;
import com.mms.empgest.demo.services.DepartmentDaoImp;
import org.springframework.stereotype.Service;

@Service
public class DepartmentDao implements DepartmentDaoImp {
    DepartmentRepositorie departmentRepositorie;

    public DepartmentDao(DepartmentRepositorie departmentRepositorie) {
        this.departmentRepositorie = departmentRepositorie;
    }

    @Override
    public Department addDepartment(Department department) {

        departmentRepositorie.save(department);

        return department;
    }
}
