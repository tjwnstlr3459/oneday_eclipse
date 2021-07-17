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
		System.out.println("====회원 관리 프로그램v7====");
		System.out.println("1.회원 등록");
		System.out.println("2.전체 회원 출력");
		System.out.println("3.회원 정보 출력(1명)");
		System.out.println("4.회원 정보 수정");
		System.out.println("5.회원 정보 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택==> ");
		int sel = sc.nextInt();
		return sel;
	}


	public Grade getMember(String str) {
		System.out.print(str+"할 등급 [silver/gold/vip]:");
		String grade = sc.next();
		System.out.print(str+"할 이름 :");
		String name = sc.next();
		System.out.print(str+"할 포인트 :");
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
			System.out.println("잘못 입력하셨습니다.");
			break;
		}		
		return m;
		
		
		
	}

	public void AllMember(HashMap<String, Grade> members) {
	
		System.out.println("====전체 멤버 출력====");
		System.out.println("등급\t이름\t포인트\t보너스");
		
		Set<String> m = members.keySet();
		for (String member : m) {
			System.out.println(members.get(member));
		}
	}
		


	public void printMsg(String string) {
		System.out.println(string);
	}


	public void OneMember(Grade s) {
		System.out.println("====회원 1명 출력====");
		System.out.println("회원 등급: "+s.getGrade());
		System.out.println("회원 이름: "+s.getName());
		System.out.println("회원 포인트: "+s.getPoint());
	}


	public String getName(String string) {
		System.out.print(string+"할 회원 이름 : ");
		String name = sc.next();
		return name;
	}
	
	

}































