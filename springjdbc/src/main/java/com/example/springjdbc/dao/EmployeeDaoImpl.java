package com.example.springjdbc.dao;

import com.example.springjdbc.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //act as a repository
public class EmployeeDaoImpl implements EmployeeDao{

    private final JdbcTemplate jdbcTemplate;

    public EmployeeDaoImpl(JdbcTemplate jdbcTemplate){
               this.jdbcTemplate=jdbcTemplate;
    }


    @Override
    public void save(Employee employee) {
        String sql="Insert into employess values (?,?,?)";
        jdbcTemplate.update(sql,
                employee.getId(),
                employee.getName(),
                employee.getSalary()
                );
    }

    @Override
    public EmployeeDao getById(int id) {
        return null;
    }

    @Override
    public List<EmployeeDao> getAll() {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }
}
