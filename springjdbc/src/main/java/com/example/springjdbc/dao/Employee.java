package com.example.springjdbc.dao;

import java.util.List;

public interface Employee {

    void save(Employee employee);
    Employee getById(int id);
    List<Employee> getAll();
    void update(Employee employee);
    void delete(int id);


}
