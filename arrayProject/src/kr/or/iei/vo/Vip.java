package kr.or.iei.vo;

public class Vip extends Grade {

	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getBonus() {
		return getPoint()*0.07;
	}
}
