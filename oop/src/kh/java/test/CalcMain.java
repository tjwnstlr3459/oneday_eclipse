package kh.java.test;

import java.util.Scanner;

public class CalcMain {

	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("����° ���� �Է� : ");
		int num3 = sc.nextInt();
		
		CalcFunc cft = new CalcFunc();
		int result = cft.sum(num1, num2, num3);
		System.out.println(result);
		
	}
}
