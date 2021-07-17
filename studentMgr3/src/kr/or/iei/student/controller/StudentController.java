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
			int sel = view.showMenu();	//메인메뉴를 보여주고
										//메뉴선택값을 리턴하는 메소드
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
		//1. 학생정보 입력받기
		Student stu = view.insertStudent();
		//2. 입력받은 정보로 객체를 만들어서 배열에 저장
		s[index++] = stu;
		//s[index++] = new Student(stu.getName(),stu.getAge(),stu.getAddr());
	}
	
	public void printAllStudent() {
		view.printAllStudent(s,index);
	}
	
	public void printOneStudent() {
		//1.출력할 학생 이름을 입력				->	view
		//2.입력받은 이름이 배열에 몇번째 존재하는 조회	->controller	
		//3.배열에 존재하는 경우 해당 학생 정보를 출력	->view
		
		String name = view.inputName("조회");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("학생정보 없음");
		}else {
			//view를 이용해서 학생 1명 정보를 출력
			//view.printOneStudent(s, index, searchIndex);
			
			//view.printOneStudent(s[searchIndex].getName()+s[searchIndex].getAge()+s[searchIndex].getAddr());
			//여기서 필요한 경우만 보내는경우
			
			view.printOneStudent(s[searchIndex]);
			//필요한 것만 보내준 경우
		}
	}
	
	public void modifyStudent() {
		String name = view.inputName("수정");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("학생정보가 없습니다.");
		}else {
			Student student = view.modifyStudent(); //업캐스팅
			s[searchIndex] = student;
		}
	}
	
	public void deleteStudnet() {
		String name = view.inputName("삭제");
		int searchIndex = searchStudent(name);
		if(searchIndex == -1) {
			view.printMsg("학생정보가 없습니다.");
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
































