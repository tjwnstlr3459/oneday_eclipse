package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner sc;

	public ExceptionTest() {
		super();
		sc = new Scanner(System.in);
	}
	
	public void exceptionTest1() {
		while(true) {
		System.out.print("숫자를 입력하세요 :");
		int num = 0;
		try {
			//에러가 발생 할 수 있는 소스코드를 try 구문안에 작성
			num = sc.nextInt();
		}catch(Exception e) {
			//try구문을 실행하다가 에러가 발생하는 경우 실행될 구문
			System.out.println("숫자만 입력해주세요");
			sc.nextLine();	//초기화 안시키면 무한재생
			continue;
		}
		
		System.out.println("입력하신 숫자는 "+num+"입니다.");
		}
	}
	
	public void exceptionTest2() {
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		//숫자 두개를 입력받아서 num1/num2한 결과를 출력
		//예외처리가 아니라 소스코드를 변경해서 예외상황 제거
		
		if(num2 == 0) {
			System.out.println("0으로는 나눌수 없습니다.");
		}else {
			System.out.println("나누기 결과 : " +num1/num2);
		}
	}
	public void main() {
		try {
			exceptionTest3();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void exceptionTest3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("test.txt");
	}
	
}





















