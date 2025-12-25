package com.example.springjdbc.controller;


import com.example.springjdbc.dao.EmployeeDao;
import com.example.springjdbc.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    private final EmployeeDao employeeDao;

    public EmployeeController(EmployeeDao employeeDao){
        this.employeeDao=employeeDao;
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee){
            employeeDao.save(employee);
            return  "Employee Added";
    }


}
