package com.example.studentapp.DAO;



import com.example.studentapp.modal.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student studen);
    List<Student> getStudent();
}
