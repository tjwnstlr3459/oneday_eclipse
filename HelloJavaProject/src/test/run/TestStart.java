package test.run;

import test.func.Func;
import test.func.func1.Function;

//실행클래스 생성
public class TestStart {
	//실행용 메인메소드
	public static void main(String[] args) {
		
		System.out.println("첫번째기능!!");
		Func fu = new Func();
		
		fu.func1();
		fu.func2();
		
		Function f = new Function();
		f.test();
	}

}
