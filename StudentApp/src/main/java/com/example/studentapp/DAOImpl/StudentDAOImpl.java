package com.example.studentapp.DAOImpl;



import com.example.studentapp.DAO.StudentDAO;
import com.example.studentapp.modal.Student;
//import org.springframework.jdbc.core.JdbcTemplate;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {




    private final  JdbcTemplate jdbcTemplate;


    public StudentDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }


    @PostConstruct
    public void init() {
        System.out.print("creating table");
        String sql = "CREATE TABLE IF NOT EXISTS student (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(100), " +
                "email VARCHAR(100), " +
                "age INT)";
        jdbcTemplate.execute(sql);
    }


    public void save(Student student) {

        String sql="INSERT INTO student (name, email, age) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,student.getName(), student.getEmail(), student.getAge());


    }

    public List<Student> getStudent() {
        String sql = "SELECT * FROM student";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getLong("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setAge(rs.getInt("age"));
            return s;
        });
    }

    public Student getById(int id) {
        String sql = "SELECT * FROM student WHERE id = ?";

        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getLong("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setAge(rs.getInt("age"));
            return s;
        }, id);
    }

    public void delete(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void update(Student student) {
        String sql = "UPDATE student SET name=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql,
                student.getName(),
                student.getEmail(),
                student.getAge(),
                student.getId());
    }




}
