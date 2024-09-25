package com.dev.btnone.firstspringboot.repository;

import com.dev.btnone.firstspringboot.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    public List<Employee> getEmployeeFromDB() {
        return List.of(new Employee(1l, "John", 18), new Employee(2l, "John 2", 19), new Employee(3l, "John 3", 22));
    }
}
