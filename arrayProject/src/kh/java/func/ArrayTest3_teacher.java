package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3_teacher {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		int arr[] = new int[6];
		
		System.out.println("==�ζ� ���α׷�==");
		//�ζ� ��ȣ �Է�
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"��° ��ȣ �Է�(1~45) : ");
			arr[i]=sc.nextInt();
			if(arr[i]<0 || arr[i]>45) {
				System.out.println("1~45 ���ڸ� �Է��ϼ���");
				i--;	//�����Ͻ� ��°�� �ٽ� �������ؼ�
			}else {
				
			}
		}
		
	}
}