package com.dev.btnone.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    @RequestMapping("/employees")
    public String employeeList() {
        // ten cua 1 view, dat mac dinh trong folder template
        return "employee-view";
    }
}
