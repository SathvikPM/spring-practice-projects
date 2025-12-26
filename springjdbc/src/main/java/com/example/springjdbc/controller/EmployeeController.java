package com.example.springjdbc.controller;


import com.example.springjdbc.dao.EmployeeDao;
import com.example.springjdbc.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}")
    public Employee getById(@PathVariable int id){
        return employeeDao.getById(id);
    }

    @GetMapping
    public List<Employee> getAll(){
       return employeeDao.getAll();
    }

    @PutMapping
    public  String updateEmployee(@RequestBody Employee employee){
        employeeDao.update(employee);
        return  "Employee Updated";
    }

    @DeleteMapping("/{id}")
    public  String deleteEmployee(@PathVariable int id){
         employeeDao.delete(id);
         return  "Employeee Deleted";
    }






}
