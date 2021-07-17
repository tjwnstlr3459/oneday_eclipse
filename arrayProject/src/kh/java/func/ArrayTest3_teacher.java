package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3_teacher {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		int arr[] = new int[6];
		
		System.out.println("==로또 프로그램==");
		//로또 번호 입력
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 번호 입력(1~45) : ");
			arr[i]=sc.nextInt();
			if(arr[i]<0 || arr[i]>45) {
				System.out.println("1~45 숫자를 입력하세요");
				i--;	//오답일시 번째를 다시 적기위해서
			}else {
				
			}
		}
		
	}
}