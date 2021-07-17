package com.khmarket.vo;

import java.util.Scanner;

public class test6 {
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1<num2 ? num1:num2;
		//String str = num1<num2? "num2가 더 큰수입니다." : "num1이 더 큰수입니다.";
		//char ch = num1<num2? 'a' : 'b';
		
		System.out.println(result);
	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		double num3 = (double)num1/num2;
		
		System.out.println("====결과====");
		System.out.println("두 수를 더한 수 : " + (num1 + num2));
		System.out.println("두 수를 뺀 수 : " + (num1 - num2));
		System.out.println("두 수를 곱한 수 : " + num1 * num2);
		System.out.printf("두 수를 나눈 수 : %.2f",num3 );
		System.out.println();
		System.out.println();
	}
	public void test2() {
		//a=40 b=20
		
		//a의값 60 b의값 20
		//a의값 40 b의값 20
		//a의값 40 b의값 800
		//a의값 40 b의값 0
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
		
		System.out.printf("첫번째 결과값 : %b \n",result1);
		System.out.printf("두번째 결과값 : %b \n",result2);
		//ture
		//false
		System.out.println();
		System.out.println();
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int num = sc.nextInt();
		String str = num > 19?"성인입니다. 어서오세요":"미성년자는 입장불가";
		System.out.println(str);
		
	}
	
}



















