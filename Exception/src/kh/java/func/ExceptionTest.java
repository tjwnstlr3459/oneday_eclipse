package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner sc;

	public ExceptionTest() {
		super();
		sc = new Scanner(System.in);
	}
	
	public void exceptionTest1() {
		while(true) {
		System.out.print("���ڸ� �Է��ϼ��� :");
		int num = 0;
		try {
			//������ �߻� �� �� �ִ� �ҽ��ڵ带 try �����ȿ� �ۼ�
			num = sc.nextInt();
		}catch(Exception e) {
			//try������ �����ϴٰ� ������ �߻��ϴ� ��� ����� ����
			System.out.println("���ڸ� �Է����ּ���");
			sc.nextLine();	//�ʱ�ȭ �Ƚ�Ű�� �������
			continue;
		}
		
		System.out.println("�Է��Ͻ� ���ڴ� "+num+"�Դϴ�.");
		}
	}
	
	public void exceptionTest2() {
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		//���� �ΰ��� �Է¹޾Ƽ� num1/num2�� ����� ���
		//����ó���� �ƴ϶� �ҽ��ڵ带 �����ؼ� ���ܻ�Ȳ ����
		
		if(num2 == 0) {
			System.out.println("0���δ� ������ �����ϴ�.");
		}else {
			System.out.println("������ ��� : " +num1/num2);
		}
	}
	public void main() {
		try {
			exceptionTest3();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void exceptionTest3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("test.txt");
	}
	
}





















