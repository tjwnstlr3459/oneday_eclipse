package kh.java.test.function;

import java.util.Scanner;

public class Example {

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int en = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int math = sc.nextInt();
		
		int sum = (kor + en + math);
		double avg = (double)sum/3;
		
		
		boolean result1 = (kor>40)&&(en>40)&&(math>40);
		
		String result2 = (avg>60.00)&&(result1)?"�հ�":"���հ�";
		
		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.2f\n",avg);
		System.out.println(result2);
		
		System.out.println();
		System.out.println();
		
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		String result = num%2==0?"¦��!":"Ȧ��!";
		System.out.println(result);
	}
}
