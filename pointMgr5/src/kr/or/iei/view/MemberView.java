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
		System.out.print(msg+"할 멤버 이름 : ");
		String name = sc.next();
		return name;
	}
	
	public int memberShow() {
		System.out.println("====회원 관리 프로그램v5====");
		System.out.println("1.회원 등록");
		System.out.println("2.전체 회원 출력");
		System.out.println("3.회원정보 출력(1명)");
		System.out.println("4.회원 정보 수정");
		System.out.println("5.회원 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택==>");
		int sel = sc.nextInt();
		return sel;
	}
	
	public Grade insertMember() {
		System.out.println("====회원 정보 등록====");
		System.out.print("등급입력[silver/gold/vip/vvip] :");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
		int point = sc.nextInt();
		//Grade m = new Grade(grade,name,point); //Grade추상클래스를 지웠을시 사용
		//return m;
		
		//Grade추상클래스 때문에 new Grade는 사용불가
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
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		return member;
	}
	
	public void printAllmember(Grade[]members,int index) {
		System.out.println("====전체 회원 출력====");
		System.out.println("등급\t이름\t포인트\t보너스");
		for (int i = 0; i < index; i++) {
			System.out.println(members[i].getGrade()+"\t"+members[i].getName()+"\t"+members[i].getPoint()+"\t"+members[i].getBonus());
		}
	}
	
	public void printOneMember(int memberIndex,Grade[]members) {
		System.out.println("등급 : "+members[memberIndex].getGrade());
		System.out.println("이름 : "+members[memberIndex].getName());
		System.out.println("포인트 : "+members[memberIndex].getPoint());
		
	}
	
		
	public Grade modifyMember() {
		System.out.print("변경할 등급[silver/gold/vip/vvip] : ");
		String mGrade = sc.next();
		System.out.print("변경할 이름 : ");
		String mName = sc.next();
		System.out.print("변경할 포인트 : ");
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
		System.out.println("등록 완료!");
		return member;
	}
}





















