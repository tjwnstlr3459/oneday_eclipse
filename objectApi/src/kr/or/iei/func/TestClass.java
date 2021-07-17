package kr.or.iei.func;

public class TestClass implements Cloneable{
	private String str;

	public void func1() {
		System.out.println("테스트구문!");
	}
	

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	
	
}
