package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import vo.Gold;
import vo.Grade;
import vo.Silver;
import vo.Vip;

public class View {
	Scanner sc;
	

	public View() {
		super();
		sc = new Scanner(System.in);
	}


	public int showMenu() {
		System.out.println("====ȸ�� ���� ���α׷�v7====");
		System.out.println("1.ȸ�� ���");
		System.out.println("2.��ü ȸ�� ���");
		System.out.println("3.ȸ�� ���� ���(1��)");
		System.out.println("4.ȸ�� ���� ����");
		System.out.println("5.ȸ�� ���� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("����==> ");
		int sel = sc.nextInt();
		return sel;
	}


	public Grade getMember(String str) {
		System.out.print(str+"�� ��� [silver/gold/vip]:");
		String grade = sc.next();
		System.out.print(str+"�� �̸� :");
		String name = sc.next();
		System.out.print(str+"�� ����Ʈ :");
		int point = sc.nextInt();
		
		Grade m = null;
		switch (grade) {
		case "silver":
			m = new Silver(grade, name, point);
			break;
		case "gold":
			m = new Gold(grade, name, point);
			break;
		case "vip":
			m = new Vip(grade, name, point);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}		
		return m;
		
		
		
	}

	public void AllMember(HashMap<String, Grade> members) {
	
		System.out.println("====��ü ��� ���====");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		
		Set<String> m = members.keySet();
		for (String member : m) {
			System.out.println(members.get(member));
		}
	}
		


	public void printMsg(String string) {
		System.out.println(string);
	}


	public void OneMember(Grade s) {
		System.out.println("====ȸ�� 1�� ���====");
		System.out.println("ȸ�� ���: "+s.getGrade());
		System.out.println("ȸ�� �̸�: "+s.getName());
		System.out.println("ȸ�� ����Ʈ: "+s.getPoint());
	}


	public String getName(String string) {
		System.out.print(string+"�� ȸ�� �̸� : ");
		String name = sc.next();
		return name;
	}
	
	

}































