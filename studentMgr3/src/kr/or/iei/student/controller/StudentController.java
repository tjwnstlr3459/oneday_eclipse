package kr.or.iei.student.controller;

import kr.or.iei.student.model.vo.Student;
import kr.or.iei.student.view.StudentView;

public class StudentController {

	Student[] s;
	int index;
	StudentView view;
	
	public StudentController() {
		super();
		s = new Student[10];
		index = 0;
		view = new StudentView();
	}
	
	public void main() {
		
		while(true) {
			int sel = view.showMenu();	//���θ޴��� �����ְ�
										//�޴����ð��� �����ϴ� �޼ҵ�
			switch (sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudnet();
				break;
			case 0:
				view.printMsg("bye~!");
				return;
			
			}
		}
	}
	public void insertStudent() {
		//1. �л����� �Է¹ޱ�
		Student stu = view.insertStudent();
		//2. �Է¹��� ������ ��ü�� ���� �迭�� ����
		s[index++] = stu;
		//s[index++] = new Student(stu.getName(),stu.getAge(),stu.getAddr());
	}
	
	public void printAllStudent() {
		view.printAllStudent(s,index);
	}
	
	public void printOneStudent() {
		//1.����� �л� �̸��� �Է�				->	view
		//2.�Է¹��� �̸��� �迭�� ���° �����ϴ� ��ȸ	->controller	
		//3.�迭�� �����ϴ� ��� �ش� �л� ������ ���	->view
		
		String name = view.inputName("��ȸ");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("�л����� ����");
		}else {
			//view�� �̿��ؼ� �л� 1�� ������ ���
			//view.printOneStudent(s, index, searchIndex);
			
			//view.printOneStudent(s[searchIndex].getName()+s[searchIndex].getAge()+s[searchIndex].getAddr());
			//���⼭ �ʿ��� ��츸 �����°��
			
			view.printOneStudent(s[searchIndex]);
			//�ʿ��� �͸� ������ ���
		}
	}
	
	public void modifyStudent() {
		String name = view.inputName("����");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("�л������� �����ϴ�.");
		}else {
			Student student = view.modifyStudent(); //��ĳ����
			s[searchIndex] = student;
		}
	}
	
	public void deleteStudnet() {
		String name = view.inputName("����");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("�л������� �����ϴ�.");
		}else {
			for (int i = 0; i < index; i++) {
				s[index] = s[index+1];
			}
			s[--index] = null;
		}
	}
	
	
	
	public int searchStudent(String name) {
		for (int i = 0; i < index; i++) {
			if(s[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	
}
































