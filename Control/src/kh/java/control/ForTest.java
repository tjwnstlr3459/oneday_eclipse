package kh.java.control;

import java.util.Scanner;

public class ForTest {

	public void test1() {
		for (int i = 0; i <= 5; i++) {			
			System.out.println(i + "��° ���");	
		}
	}
	public void test2() {
		for (int i = 5; i >= 1; i--) {			 
			System.out.println(i + "��° ���");	
		}
	}
	
	public void exam1() {
		//�ȳ��ϼ��� 5�����
		for(int i=0; i<5;i++) {				//�ʱ⹮,���ǹ�,������
			System.out.println("�ȳ��ϼ���");	//���๮
		}
		System.out.println();
		System.out.println();
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);	//Ƚ����ŭ �ݺ��ϱ����� scanner�� ���
	
		System.out.print("��� ����Ͻðڽ��ϱ�? : ");
		int num = sc.nextInt();					//������ ���� ������ ����
		
		for(int i=0; i<num; i++) {				//������ ������ ���̸�ŭ ������ ����
			System.out.println("�ȳ��ϼ���");
		}
		System.out.println();
		System.out.println();
	}
	public void exam3() {
		System.out.println("2���Դϴ�.");
		for(int i=1; i<10; i++) {						//�������� �����ݺ��� ���
			System.out.println("2 * " +i+ " = " +i*2);	//2�ܸ� �ϱ⿡ 2���� ���ڿ��� �ۼ�
		}
		System.out.println();
		System.out.println();
	}
	public void exam4() {
		Scanner sc = new Scanner(System.in);			//������ ������ �������ϱ����� scanner��
		
		System.out.print("����� ����Ͻðڽ��ϱ�? : ");
		int num = sc.nextInt();							//������ ���� ������ ����
		System.out.println(num+"���Դϴ�.");				//����ڰ� �Է��� ���� ���� ����Ʈ�� �ۼ�
		
		for(int i=1; i<10; i++) {						//�������� �����ݺ��� ���
			System.out.println(num +" * "+ i + " = " + num*i);
		}
		System.out.println();
		System.out.println();
	}
	
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;     							//for�� �ȿ����� �ƴ� �ۿ��� �������� ��������
		
		for(int i=0; i<5; i++) {					//5�� �������� ���� ���ϱ� ���� for��
			System.out.print("���� ���� �Է��Ͻÿ� : ");
			int number = sc.nextInt();
			sum+=number;							//�ݺ����� �Ҷ������� ����, ���Ӱ� ���ϰ� ������ ����
		}
		System.out.println("�Է��� 5���� ������ �� : " + sum);	//sum�� �������ؼ� for�� ���� �ƴ� �ٱ��� ������ �ۼ��ؾ��Ѵ�
		System.out.println();
		System.out.println();
	}
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;						//��½� �ջ��� ������ ��������, ������ �ʱ�ȭ
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		for(int i=num1; i<=num2; i++) {		//i�ʱⰪ�� num1 �����ϰ� num2���� �ݺ��� �ۼ�
			sum += i;						//�ݺ��Ҷ����� i���� sum�� ���ϰ� sum�� ����
		}
		System.out.println(num1+" ~ "+num2+"�� ������ �� : "+ sum);	//for�� �ۿ� ���������߱⿡ ��밡��
		System.out.println();
		System.out.println();
	}
	public void exam7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		int sum=0;					//��½� �ջ��� ������ ��������, ������ �ʱ�ȭ
		
		for(int i=1; i<=num; i++) {	//�Է¹��� ����ŭ �ݺ�
			if(i%2 == 0) {			//i���� 2�� ���� ���������� 0�� ���ǹ��� ���� if�� ���
				sum+=i;				//sum�� ���ϰ� ����
			}
		}
		System.out.println("¦������ ���� : " + sum);
	}
	
	public void loop() {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("�ѹ� �� ����ұ��(1.yes/2.no)?");
			int sel = sc.nextInt();
			if(sel ==1) {
				System.out.println("ok");
			}else {
				continue;
			}
			System.out.println("�ݺ��� �������κп��� ����׽�Ʈ!");
		}
		//System.out.println("�ݺ��� ��!!"); //���ѹݺ��������� ������� �����Ҽ� ����
	}
	public void loop1() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("i : " + i);
			System.out.println("1/2/3�� �����ϼ���");
			int sel = sc.nextInt();
			if(sel ==1) {
				continue;
			}else if(sel == 2) {
				break;
			}else {
				System.out.println("������");
			}
			System.out.println("�ݺ��� ������ �ڵ�!");	//else�� �־�� ��°���
		}
	}
}


















