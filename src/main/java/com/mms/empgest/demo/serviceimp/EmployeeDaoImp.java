package com.mms.empgest.demo.serviceimp;

import com.mms.empgest.demo.domain.Employee;

import java.util.List;

public interface EmployeeDaoImp {

    public Employee addEmployee (Employee employee);
    public List<Employee>  getEmployees();
    public Employee getEmployeeById(int id);
}
