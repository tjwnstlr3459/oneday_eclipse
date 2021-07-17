package kr.or.iei.vo;

public class Gold extends Grade{

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getBonus() {
		return getPoint()*0.05;
	}
}
