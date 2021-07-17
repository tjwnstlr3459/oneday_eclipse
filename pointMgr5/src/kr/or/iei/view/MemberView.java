package kr.or.iei.view;

import java.util.Scanner;

import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Grade;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Vip;
import kr.or.iei.vo.Vvip;

public class MemberView {

	
	Scanner sc;

	public MemberView() {
		super();
		sc = new Scanner(System.in);
	}
	
	public String intputName(String msg) {
		System.out.print(msg+"�� ��� �̸� : ");
		String name = sc.next();
		return name;
	}
	
	public int memberShow() {
		System.out.println("====ȸ�� ���� ���α׷�v5====");
		System.out.println("1.ȸ�� ���");
		System.out.println("2.��ü ȸ�� ���");
		System.out.println("3.ȸ������ ���(1��)");
		System.out.println("4.ȸ�� ���� ����");
		System.out.println("5.ȸ�� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("����==>");
		int sel = sc.nextInt();
		return sel;
	}
	
	public Grade insertMember() {
		System.out.println("====ȸ�� ���� ���====");
		System.out.print("����Է�[silver/gold/vip/vvip] :");
		String grade = sc.next();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("����Ʈ �Է� : ");
		int point = sc.nextInt();
		//Grade m = new Grade(grade,name,point); //Grade�߻�Ŭ������ �������� ���
		//return m;
		
		//Grade�߻�Ŭ���� ������ new Grade�� ���Ұ�
		Grade member = null;
		switch (grade) {
		case "silver":
			member = new Silver(grade,name,point);
			break;
		case "gold":
			member = new Gold(grade,name,point);
			break;
		case "vip":
			member = new Vip(grade,name,point);
			break;
		case "vvip":
			member = new Vvip(grade,name,point);
			break;		
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
		return member;
	}
	
	public void printAllmember(Grade[]members,int index) {
		System.out.println("====��ü ȸ�� ���====");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		for (int i = 0; i < index; i++) {
			System.out.println(members[i].getGrade()+"\t"+members[i].getName()+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
		}
	}
	
	public void printOneMember(int memberIndex,Grade[]members) {
		System.out.println("��� : "+members[memberIndex].getGrade());
		System.out.println("�̸� : "+members[memberIndex].getName());
		System.out.println("����Ʈ : "+members[memberIndex].getPoint());
		
	}
	
		
	public Grade modifyMember() {
		System.out.print("������ ���[silver/gold/vip/vvip] : ");
		String mGrade = sc.next();
		System.out.print("������ �̸� : ");
		String mName = sc.next();
		System.out.print("������ ����Ʈ : ");
		int mPoint = sc.nextInt();
		
		Grade member = null;
		switch (mGrade) {
		case "silver":
			member = new Silver(mGrade,mName,mPoint);
			break;
		case "gold":
			member = new Gold(mGrade,mName,mPoint);
			break;
		case "vip":
			member = new Vip(mGrade,mName,mPoint);
			break;
		case "vvip":
			member = new Vvip(mGrade,mName,mPoint);
			
			break;		
		}
		System.out.println("��� �Ϸ�!");
		return member;
	}
}





















