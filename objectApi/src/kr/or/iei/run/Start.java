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
		//tc2 = tc1.clone();	//clone()�� �������� ������ - > protected
*/		
		//������ - >�θ�Ÿ�Ժ����� �ڽ�Ÿ�԰�ü�� ���°�
		
		//�ڽİ�ü�� �θ�ü�� ���� �ϱ⶧����
		//tc2 = (TestClass)tc.clone();
		//testClass(�ڽİ�ü) = tc(������Ʈ=�θ�Ÿ��)
		//�ٿ�ĳ����
		
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
























