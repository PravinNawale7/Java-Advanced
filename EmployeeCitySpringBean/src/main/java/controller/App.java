package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import model.Department;
import model.Employee;

public class App {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Beanconfig.class);

        Employee emp = context.getBean(Employee.class);
        Department dept = context.getBean(Department.class);
        emp.display();
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        
        dept.display();
        System.out.println("Department ID: " + dept.getDeptId());
        System.out.println("Department Name: " + dept.getDeptName());
    }
}
