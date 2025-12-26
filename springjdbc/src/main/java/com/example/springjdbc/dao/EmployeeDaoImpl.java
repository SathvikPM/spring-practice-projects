package com.example.springjdbc.dao;

import com.example.springjdbc.model.Employee;
import com.example.springjdbc.rowmapper.EmployeeRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
    public Employee getById(int id) {
        String sql="select * from employess where id=?";
        return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id); //for Single object
    }

    @Override
    public List<Employee> getAll() {

        String sql="select * from employess";
        return jdbcTemplate.query(sql, new EmployeeRowMapper()); //used to fetch multiple objects
    }

    @Override
    public void update(Employee employee) {
        String sql="UPDATE employess SET name=?, salary=? where id=?";
        jdbcTemplate.update(sql,
               employee.getName(),
                employee.getSalary(),
                employee.getId());
    }

    @Override
    public void delete(int id) {
        String sql="Delete from employess where id=?";
        jdbcTemplate.update(sql,id);

    }
}
