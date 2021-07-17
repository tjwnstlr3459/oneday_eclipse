package kr.or.iei.vo;

public class Silver extends Grade{

	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getBonus() {
		return getPoint()*0.02;
	}
}
