package com;

public class Doctor {
	private String qualification;
	
	public void assist() {
		System.out.println("Doctor Assist the Patient....");
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getQualification() {
		return qualification;
	}

}
