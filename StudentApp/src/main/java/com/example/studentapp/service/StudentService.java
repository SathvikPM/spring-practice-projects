package com.example.studentapp.service;


import com.example.studentapp.DAO.StudentDAO;
import com.example.studentapp.DAOImpl.StudentDAOImpl;
import com.example.studentapp.modal.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDAOImpl dao;

    public void saveStudent(Student student) {
        dao.save(student);

    }

    public List<Student> getStudents() {
        List<Student> students=dao.getStudent();
        return  students;
    }

    public void deleteStudent(int id) {
        dao.delete(id);
    }

    public Student getStudentById(int id) {
        return dao.getById(id);
    }

    public void updateStudent(Student student) {
        dao.update(student);
    }
}
