package main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entity.Bank;
import entity.Customer;

public class App {

		private static ApplicationContext context;

		public static void main(String[] args) {
			context = new AnnotationConfigApplicationContext(Beanconfig.class);
			Bank sbi = context.getBean(Bank.class);
			Customer customer = context.getBean(Customer.class);
			sbi.display();
			customer.deposit();
			
		}

	}

