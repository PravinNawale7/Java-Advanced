package main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Account;
import com.model.Employee;


public class App {

	public static void main(String[] args) {
     Configuration config = new Configuration();
     config.configure();
     SessionFactory sessionFactory = config.buildSessionFactory();
     Session session = sessionFactory.openSession();
     Transaction tx = session.beginTransaction();
     
     Account acc = new Account();
     acc.setAccNo(11101);
     acc.setAccType("Saving");
     session.persist(acc);
     Account acc2 = new Account();
     acc2.setAccNo(21101);
     acc2.setAccType("Current");
     session.persist(acc2);
     
     Employee emp = new Employee();
     emp.setEmpId(101);
     emp.setEmpName("Pravin");
     emp.setDesignation("Developer");
     
     List<Account>li = new ArrayList<Account>();
     li.add(acc);
     li.add(acc2);
     emp.setLi(li);
     
     session.persist(emp);
     tx.commit();
     session.close();
     sessionFactory.close();
	}

}
