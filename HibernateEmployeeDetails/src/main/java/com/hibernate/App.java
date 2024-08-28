package com.hibernate;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Scanner sc = new Scanner(System.in);
      
            System.out.println("Enter the Employee ID: ");
            int EmpId = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Enter the Employee Name: ");
            String EmpName = sc.nextLine();
            System.out.println("Enter the Employee Designation: ");
            String EmpDesignation = sc.nextLine();

            Employee e1 = new Employee();
            e1.setEmpId(EmpId);
            e1.setEmpName(EmpName);
            e1.setDesignation(EmpDesignation); 

            session.persist(e1);
            tx.commit(); 

            System.out.println("Successful");
       
            sc.close(); 
            session.close(); 
            sessionFactory.close(); 
    }
}
