package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Bean.Bank;
import Bean.Customer;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Beanconfig.class);
		Bank sbi=context.getBean(Bank.class);
		Customer customer = context.getBean(Customer.class);
		sbi.display();
		System.out.println(sbi.getName());
		
		 customer.display();
	     System.out.println("Customer Name: " + customer.getName());
	     System.out.println("Customer Age: " + customer.getAge());
	     System.out.println("Customer Address: " + customer.getAddress());
		
	}

}
