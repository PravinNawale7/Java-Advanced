package model;

public class Employee {
	private String empId;
	private String name;
	private double salary;

	
	public Employee(String empId,String name,double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void display() {
		System.out.println("Employee Details: ");
	}
}
