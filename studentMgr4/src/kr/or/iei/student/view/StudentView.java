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
		System.out.println("===�л����� ���α׷�v4====");
		System.out.println("1.�л� ���� ���");
		System.out.println("2.��ü �л� ���");
		System.out.println("3.�л� ���(1��)");
		System.out.println("4.�л� ����");
		System.out.println("5.�л� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("����>>>");

		int sel = sc.nextInt();
		return sel;
	}

	public Student getStudent(String str) {
		System.out.print(str + "�� �л� �̸� �Է� : ");
		String name = sc.next();
		System.out.print(str + "�� �л� ���� �Է� : ");
		int age = sc.nextInt();
		System.out.print(str + "�� �л� �ּ� �Է� : ");
		sc.nextLine();
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		return s;
	}

	public void printAllStudent(ArrayList<Student> students) {
		System.out.println("====��ü �л� ���� ���====");
		System.out.println("�̸�\t����\t�ּ�");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));

		}
	}

	public void printOneStudent(Student student) {
		System.out.println("===��ȸ�� �л� ���===");
		System.out.println("�л� �̸� : " + student.getName());
		System.out.println("�л� ���� : " + student.getAge());
		System.out.println("�л� �ּ� : " +student.getAddr());

	}

	public Student modifyStudent() {

		System.out.print("������ �л� �̸� :");
		String name = sc.next();
		System.out.print("������ �л� ���� :");
		int age = sc.nextInt();
		System.out.print("������ �л� �ּ� :");
		sc.nextLine();
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		return s;

	}

	public void printMsg(String str) {
		System.out.println(str);
	}

	public String inputName(String str) {
		System.out.print(str + "�� �л��̸� :");
		String name = sc.next();
		return name;
	}


}
