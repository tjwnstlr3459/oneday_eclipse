package kh.java.run;

import java.util.Scanner;


import kh.java.test.Aclass;
import kh.java.test.Bclass;
import kh.java.test.Calc;
import kh.java.test.MethodTest;
import kh.java.test.StudentMgr;
import kh.java.test.TV;

import kh.java.test.Animal;
import kh.java.test.Cat;
import kh.java.test.Tiger;

public class Strart {

	public static void main(String[] args) {
		
		Animal a = new Animal();	//crying
		Cat c = new Cat();			//crying, grooming
		Tiger t= new Tiger();		//crying, hunting
		
		a.crying();
		c.crying();
		t.crying();
		c.grooming();
		t.hunting();
		
		//������ �θ�Ÿ�� ������ �ڽ�Ÿ�� ��ü�� �����ϴ°�
		Animal a1 = new Cat();	//�� ĳ����
		a1.crying();
		//a1.grooming(); //�θ�ü���� ���� �޼ҵ�� ��ȯ �Ұ�
		((Cat)a1).grooming(); 	//�ٿ� ĳ����
		
		Animal a2 = new Tiger();
		a2.crying();
		((Tiger)a2).hunting();
		////////////////////////////////
		((Cat)a1).grooming();
		//((Tiger)a1).hunting();//�������� �������� ����� ����
		
		Object o = new Cat();
		
	
	}
}






















