package kr.or.iei.student.view;

import java.util.Scanner;

import kr.or.iei.student.model.vo.Student;

public class StudentView {
	
	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {		//Controller�� ���ڸ� ����������
		System.out.println("====�л����� ���α׷�v3====");
		System.out.println("1. �л����");
		System.out.println("2. �л���ü ��ȸ");
		System.out.println("3. �л� 1�� ��ȸ");
		System.out.println("4. �л����� ����");
		System.out.println("5. �л����� ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("����==> ");
		
		int sel = sc.nextInt();
		return sel;
	}
	public Student insertStudent() {
		System.out.println("====�л� ���� ���====");
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("�л� ���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("�л� �ּ� �Է� : ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		Student s = new Student(name,age,addr);
		return s;
	}
	
	public void printAllStudent(Student[] s, int index) {
		System.out.println("====�л� ���� ���====");
		System.out.println("�̸�\t����\t�ּ�");
		for (int i = 0; i < index; i++) {
			//System.out.println(s[i].getName()+"\t"+s[i].getAge()+"\t"+s[i].getAddr());
			System.out.println(s[i]);	//
		}
	}
	public String inputName(String msg) {
		System.out.print(msg+"�� �л� �̸� �Է� :"); 
		String name = sc.next();
		return name;
	}

	public void printMsg(String msg){
		System.out.println(msg);
	}
		
	/*public void printOneStudent(Student[]s, int index, int searchIndex) {
		for (int i = 0; i < index; i++) {
			if(i==searchIndex) {
				System.out.println("�л� �̸� : "+s[searchIndex].getName());
				System.out.println("�л� ���� : "+s[searchIndex].getAge());
				System.out.println("�л� �ּ� : "+s[searchIndex].getAddr());
			}
		}
	}*/
	public void printOneStudent(Student s) {	//���ּҰ� ���� �л����� ������
		System.out.println("�л� �̸� : "+s.getName());
		System.out.println("�л� ���� : "+s.getAge());
		System.out.println("�л� �ּ� : "+s.getAddr());
	}
		
		
	public Student modifyStudent(){
		System.out.println("������ �л� �̸� �Է� : ");
		String mName = sc.next();
		System.out.println("������ �л� ���� �Է� : ");
		int age = sc.nextInt();
		System.out.println("������ �л� �ּ� �Է� : ");
		sc.nextLine();
		String mAddr = sc.nextLine();
		
		Student s = new Student(mName,age,mAddr);
		return s;
	}

}























