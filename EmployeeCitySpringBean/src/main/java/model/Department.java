package model;

public class Department {
	private String deptId;
	private String deptName;
	
	public Department(String deptId,String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
		
	}
	public String getDeptId() {
		return deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void display() {
		System.out.println("Department Details: ");
		
	}
	

}
