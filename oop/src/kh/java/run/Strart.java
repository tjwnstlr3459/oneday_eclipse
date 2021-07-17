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
		
		//다형성 부모타입 변수에 자식타입 객체를 저장하는것
		Animal a1 = new Cat();	//업 캐스팅
		a1.crying();
		//a1.grooming(); //부모객체에는 없는 메소드라 소환 불가
		((Cat)a1).grooming(); 	//다운 캐스팅
		
		Animal a2 = new Tiger();
		a2.crying();
		((Tiger)a2).hunting();
		////////////////////////////////
		((Cat)a1).grooming();
		//((Tiger)a1).hunting();//문법상은 괜찮지만 실행시 오류
		
		Object o = new Cat();
		
	
	}
}






















