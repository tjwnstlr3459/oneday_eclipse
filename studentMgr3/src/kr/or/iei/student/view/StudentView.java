package kr.or.iei.student.view;

import java.util.Scanner;

import kr.or.iei.student.model.vo.Student;

public class StudentView {
	
	Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}
	
	public int showMenu() {		//Controller에 숫자를 보내기위해
		System.out.println("====학생관리 프로그램v3====");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생전체 조회");
		System.out.println("3. 학생 1명 조회");
		System.out.println("4. 학생정보 수정");
		System.out.println("5. 학생정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택==> ");
		
		int sel = sc.nextInt();
		return sel;
	}
	public Student insertStudent() {
		System.out.println("====학생 정보 등록====");
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		Student s = new Student(name,age,addr);
		return s;
	}
	
	public void printAllStudent(Student[] s, int index) {
		System.out.println("====학생 정보 출력====");
		System.out.println("이름\t나이\t주소");
		for (int i = 0; i < index; i++) {
			//System.out.println(s[i].getName()+"\t"+s[i].getAge()+"\t"+s[i].getAddr());
			System.out.println(s[i]);	//
		}
	}
	public String inputName(String msg) {
		System.out.print(msg+"할 학생 이름 입력 :"); 
		String name = sc.next();
		return name;
	}

	public void printMsg(String msg){
		System.out.println(msg);
	}
		
	/*public void printOneStudent(Student[]s, int index, int searchIndex) {
		for (int i = 0; i < index; i++) {
			if(i==searchIndex) {
				System.out.println("학생 이름 : "+s[searchIndex].getName());
				System.out.println("학생 나이 : "+s[searchIndex].getAge());
				System.out.println("학생 주소 : "+s[searchIndex].getAddr());
			}
		}
	}*/
	public void printOneStudent(Student s) {	//힙주소값 내에 학생문을 가져옴
		System.out.println("학생 이름 : "+s.getName());
		System.out.println("학생 나이 : "+s.getAge());
		System.out.println("학생 주소 : "+s.getAddr());
	}
		
		
	public Student modifyStudent(){
		System.out.println("수정할 학생 이름 입력 : ");
		String mName = sc.next();
		System.out.println("수정할 학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("수정할 학생 주소 입력 : ");
		sc.nextLine();
		String mAddr = sc.nextLine();
		
		Student s = new Student(mName,age,mAddr);
		return s;
	}

}























