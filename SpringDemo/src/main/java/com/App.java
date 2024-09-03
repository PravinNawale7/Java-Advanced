package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Doctor doctor = (Doctor)context.getBean("doctor");
		Doctor doctor = context.getBean(Doctor.class);
		System.out.println(doctor.getQualification());
		doctor.assist();
		Nurse nurse = context.getBean(Nurse.class);
		System.out.println(nurse.getQualification());
		nurse.assist();
		
	}

}
