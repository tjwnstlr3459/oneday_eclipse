package view;

import java.util.HashMap;
import java.util.Scanner;

import vo.Members;

public class View {
	Scanner sc;

	public View() {
		super();
		sc = new Scanner(System.in);
	}

	public String getName(String str) {
		System.out.print(str + "할 회원 이름 : ");
		String name = sc.next();
		return name;
	}

	public void printMsg(String str) {
		System.out.println(str);
	}

	public int showMenu() {
		System.out.println("====회원관리 프로그램====");
		System.out.println("1. 회원 가입");
		System.out.println("2. 전체 회원 정보 조회");
		System.out.println("3. 회원 정보 조회(1명)");
		System.out.println("4. 정수 수정(ID변경 불가)");
		System.out.println("5. 회원 탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택>>");
		int sel = sc.nextInt();
		return sel;
	}

	public Members getInsert(String str, HashMap<String, Members> mem, String id) {
		System.out.print(str + " 비밀번호 입력 : ");
		String pass = sc.next();
		System.out.print(str + " 이름 입력 : ");
		String name = sc.next();
		System.out.print(str + " 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print(str + " 전화번호 입력 : ");
		String phon = sc.next();
		Members s = new Members(id, pass, name, age, phon);
		return s;

	}

	public void Allmember(HashMap<String, Members> mem) {
		System.out.println("====전체 회원 정보 출력====");
		System.out.println("아이디\t\t이름\t나이\t전화번호");
		for (String id : mem.keySet()) {
			System.out.println(mem.get(id).getId() + "\t" + mem.get(id).getName() + "\t" 
							+ mem.get(id).getAge() + "\t"+ mem.get(id).getPhon());
		}
	}

	public void OneMember(Members s) {
		System.out.println("ID :" + s.getId());
		System.out.println("Password :" + s.getPass());
		System.out.println("이름 :" + s.getName());
		System.out.println("나이 :" + s.getAge());
		System.out.println("전화번호 : " + s.getPhon());
	}

	public String idCheck(String str) {
		System.out.print(str + "할 ID 입력:");
		String id = sc.next();
		return id;
	}

	public String passCheck(String str) {
		System.out.print(str + "할 비밀번호 입력 : ");
		String pass = sc.next();
		return pass;
	}
}
