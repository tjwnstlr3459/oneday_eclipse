package view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import vo.Student;

public class View {
	Scanner sc;

	public View() {
		super();
		sc = new Scanner(System.in);
	}

	public int menu() {
		System.out.println("====학생관리 프로그램v6====");
		System.out.println("1.학생 입력");
		System.out.println("2.전체 학생 출력");
		System.out.println("3.학생 출력(1명)");
		System.out.println("4.학생 수정");
		System.out.println("5.학생 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택>>>");
		return sc.nextInt();
	}

	public Student insertStudent(String str) {
		System.out.println("====학생정보 입력====");
		System.out.print(str +"할 이름입력 : ");
		String name = sc.next();
		System.out.print(str +"할 나이입력 : ");
		int age = sc.nextInt();
		System.out.print(str +"할 주소입력 : ");
		String addr = sc.next();
		Student s = new Student(name,age,addr);
		return s;
		
		
	}

	public void studentAllStudent(HashMap<String, Student> students) {
		
		System.out.println("====전체학생출력====");
		System.out.println("이름\t나이\t주소");
		
		Set<String> key =  students.keySet();
		
		for (String keys : key) {
			System.out.println(students.get(keys));
		}
	}

	public String OntStudent(String str) {
		System.out.println(str+"할 학생이름 : ");
		String name = sc.next();
		return name;
		
	}

	public void OneStudent(Student s) {
		System.out.println("====조회한 학생 정보====");
		System.out.println("이름 :"+s.getName());
		System.out.println("나이 :"+s.getAge());
		System.out.println("주소 :"+s.getAddr());		
	}

}













