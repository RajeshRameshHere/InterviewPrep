package stream;

public class employee {
	
	private int salary;
	private int age;
	private String name;
	private String skill;
	private String gender;

	
	
	
	
	public employee(int salary, int age, String name, String skill,String gender) {
		
		this.salary = salary;
		this.age = age;
		this.name = name;
		this.skill = skill;
		this.gender = gender;

	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int id) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
