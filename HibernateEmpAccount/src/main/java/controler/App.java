package controler;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Emp;
import model.Account;

public class App {

	public static void main(String[] args) {
     Configuration config = new Configuration();
     config.configure("Hibernate.cf.xml");
     SessionFactory sessionFactory = config.buildSessionFactory();
     Session session = sessionFactory.openSession();
     Transaction tx = session.beginTransaction();
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Employee ID: ");
     int empId = sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the Employee Name: ");
     String empName = sc.nextLine();
     System.out.println("Enter the Designation of Employee: ");
     String designation = sc.nextLine();
     
     Emp e1 = new Emp();
     e1.setEmpId(empId);
     e1.setEmpName(empName);
     e1.setDesignation(designation);
     session.persist(e1);
     
     System.out.println("Enter the Account Number: ");
     int accNo = sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the Account Holder Name: ");
     String accName = sc.nextLine();
     System.out.println("Enter the Account Type: ");
     String accType = sc.nextLine();
     
     Account a1 = new Account();
     a1.setAccNo(accNo);
     a1.setAccName(accName);
     a1.setAccType(accType);
     a1.setEmp(e1);
     session.persist(a1);
     
     
     
     tx.commit();
     sc.close();
     session.close();
     sessionFactory.close();
     
     
     
     
     
     
	}

}
