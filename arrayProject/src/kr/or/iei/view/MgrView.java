package kr.or.iei.view;

import java.util.Scanner;
import kr.or.iei.vo.Grade;
import kr.or.iei.vo.Silver;
import kr.or.iei.vo.Gold;
import kr.or.iei.vo.Vip;
import kr.or.iei.vo.Vvip;

public class MgrView {
	Scanner sc = new Scanner(System.in);
	
	public int showMenu() {
		System.out.println("===== 회원 관리 프로그램 v.5.0 =====");
		System.out.println("1.회원 등록");
		System.out.println("2.전체 회원정보 출력");
		System.out.println("3.회원정보 출력(1명)");
		System.out.println("4.회원정보 수정");
		System.out.println("5.회원정보 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택 : ");
		int sel = sc.nextInt();
		return sel;
	}
	public Grade insertMember() {
		System.out.println("===== 회원 등록 =====");
		System.out.print("등급 입력 [silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
		int point = sc.nextInt();
		Grade member = null;
		switch(grade){
		case "silver":
			member = new Silver(grade, name, point);
			break;
		case "gold":
			member = new Gold(grade, name, point);
			break;
		case "vip":
			member = new Vip(grade, name, point);
			break;
		case "vvip":
			member = new Vvip(grade, name, point);
			break;
		}
		return member;
	}
	public void printAllMember(Grade[] members, int index) {
		System.out.println("===== 전체 회원정보 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		for(int i=0;i<index;i++) {
			System.out.println(members[i].getGrade()+"\t"+members[i].getName()
					+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
		}
	}
	public void printOneMember(Grade members) {
		System.out.println("===== 회원정보 출력(1명) =====");
		System.out.println("등급 : "+members.getGrade());
		System.out.println("이름 : "+members.getName());
		System.out.println("포인트 : "+members.getPoint());
		System.out.println("보너스 : "+members.getBonus());
	}
	public Grade modifyMember() {
		System.out.println("===== 회원정보 수정 =====");
		System.out.print("수정할 등급 : ");
		String mGrade = sc.next();
		System.out.print("수정할 이름 : ");
		String mName = sc.next();
		System.out.print("수정할 포인트 : ");
		int mPoint = sc.nextInt();
		Grade newInfo = null;
		switch(mGrade) {
		case "silver":
			newInfo = new Silver(mGrade, mName, mPoint);
			break;
		case "gold":
			newInfo = new Gold(mGrade, mName, mPoint);
			break;
		case "vip":
			newInfo = new Vip(mGrade, mName, mPoint);
			break;
		case "vvip":
			newInfo = new Vvip(mGrade, mName, mPoint);
			break;
		}
		return newInfo;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
	}
	public String searchMember(String msg) {
		System.out.print(msg+"할 이름 입력 : ");
		String name = sc.next();
		return name;
	}
}
