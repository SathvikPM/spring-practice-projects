package com.example.springorm.dao;

import com.example.springorm.modal.Employee;

import java.util.List;

public interface EmployeeDao {
    void save(Employee employee);
    List<Employee> getAll();

    Employee getEmployeeByID(int id);

    void  updateEmployee(Employee emp);

    void deleteEmployee(int id);

    Employee getEmployeeByName(String name);



}
