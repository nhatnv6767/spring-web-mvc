package com.dev.btnone.firstspringboot.controller;

import com.dev.btnone.firstspringboot.entity.Employee;
import com.dev.btnone.firstspringboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public String employeeList(Model model) {
        List<Employee> employees = employeeService.getListEmployee();

        model.addAttribute("employeeList", employees);
        // ten cua 1 view, dat mac dinh trong folder template
        return "employee-view";
    }
}
