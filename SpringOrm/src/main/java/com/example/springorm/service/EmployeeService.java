package com.example.springorm.service;

import com.example.springorm.modal.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    void addEmployee(Employee employee);
    List<Employee> getAll();

    Employee getEmployeeByID(int id);

    void updateEmployee(Employee emp);

    void deleteEmployee(int id);

    Employee getEmployeeByName(String name);
}
