package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Silver;

public class PointMgr {

	Scanner sc;
	
	Silver[] s;
	
	
	int index;

	//alt + shift + s = c
	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		s = new Silver[10];
		index = 0;
	}
	
	public void main() {
		
		while(true) {
			System.out.println("\n----����Ʈ ���� ���α׷�v1----\n");
			System.out.println("1. ȸ�� ���� ���");
			System.out.println("2. ��ü ȸ�� ��ȸ");
			System.out.println("3. ȸ�� 1�� ��ȸ");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ��  ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� ==>");
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				modifyMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("bye~!");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public void insertMember() {
		System.out.println("----ȸ�� ���� �Է�----");
		System.out.print("����Է� : ");
		String grade = sc.next();
		System.out.print("�̸��Է� : ");
		String name = sc.next();
		System.out.print("����Ʈ �Է�  : ");
		int point = sc.nextInt();
		
		s[index++] = new Silver(grade, name, point);
		System.out.println("��� �Ϸ�");
		/*�Ʒ������� �ٿ��� ��ó�� �Է�
		 * Silver silver = new Silver(grade, name, point);
		s[index] = silver;
		index++;*/
	}
	public void printAllMember() {
		System.out.println("----��ü ȸ�� ���----");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		for (int i = 0; i < index; i++) {
			System.out.println(s[i].getGrade()+"\t"+s[i].getName()+"\t"+s[i].getPoint()+"\t"+s[i].getBonus());
		}
	}
	public void printOneMember() {
		System.out.println("----ȸ�� ���� ���----");
		System.out.print("��ȸ �� ȸ�� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchMember(name);
		
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			System.out.println("��� : "+s[searchIndex].getGrade());
			System.out.println("�̸� : "+s[searchIndex].getName());
			System.out.println("����Ʈ : "+s[searchIndex].getPoint());
			System.out.println("���ʽ� : "+s[searchIndex].getBonus());
		}
	}
	public void modifyMember() {
		System.out.println("----ȸ�� ���� ����----");
		System.out.print("���� �� ȸ�� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("ȸ�������� �����ϴ�.");
		}else {
			System.out.println("������ ��� : ");
			//s[searchIndex].setGrade(sc.next());
			String mGrade = sc.next();
			
			System.out.println("������ �̸� : ");
			//s[searchIndex].setName(sc.next());
			String mName = sc.next();
			
			System.out.println("������ ����Ʈ : ");
			//s[searchIndex].setPoint(sc.nextInt());
			int mPoint = sc.nextInt();
			
			//���ο� silver ��ü�� �����ؼ� �ش� ��ü�� �迭�� ���� ����
			s[searchIndex] = new Silver(mGrade, mName, mPoint);
			
			System.out.println("�����Ϸ�");
		}
	}
	
	public void deleteMember() {
		System.out.println("----ȸ�� ���� ����----");
		System.out.print("���� �� ȸ�� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchMember(name);
		if(searchIndex == -1) {
			System.out.println("ȸ�������� �����ϴ�.");
		}else {
			for (int i = searchIndex; i < index-1; i++) {
				s[i]=s[i+1];
			}
			s[index--] = null;
		}
	}
	
	public int searchMember(String name) {
		for (int i = 0; i < index; i++) {
			if(s[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	
}



































