package interview_questions;

import java.util.List;

public class GroupEmployee {
	private String name;
	private String department;
	private double salary;
	private long number;
	private  int experiance;
	private List<Skills> skills;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	public GroupEmployee(String name, String department, double salary, long number, int experiance,
			List<Skills> skills) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.number = number;
		this.experiance = experiance;
		this.skills = skills;
	}
	public GroupEmployee() {
		
	}

}
