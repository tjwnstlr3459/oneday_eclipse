package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Grade;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Vip;
import kr.or.iei.vo.Vvip;

public class PointMgr {

	Scanner sc;
	
	Grade[] members;	//�������� �̿��� �ϳ��� ��ü�� ����
	
	int index;

	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		members = new Grade[40];
		index = 0;
	}
	
	public void main() {
		while(true) {
			System.out.println("====ȸ�� ���� ���α׷� v4====");
			System.out.println("1. ȸ�� ���");
			System.out.println("2. ��ü ȸ�� ���");
			System.out.println("3. ȸ�� ���� ���(1��)");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� ==>");
			
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllmember();
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
				System.out.println("bye~~!");
				return;
			
			}
		}
	}
	
	public void insertMember() {
		System.out.println("====ȸ�� ���� ���====");
		System.out.print("��� �Է�[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("����Ʈ �Է� : ");
		int point = sc.nextInt();
		
		switch (grade) {
		case "silver":
			members[index++] = new Silver(grade, name, point);
			break;
		case "gold":
			members[index++] = new Gold(grade, name, point);
			break;
		case "vip":
			members[index++] = new Vip(grade, name, point);
			break;
		case "vvip":
			members[index++] = new Vvip(grade, name, point);
			break;
		}
		System.out.println("ȸ�� ��� �Ϸ�");
	}
	
	public void printAllmember() {
		System.out.println("====��ü ȸ�� ���====");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		for (int i = 0; i < index; i++) {
			System.out.println(members[i].getGrade()+"\t"+members[i].getName()+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
		}
	}
	
	public void printOneMember() {
		System.out.println("====ȸ�� ���� ���====");
		System.out.print("ȸ�� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchMember(name);
		
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			System.out.println("��� : "+ members[searchIndex].getGrade());
			System.out.println("�̸� : "+ members[searchIndex].getName());
			System.out.println("����Ʈ : "+ members[searchIndex].getPoint());
		}
	}

	public void modifyMember() {
		System.out.println("====ȸ�� ���� ����====");
		System.out.print("������ ȸ�� �̸� : ");
		String name = sc.next();
		
		int searchIndex = searchMember(name);
		
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			
			System.out.print("������ ���[silver/gold/vip/vvip]: ");
			String mGrade = sc.next();
			System.out.print("������ �̸� : ");
			String mName = sc.next();
			System.out.print("������ ����Ʈ : ");
			int mPoint = sc.nextInt();
			
			switch (mGrade) {
			case "silver":
				members[searchIndex] = new Silver(mGrade, mName, mPoint);
				break;
			case "gold":
				members[searchIndex] = new Gold(mGrade, mName, mPoint);
				break;
			case "vip":
				members[searchIndex] = new Vip(mGrade, mName, mPoint);
				break;
			case "vvip":
				members[searchIndex] = new Vvip(mGrade, mName, mPoint);
				break;
			}
		}
	}
	
	public void deleteMember() {
		System.out.println("====ȸ�� ���� ����====");
		System.out.print("������ ȸ�� �̸� : ");
		String name = sc.next();

		int searchIndex = searchMember(name);

		if(searchIndex ==-1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			for (int i = searchIndex; i <index-1; i++) {
				members[i] = members[i+1];
			}
			members[--index]= null;
			System.out.println("���� �Ϸ�!");
		}
	}
	
	
	public int searchMember(String name) {
		for (int i = 0; i < index; i++) {
			if(members[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}


























