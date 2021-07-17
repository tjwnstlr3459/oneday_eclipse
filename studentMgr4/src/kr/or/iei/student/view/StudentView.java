package kr.or.iei.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.student.vo.Student;

public class StudentView {

	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {
		System.out.println("===학생관리 프로그램v4====");
		System.out.println("1.학생 정보 등록");
		System.out.println("2.전체 학생 출력");
		System.out.println("3.학생 출력(1명)");
		System.out.println("4.학생 수정");
		System.out.println("5.학생 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택>>>");

		int sel = sc.nextInt();
		return sel;
	}

	public Student getStudent(String str) {
		System.out.print(str + "할 학생 이름 입력 : ");
		String name = sc.next();
		System.out.print(str + "할 학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print(str + "할 학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		return s;
	}

	public void printAllStudent(ArrayList<Student> students) {
		System.out.println("====전체 학생 정보 출력====");
		System.out.println("이름\t나이\t주소");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));

		}
	}

	public void printOneStudent(Student student) {
		System.out.println("===조회할 학생 출력===");
		System.out.println("학생 이름 : " + student.getName());
		System.out.println("학생 나이 : " + student.getAge());
		System.out.println("학생 주소 : " +student.getAddr());

	}

	public Student modifyStudent() {

		System.out.print("수정할 학생 이름 :");
		String name = sc.next();
		System.out.print("수정할 학생 나이 :");
		int age = sc.nextInt();
		System.out.print("수정할 학생 주소 :");
		sc.nextLine();
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		return s;

	}

	public void printMsg(String str) {
		System.out.println(str);
	}

	public String inputName(String str) {
		System.out.print(str + "할 학생이름 :");
		String name = sc.next();
		return name;
	}


}
