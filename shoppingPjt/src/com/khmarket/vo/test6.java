package com.khmarket.vo;

import java.util.Scanner;

public class test6 {
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int result = num1<num2 ? num1:num2;
		//String str = num1<num2? "num2�� �� ū���Դϴ�." : "num1�� �� ū���Դϴ�.";
		//char ch = num1<num2? 'a' : 'b';
		
		System.out.println(result);
	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		double num3 = (double)num1/num2;
		
		System.out.println("====���====");
		System.out.println("�� ���� ���� �� : " + (num1 + num2));
		System.out.println("�� ���� �� �� : " + (num1 - num2));
		System.out.println("�� ���� ���� �� : " + num1 * num2);
		System.out.printf("�� ���� ���� �� : %.2f",num3 );
		System.out.println();
		System.out.println();
	}
	public void test2() {
		//a=40 b=20
		
		//a�ǰ� 60 b�ǰ� 20
		//a�ǰ� 40 b�ǰ� 20
		//a�ǰ� 40 b�ǰ� 800
		//a�ǰ� 40 b�ǰ� 0
		int a = 40, b=20;
		a+= b;
		System.out.printf("%d,%d\n",a,b);
		a -=b;
		System.out.printf("%d,%d\n",a,b);
		b *=a;
		System.out.printf("%d,%d\n",a,b);
		b /=a;
		System.out.printf("%d,%d\n",a,b);
		System.out.println();
		System.out.println();
	}
	public void test3() {
		int a= 10, b= 20, c= 30, d= 40;
		boolean result1, result2;
		result1 = ((a <20 && b > 10) && (c==20 || d==40));
		result2 = ((a==10 && b !=2 * 10) || (c== 30 && d != 40));
		
		System.out.printf("ù��° ����� : %b \n",result1);
		System.out.printf("�ι�° ����� : %b \n",result2);
		//ture
		//false
		System.out.println();
		System.out.println();
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int num = sc.nextInt();
		String str = num > 19?"�����Դϴ�. �������":"�̼����ڴ� ����Ұ�";
		System.out.println(str);
		
	}
	
}



















