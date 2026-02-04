# spring-practice-projects

A collection of small Spring and Spring Boot practice projects created to strengthen core concepts, improve Java backend skills, and serve as a quick reference for interview preparation. All learning-focused code is organized in one place for easy revision.

---

## Spring-1 : Basic Spring Core (XML Configuration)

This project demonstrates basic Spring Core using XML configuration.  
Spring container creates and manages Employee objects instead of using the `new` keyword.  
Multiple Employee beans are defined in XML and retrieved using `getBean()`.  
This project helps understand IoC, bean management, and Spring container basics.

---

## Spring-2 : Java-Based Configuration

This project demonstrates Spring Core using Java-based configuration instead of XML.  
Employee objects are defined as Spring beans using `@Configuration` and `@Bean`.  
Spring container creates and manages multiple Employee instances.  
Beans are retrieved using `AnnotationConfigApplicationContext` and `getBean()`.

---

## Spring-3 : Annotation-Based Configuration

This project demonstrates Spring Core using annotation-based configuration without XML or `@Bean` methods.  
Spring scans packages using `@ComponentScan` and automatically creates beans using `@Component`.  
Values are injected into fields using the `@Value` annotation.  
Beans are retrieved from the Spring container using `AnnotationConfigApplicationContext`.

---

## Spring-4 : Dependency Injection (Object Reference)

This project demonstrates dependency injection using XML configuration.  
Employee depends on Address, and Spring injects the Address object into Employee.  
Both setter-based and constructor-based injection are configured in XML.  
Spring container manages object creation and wiring between dependent classes.

---

## Spring-5 : Dependency Injection using Java Configuration

This project demonstrates dependency injection using Java-based configuration with `@Configuration` and `@Bean`.  
Spring creates Address and Employee beans and injects dependencies without XML.  
Both setter-based and constructor-based dependency injection are implemented.  
Spring container manages object creation and wiring between dependent classes.

---

## Spring JDBC : Database Interaction

This project demonstrates how to perform database operations using Spring JDBC.  
Spring manages database connections and simplifies JDBC code.  
CRUD operations are implemented using `JdbcTemplate`.  
This project helps understand database access with minimal boilerplate code.

---

## Spring ORM : Hibernate Integration

This project demonstrates integrating Hibernate with Spring ORM.  
Spring manages Hibernate `SessionFactory` and transaction handling.  
Database operations are performed using ORM instead of raw SQL.  
This project helps understand object–relational mapping and persistence.
