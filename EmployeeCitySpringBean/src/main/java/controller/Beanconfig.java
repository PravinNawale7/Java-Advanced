package controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import model.Department;
import model.Employee;

@Configurable
@ComponentScan(basePackages="model")
public class Beanconfig {
	@Bean
	public Employee emp() {
		return new Employee("ABC123","Pravin",20000);
	}
	@Bean
	public Department dept() {
		return new Department("TECHNICAL123","Technical Department");
	}

}
