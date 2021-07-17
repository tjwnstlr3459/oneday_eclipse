package kr.or.iei.vo;

public class Vvip extends Grade {

	public Vvip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vvip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getBonus() {
		return getPoint()*0.10;
	}
}
