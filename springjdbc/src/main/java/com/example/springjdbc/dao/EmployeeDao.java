package com.example.springjdbc.dao;

import com.example.springjdbc.model.Employee;

import java.util.List;

public interface EmployeeDao {

    void save(Employee employee);
    Employee getById(int id);
    List<Employee> getAll();
    void update(Employee employee);
    void delete(int id);


}
