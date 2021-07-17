package kh.java.test.function;

import java.util.Scanner;

public class Example {

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int en = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		
		int sum = (kor + en + math);
		double avg = (double)sum/3;
		
		
		boolean result1 = (kor>40)&&(en>40)&&(math>40);
		
		String result2 = (avg>60.00)&&(result1)?"합격":"불합격";
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println(result2);
		
		System.out.println();
		System.out.println();
		
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = num%2==0?"짝수!":"홀수!";
		System.out.println(result);
	}
}
