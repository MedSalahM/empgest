package com.mms.empgest.demo.dao;

import com.mms.empgest.demo.domain.Employee;
import com.mms.empgest.demo.models.EmployeeNF;
import com.mms.empgest.demo.repositories.EmployeeRepositorie;
import com.mms.empgest.demo.services.EmployeeDaoImp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeDao implements EmployeeDaoImp {
    EmployeeRepositorie employeeRepositorie;

    public EmployeeDao(EmployeeRepositorie employeeRepositorie) {
        this.employeeRepositorie = employeeRepositorie;
    }

    @Override
    public Employee getEmployeeById(int id) {

        Employee employee = new Employee();
       // employee=employeeRepositorie.findById(id).get();
        employee=employeeRepositorie.findById(id).orElseThrow(()->new EmployeeNF(id));
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();
        employeeRepositorie.findAll().forEach(employees::add);
        return employees;
    }

    @Override
    public Employee addEmployee(Employee employee) {

        employeeRepositorie.save(employee);
        return employee;
    }
}
