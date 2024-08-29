package Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
public class App {

	public static void main(String[] args){
		Configuration config=new Configuration();
		config.configure();
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Student s1=new Student();
        s1.setRoll(1);
        s1.setName("Pravin");
        s1.setAge(24);
        
        session.persist(s1);
        
        session.getTransaction().commit();
        
       tx.commit();
       
       session.close();
	}

}
