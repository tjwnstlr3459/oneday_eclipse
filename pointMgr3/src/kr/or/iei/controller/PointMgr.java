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
			System.out.println("\n====포인트 관리 프로그램 v3====\n");
			System.out.println("1. 회원 정보등록");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 ==>");
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
		System.out.println("===회원 정보 입력===");
		System.out.print("등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
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
		System.out.println("====전체 회원 출력====");
		System.out.println("등급\t이름\t포인트\t보너스");
		
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
		
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();
		
		int searchIndex = searchName(name);
		
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		}else if(count == 1) {
			System.out.println("등급 : "+s[searchIndex].getGrade());
			System.out.println("이름 : "+s[searchIndex].getName());
			System.out.println("포인트 : "+s[searchIndex].getPoint());
			System.out.println("보너스 : "+s[searchIndex].getBonus());
			
		}else if(count == 2) {
			System.out.println("등급 : "+g[searchIndex].getGrade());
			System.out.println("이름 : "+g[searchIndex].getName());
			System.out.println("포인트 : "+g[searchIndex].getPoint());
			System.out.println("보너스 : "+g[searchIndex].getBonus());
			
		}else if(count == 3) {
			System.out.println("등급 : "+v[searchIndex].getGrade());
			System.out.println("이름 : "+v[searchIndex].getName());
			System.out.println("포인트 : "+v[searchIndex].getPoint());
			System.out.println("보너스 : "+v[searchIndex].getBonus());
			
		}else{
			System.out.println("등급 : "+vv[searchIndex].getGrade());
			System.out.println("이름 : "+vv[searchIndex].getName());
			System.out.println("포인트 : "+vv[searchIndex].getPoint());
			System.out.println("보너스 : "+vv[searchIndex].getBonus());
			
		}
	}
	
	public void modifyMember() {
		System.out.print("수정할 회원 이름 입력 : ");
		String name = sc.next();
		
		int searchIndex = searchName(name);
		
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다.");
		}else {
			System.out.print("수정할 등급 : ");
			String mGrade = sc.next();
			System.out.print("수정할 이름 : ");
			String mName = sc.next();
			System.out.print("수정할 포인트 : ");
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
		
		System.out.println("수정 완료");
	}

	public void deleteMember() {
		System.out.println("==== 회원 삭제 ====");
		System.out.print("삭제할 회원 이름 입력 :");
		String name = sc.next();
		
		int searchIndex = searchName(name);
		
		if(searchIndex == -1) {
			System.out.println("회원 정보가 없습니다."	);
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
		
		
		System.out.println("삭제 완료");
		
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




























