package kr.or.iei.run;

import kr.or.iei.func.ApiClass;
import kr.or.iei.func.StringClass;
import kr.or.iei.func.TestClass;

public class Start {

	public static void main(String[] args) throws CloneNotSupportedException{
		/*
		TestClass tc = new TestClass();
		TestClass tc2 = new TestClass();
		tc.toString();
		System.out.println(tc);
		System.out.println(tc.toString());
		System.out.println(tc2);
		System.out.println(tc2.toString());
		System.out.println(tc.hashCode());
		System.out.println(tc2.hashCode());
		int arr[] = {1,2,3,4,5};
		int arr2[] = arr.clone();`	
		//tc2 = tc1.clone();	//clone()은 접근제어 지시자 - > protected
*/		
		//다형성 - >부모타입변수에 자식타입객체가 들어가는것
		
		//자식객체가 부모객체로 들어가려 하기때문에
		//tc2 = (TestClass)tc.clone();
		//testClass(자식객체) = tc(오브젝트=부모타입)
		//다운캐스팅
		
		StringClass sc = new StringClass();
		ApiClass m = new ApiClass();
		//sc.test1();
		//sc.test2();
		//sc.exam1();
		
		//m.math();
		//m.dday();
		m.wrapper();
	}

}
























