package controller;

import java.util.HashMap;

import view.View;
import vo.Student;

public class Controller {

	HashMap<String, Student> students;
	
	View view;

	public Controller() {
		super();
		students = new HashMap<>();
		view = new View();
	}
	
	public void main() {
		
		while(true) {
			
			switch (view.menu()) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudnet();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudnet();
				break;
			case 0:
				System.out.println("bye~");
				break;
			}
		}
	}



	


	private void insertStudent() {
		Student s = view.insertStudent("등록");
		students.put(s.getName(), s);
	}
	
	private void printAllStudent() {
		view.studentAllStudent(students);
	}

	private void printOneStudnet() {
		String name = view.OntStudent("조회");
		
		Student s = students.get(name);
		if(s ==null) {
			System.out.println("존재하지 않는 학생입니다.");
		}else {
			view.OneStudent(s);
		}
	}
	
	private void modifyStudent() {
		String name = view.OntStudent("수정");
		
		if(students.containsKey(name)) {
			students.remove(name);
			
			Student s =view.insertStudent("수정");
			students.put(s.getName(), s);
		}
	}

	private void deleteStudnet() {
		String name = view.OntStudent("삭제");
		
		if(students.containsKey(name)) {
			students.remove(name);
		}else {
			System.out.println("학생정보가 없습니다.");
		}
	}
	
}






















