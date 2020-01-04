package com.mms.empgest.demo.controller;


import com.mms.empgest.demo.dao.DepartmentDao;
import com.mms.empgest.demo.domain.Department;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
@RequestMapping(DepartmentController.BU)
public class DepartmentController {
 DepartmentDao departmentDao;

    public DepartmentController(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public static final String BU="/api/empgest";

    @GetMapping("/Department")
    public String Department (Model model){

        Department department = new Department();
        model.addAttribute("department",department);
        return "newdepartment.html";

    }
    @PostMapping("/Department")
    public String addDepartment (Model model, @ModelAttribute Department department){
           departmentDao.addDepartment(department);
           model.addAttribute("department",department);
        return "adddepartment.html";

    }


}
