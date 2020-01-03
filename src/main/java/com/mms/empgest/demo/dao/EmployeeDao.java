package com.mms.empgest.demo.dao;

import com.mms.empgest.demo.domain.Employee;
import com.mms.empgest.demo.repositories.EmployeeRepositorie;
import com.mms.empgest.demo.services.EmployeeDaoImp;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao implements EmployeeDaoImp {
    EmployeeRepositorie employeeRepositorie;

    public EmployeeDao(EmployeeRepositorie employeeRepositorie) {
        this.employeeRepositorie = employeeRepositorie;
    }

    @Override
    public Employee addEmployee(Employee employee) {

        employeeRepositorie.save(employee);
        return employee;
    }
}
