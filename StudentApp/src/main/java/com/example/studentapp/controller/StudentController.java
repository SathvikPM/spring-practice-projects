package com.example.studentapp.controller;


import com.example.studentapp.modal.Student;
import com.example.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String showForm(){

        return "register";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student,Model modal){
        service.saveStudent(student);
        modal.addAttribute("msg","saved Successfully");
        return "register";



    }

    @GetMapping("/students")
    public String getStudents(Model model){
        List<Student> students=service.getStudents();
        model.addAttribute("students",students);
        return "students";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        Student s = service.getStudentById(id);
        model.addAttribute("student", s);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Student student) {
        service.updateStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }












}
