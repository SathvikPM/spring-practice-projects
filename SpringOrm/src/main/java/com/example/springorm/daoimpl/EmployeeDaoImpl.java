package com.example.springorm.daoimpl;

import com.example.springorm.dao.EmployeeDao;
import com.example.springorm.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Employee employee) {
        hibernateTemplate.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return  hibernateTemplate.loadAll(Employee.class);
    }

    @Override
    public Employee getEmployeeByID(int id) {
        return hibernateTemplate.get(Employee.class,id);
    }

    @Override
    public void updateEmployee(Employee emp) {
        hibernateTemplate.update(emp);
    }

    @Override
    public void deleteEmployee(int id) {
        hibernateTemplate.delete(hibernateTemplate.get(Employee.class,id));
    }

//    @Override
//    public Employee getEmployeeByName(String name) {
//        String hql="from Employee where name = ?";
//         return (Employee) hibernateTemplate.find(hql,name).stream().findFirst().orElse(null);
//    }
    @Override
    public Employee getEmployeeByName(String name) {

    String hql = "from Employee where name = :name";

    List<Employee> list =
            (List<Employee>) hibernateTemplate.findByNamedParam(
                    hql,
                    "name",
                    name
            );

    return list.isEmpty() ? null : list.get(0);
    }


}
