package com.example.springorm.serviceimpl;

import com.example.springorm.dao.EmployeeDao;
import com.example.springorm.modal.Employee;
import com.example.springorm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public Employee getEmployeeByID(int id) {
        return employeeDao.getEmployeeByID(id);
    }

    @Override
    public void updateEmployee(Employee emp) {
        employeeDao.updateEmployee(emp);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }

    @Override
    public Employee getEmployeeByName(String name) {
       return employeeDao.getEmployeeByName(name);
    }
}
