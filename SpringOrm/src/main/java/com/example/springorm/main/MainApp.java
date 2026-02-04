package com.example.springorm.main;


import com.example.springorm.config.AppConfig;
import com.example.springorm.modal.Employee;
import com.example.springorm.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService service=context.getBean(EmployeeService.class);
        service.addEmployee(new Employee("Tim","tim@gmail.com","ISE",3000));
        service.addEmployee(new Employee("Sathvik","sathvik@gmail.com","ISE",50000));
        service.addEmployee(new Employee("Sagar","sagar@gmail.com","ISE",60000));
        System.out.println("Employee Inserted Successfully");

//        to get All the Employess
        List<Employee> employees=service.getAll();
        for(Employee e:employees){
            System.out.println(e.getId()+" "+e.getName());
        }
        Scanner scanner=new Scanner(System.in);

        //to get Employee By Id
        Employee emp=service.getEmployeeByID(scanner.nextInt());
        System.out.println(emp.getName());

        //to update the employee
        emp.setSalary(4000);
        service.updateEmployee(emp);

        //to delete the employee
        service.deleteEmployee(scanner.nextInt());

        Employee employee=service.getEmployeeByName("Sathvik");
        System.out.println(employee.getSalary());



        context.close();




    }
}
