package test.run;

import test.func.Func;
import test.func.func1.Function;

//����Ŭ���� ����
public class TestStart {
	//����� ���θ޼ҵ�
	public static void main(String[] args) {
		
		System.out.println("ù��°���!!");
		Func fu = new Func();
		
		fu.func1();
		fu.func2();
		
		Function f = new Function();
		f.test();
	}

}
