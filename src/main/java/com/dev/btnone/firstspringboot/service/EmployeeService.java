package com.dev.btnone.firstspringboot.service;

import com.dev.btnone.firstspringboot.entity.Employee;
import com.dev.btnone.firstspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getListEmployee() {
        return employeeRepository.getEmployeeFromDB();
    }

}
