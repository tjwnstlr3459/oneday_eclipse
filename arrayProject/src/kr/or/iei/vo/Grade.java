package kr.or.iei.vo;

public abstract class Grade {
	private String name;
	private String grade;
	private int point;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String grade, String name, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}	
	public abstract double getBonus();
}
