package com.mms.empgest.demo.controller;


import com.mms.empgest.demo.dao.EmployeeDao;
import com.mms.empgest.demo.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(HomeController.BASE_URL)
public class HomeController {

    public static final String BASE_URL="/api/empgest";
    private EmployeeDao employeedao;

    public HomeController(EmployeeDao employeedao) {
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


}
