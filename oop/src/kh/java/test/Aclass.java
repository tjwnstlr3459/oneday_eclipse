package kh.java.test;

public class Aclass extends Bclass{
	private int num;

	public Aclass() {
		super();//부모 생성자 호출 Bclass()
		// TODO Auto-generated constructor stub
	}

	public Aclass(int num,int no) {
		super(no);	//부모 생성자 호출 Bclass(int no)
		
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override//부모메소드와 변수명이 같아야함 구별하기위해 오타방지
	public void printMsg() {
		System.out.println("난 Aclass야!!");
	}
}
