package kh.java.control;

import java.util.Scanner;

public class ForTest {

	public void test1() {
		for (int i = 0; i <= 5; i++) {			
			System.out.println(i + "번째 출력");	
		}
	}
	public void test2() {
		for (int i = 5; i >= 1; i--) {			 
			System.out.println(i + "번째 출력");	
		}
	}
	
	public void exam1() {
		//안녕하세요 5번출력
		for(int i=0; i<5;i++) {				//초기문,조건문,증감문
			System.out.println("안녕하세요");	//실행문
		}
		System.out.println();
		System.out.println();
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);	//횟수만큼 반복하기위해 scanner문 사용
	
		System.out.print("몇번 출력하시겠습니까? : ");
		int num = sc.nextInt();					//지정한 값을 변수에 저장
		
		for(int i=0; i<num; i++) {				//지정한 변수의 길이만큼 증감문 실행
			System.out.println("안녕하세요");
		}
		System.out.println();
		System.out.println();
	}
	public void exam3() {
		System.out.println("2단입니다.");
		for(int i=1; i<10; i++) {						//구구단의 고정반복문 출력
			System.out.println("2 * " +i+ " = " +i*2);	//2단만 하기에 2단은 문자열로 작성
		}
		System.out.println();
		System.out.println();
	}
	public void exam4() {
		Scanner sc = new Scanner(System.in);			//지정한 정수를 구구단하기위해 scanner문
		
		System.out.print("몇단을 출력하시겠습니까? : ");
		int num = sc.nextInt();							//지정한 값을 변수에 저장
		System.out.println(num+"단입니다.");				//사용자가 입력한 값에 의한 프린트문 작성
		
		for(int i=1; i<10; i++) {						//구구단의 고정반복문 출력
			System.out.println(num +" * "+ i + " = " + num*i);
		}
		System.out.println();
		System.out.println();
	}
	
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;     							//for문 안에서가 아닌 밖에서 쓰기위해 변수선언
		
		for(int i=0; i<5; i++) {					//5번 정수값의 합을 구하기 위한 for문
			System.out.print("정수 값을 입력하시오 : ");
			int number = sc.nextInt();
			sum+=number;							//반복문을 할때마다의 값을, 새롭게 더하고 변수값 저장
		}
		System.out.println("입력한 5개의 정수의 합 : " + sum);	//sum을 쓰기위해선 for문 안이 아닌 바깥에 변수를 작성해야한다
		System.out.println();
		System.out.println();
	}
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;						//출력시 합산한 변수를 쓰기위한, 변수값 초기화
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		for(int i=num1; i<=num2; i++) {		//i초기값을 num1 대입하고 num2까지 반복문 작성
			sum += i;						//반복할때마다 i값을 sum과 더하고 sum에 저장
		}
		System.out.println(num1+" ~ "+num2+"의 정수의 합 : "+ sum);	//for문 밖에 변수선언했기에 사용가능
		System.out.println();
		System.out.println();
	}
	public void exam7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int sum=0;					//출력시 합산한 변수를 쓰기위한, 변수값 초기화
		
		for(int i=1; i<=num; i++) {	//입력받은 값만큼 반복
			if(i%2 == 0) {			//i값을 2로 나눈 나머지값이 0인 조건문을 위한 if문 사용
				sum+=i;				//sum과 더하고 저장
			}
		}
		System.out.println("짝수들의 합은 : " + sum);
	}
	
	public void loop() {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("한번 더 출력할까요(1.yes/2.no)?");
			int sel = sc.nextInt();
			if(sel ==1) {
				System.out.println("ok");
			}else {
				continue;
			}
			System.out.println("반복문 마지막부분에서 출력테스트!");
		}
		//System.out.println("반복문 끝!!"); //무한반복문때문에 여기까지 도달할수 없다
	}
	public void loop1() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("i : " + i);
			System.out.println("1/2/3중 선택하세요");
			int sel = sc.nextInt();
			if(sel ==1) {
				continue;
			}else if(sel == 2) {
				break;
			}else {
				System.out.println("나머지");
			}
			System.out.println("반복문 마지막 코드!");	//else가 있어야 출력가능
		}
	}
}


















