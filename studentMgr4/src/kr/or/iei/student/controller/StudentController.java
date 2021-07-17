package kr.or.iei.student.controller;

import java.util.ArrayList;

import kr.or.iei.student.view.StudentView;
import kr.or.iei.student.vo.Student;

public class StudentController {

	ArrayList<Student> students;
	StudentView view;

	public StudentController() {
		super();
		students = new ArrayList<Student>();
		view = new StudentView();
	}

	public void main() {
		while (true) {
			int sel = view.showMenu();

			switch (sel) {
			case 1:
				// students.add(view.getStudent("���"));
				// ��ó�� ���ٷ� ��밡��
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
				deleteStudent();
				break;
			case 0:
				return;

			}
		}
	}

	public void insertStudent() {
		Student s = view.getStudent("���");
		students.add(s);

	}

	public void printAllStudent() {
		view.printAllStudent(students);

	}

	public void printOneStudent() {
		// view.printOneStudent(students);
		String name = view.inputName("��ȸ");
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			view.printMsg("�л������� �����ϴ�.");
		} else {
			view.printOneStudent(students.get(searchIndex));
		}

	}

	private void modifyStudent() {
		String name = view.inputName("����");
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			view.printMsg("�л������� �����ϴ�.");
		} else {
			Student suu = view.modifyStudent();
			students.set(searchIndex, suu);
		}
	}

	private void deleteStudent() {
		String name = view.inputName("����");
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			view.printMsg("�л������� �����ϴ�.");
		} else {
			students.remove(searchIndex);
			view.printMsg("���� �Ϸ�");
		}
	}

	public int searchStudent(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

}
