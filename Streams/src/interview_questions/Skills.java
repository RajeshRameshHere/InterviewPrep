package interview_questions;

public class Skills {
	private String skill;
	private int rate;
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public Skills(String skill, int rate) {
		super();
		this.skill = skill;
		this.rate = rate;
	}
	public Skills() {}
}
