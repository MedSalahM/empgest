package com.mms.empgest.demo.controller;


import com.mms.empgest.demo.service.ContractDao;
import com.mms.empgest.demo.service.EmployeeDao;
import com.mms.empgest.demo.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(EmployeeController.BASE_URL)
public class EmployeeController {

    public static final String BASE_URL="/api/empgest";
    private EmployeeDao employeedao;




    public EmployeeController(EmployeeDao employeedao) {
        this.employeedao = employeedao;
    }


    @GetMapping
    public String Home(){


        return "index.html";
    }

    @GetMapping("/Employee")
    public String Employee(Model model){
      Employee employee = new Employee();
       model.addAttribute("employee",employee);
        return "newemployee.html";
    }
    @PostMapping("/Employee")
    public String AddEmployee(@ModelAttribute Employee employee){
     employeedao.addEmployee(employee);

        return "addemployee.html";
    }

    @GetMapping("/Employees")
    public String Employees(Model model){
        List<Employee> employees = employeedao.getEmployees();
        model.addAttribute("employees",employees);
        return "employees.html";
    }

    @GetMapping("/Employee/{id}")
    public String EmployeesId(Model model , @PathVariable int id){


        Employee employees = employeedao.getEmployeeById(id);
        model.addAttribute("employees",employees);

        return "employee.html";
    }


    @GetMapping("Employee/find")
    public String findEmployeePage()
    {

        return "findemployee";
    }

    @PostMapping("findemployee")
    public String findEmployee(Model model, @RequestParam int employeeid)
    {

        Employee emp;
        emp= employeedao.getEmployeeById(employeeid);
        model.addAttribute("employees",emp);
        return "empid.html";
    }
}

