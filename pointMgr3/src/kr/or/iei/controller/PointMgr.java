package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Vip;
import kr.or.iei.vo.Vvip;

public class PointMgr {

	Scanner sc;

	Silver[] s;
	Gold[] g;
	Vip[] v;
	Vvip[] vv;

	int index;
	int gIndex;
	int vIndex;
	int vvIndex;

	private int count;


	public PointMgr() {
		super();
		sc = new Scanner(System.in);
		s = new Silver[10];
		g = new Gold[10];
		v = new Vip[10];
		vv = new Vvip[10];

		index = 0;
	}

	public void main() {

		while(true) {
			System.out.println("\n====����Ʈ ���� ���α׷� v3====\n");
			System.out.println("1. ȸ�� �������");
			System.out.println("2. ��ü ȸ�� ��ȸ");
			System.out.println("3. ȸ�� 1�� ��ȸ");
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
				System.out.println("bye~!!!");
				return;
			}

		}
	}

	public void insertMember() {
		System.out.println("===ȸ�� ���� �Է�===");
		System.out.print("��� �Է�[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("����Ʈ �Է� : ");
		int point = sc.nextInt();

		switch (grade) {
		case "silver":
			s[index++] = new Silver(grade, name, point);
			break;
		case "gold":
			g[gIndex++] = new Gold(grade, name, point);
			break;
		case "vip":
			v[vIndex++] = new Vip(grade, name, point);
			break;
		case "vvip":
			vv[vvIndex++] = new Vvip(grade, name, point);
			break;
		}
	}
	
	public void printAllMember() {
		System.out.println("====��ü ȸ�� ���====");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		
		for (int i = 0; i < index; i++) {
			System.out.println(s[i].getGrade()+"\t"+s[i].getName()+"\t"+s[i].getPoint()+"\t"+s[i].getBonus());
		}
		for (int i = 0; i < gIndex; i++) {
			System.out.println(g[i].getGrade()+"\t"+g[i].getName()+"\t"+g[i].getPoint()+"\t"+g[i].getBonus());
		}
		for (int i = 0; i < vIndex; i++) {
			System.out.println(v[i].getGrade()+"\t"+v[i].getName()+"\t"+v[i].getPoint()+"\t"+v[i].getBonus());
		}
		for (int i = 0; i < vvIndex; i++) {
			System.out.println(vv[i].getGrade()+"\t"+vv[i].getName()+"\t"+vv[i].getPoint()+"\t"+vv[i].getBonus());
		}
	}
	
	public void printOneMember() {
		
		System.out.print("��ȸ �� ȸ�� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchName(name);
		
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else if(count == 1) {
			System.out.println("��� : "+s[searchIndex].getGrade());
			System.out.println("�̸� : "+s[searchIndex].getName());
			System.out.println("����Ʈ : "+s[searchIndex].getPoint());
			System.out.println("���ʽ� : "+s[searchIndex].getBonus());
			
		}else if(count == 2) {
			System.out.println("��� : "+g[searchIndex].getGrade());
			System.out.println("�̸� : "+g[searchIndex].getName());
			System.out.println("����Ʈ : "+g[searchIndex].getPoint());
			System.out.println("���ʽ� : "+g[searchIndex].getBonus());
			
		}else if(count == 3) {
			System.out.println("��� : "+v[searchIndex].getGrade());
			System.out.println("�̸� : "+v[searchIndex].getName());
			System.out.println("����Ʈ : "+v[searchIndex].getPoint());
			System.out.println("���ʽ� : "+v[searchIndex].getBonus());
			
		}else{
			System.out.println("��� : "+vv[searchIndex].getGrade());
			System.out.println("�̸� : "+vv[searchIndex].getName());
			System.out.println("����Ʈ : "+vv[searchIndex].getPoint());
			System.out.println("���ʽ� : "+vv[searchIndex].getBonus());
			
		}
	}
	
	public void modifyMember() {
		System.out.print("������ ȸ�� �̸� �Է� : ");
		String name = sc.next();
		
		int searchIndex = searchName(name);
		
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}else {
			System.out.print("������ ��� : ");
			String mGrade = sc.next();
			System.out.print("������ �̸� : ");
			String mName = sc.next();
			System.out.print("������ ����Ʈ : ");
			int mPoint = sc.nextInt();
			
			if(count==1) {
				for (int i = searchIndex; i < index-1; i++) {
					s[i]=s[i+1];
				}
				s[index--] = null;
			}else if(count==2) {
				for (int i = searchIndex; i < gIndex-1; i++) {
					g[i]=g[i+1];
				}
				g[gIndex--] = null;
			}else if(count==3) {
				for (int i = searchIndex; i < vIndex-1; i++) {
					s[i]=s[i+1];
				}
				v[vIndex--] = null;
			}else {
				for (int i = searchIndex; i < vvIndex-1; i++) {
					vv[i]=vv[i+1];
				}
				vv[vvIndex--] = null;
			}
			
			switch (mGrade) {
			case "silver":
				s[index++] = new Silver(mGrade, mName, mPoint);
				break;
			case "gold":
				g[gIndex++] = new Gold(mGrade, mName, mPoint);
				break;
			case "vip":
				v[vIndex++] = new Vip(mGrade, mName, mPoint);
				break;
			case "vvip":
				vv[vvIndex++] = new Vvip(mGrade, mName, mPoint);
				break;
		}
		
		
		}
		
		System.out.println("���� �Ϸ�");
	}

	public void deleteMember() {
		System.out.println("==== ȸ�� ���� ====");
		System.out.print("������ ȸ�� �̸� �Է� :");
		String name = sc.next();
		
		int searchIndex = searchName(name);
		
		if(searchIndex == -1) {
			System.out.println("ȸ�� ������ �����ϴ�."	);
		}else if(count ==1) {
			for (int i = searchIndex; i < index-1; i++) {
				s[i]=s[i+1];
			}
			s[index--]=null;
		}else if(count ==2) {
			for (int i = searchIndex; i < gIndex-1; i++) {
				s[i]=s[i+1];
			}
			g[gIndex--]=null;
		}else if(count ==3) {
			for (int i = searchIndex; i < vIndex-1; i++) {
				v[i]=v[i+1];
			}
			v[vIndex--]=null;
		}else {
			for (int i = searchIndex; i < vvIndex-1; i++) {
				vv[i]=vv[i+1];
			}
			vv[vvIndex--]=null;
		}
		
		
		System.out.println("���� �Ϸ�");
		
	}
	
	public int searchName(String name) {
		
		for (int i = 0; i < index; i++) {
			if(s[i].getName().equals(name)) {
				count=1;
				return i;
			}
		}
		for (int i = 0; i < gIndex; i++) {
			if(g[i].getName().equals(name)) {
				count=2;
				return i;
			}
		}
		for (int i = 0; i < vIndex; i++) {
			if(v[i].getName().equals(name)) {
				count=3;
				return i;
			}
		}
		for (int i = 0; i < vvIndex; i++) {
			if(vv[i].getName().equals(name)) {
				count=4;
				return i;
			}
		}
		return -1;
	}
}




























