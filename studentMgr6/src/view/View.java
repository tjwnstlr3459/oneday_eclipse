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
		System.out.println("====�л����� ���α׷�v6====");
		System.out.println("1.�л� �Է�");
		System.out.println("2.��ü �л� ���");
		System.out.println("3.�л� ���(1��)");
		System.out.println("4.�л� ����");
		System.out.println("5.�л� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("����>>>");
		return sc.nextInt();
	}

	public Student insertStudent(String str) {
		System.out.println("====�л����� �Է�====");
		System.out.print(str +"�� �̸��Է� : ");
		String name = sc.next();
		System.out.print(str +"�� �����Է� : ");
		int age = sc.nextInt();
		System.out.print(str +"�� �ּ��Է� : ");
		String addr = sc.next();
		Student s = new Student(name,age,addr);
		return s;
		
		
	}

	public void studentAllStudent(HashMap<String, Student> students) {
		
		System.out.println("====��ü�л����====");
		System.out.println("�̸�\t����\t�ּ�");
		
		Set<String> key =  students.keySet();
		
		for (String keys : key) {
			System.out.println(students.get(keys));
		}
	}

	public String OntStudent(String str) {
		System.out.println(str+"�� �л��̸� : ");
		String name = sc.next();
		return name;
		
	}

	public void OneStudent(Student s) {
		System.out.println("====��ȸ�� �л� ����====");
		System.out.println("�̸� :"+s.getName());
		System.out.println("���� :"+s.getAge());
		System.out.println("�ּ� :"+s.getAddr());		
	}

}













