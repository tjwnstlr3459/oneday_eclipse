package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//변수정의 클래스 정의 ,변수나, 클래스 등을 초기화하는 과정
//분리하라 비지니스로직 과 결과 출력을 변수명
//검증
//선언 초기화 검증 로직
//람다식
//exception
//float double long 의미 알아보기
//유지보수 및 변수 선언 확실하게
//주석
//가독성 중시 칸 줄 else if

//변수선언 및 초기화
//주석 룰
public class Test2 {

	//자바 버전 확인 명령어
	public void test2_31() {
		System.out.println("자바 버전: "+System.getProperty("java.version"));
	    System.out.println("자바 런타임 버전: "+System.getProperty("java.runtime.version"));
	    System.out.println("자바 홈 : ");
	    System.out.println("자바 공급업체 : ");
	    System.out.println("자바 공급업체 URL : ");
	    System.out.println("자바 클래스 경로 : ");
	    
	    System.out.println("cmd에 java -version 치면 [버전,런타임버전]");
	}
	
	//숫자 비교
	public void test2_32() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번재 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번재 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 != num2) {
			System.out.println(num1 +" != "+num2);
		}
		if(num1 > num2) {
			System.out.println(num1 +" > "+num2);
		}
		if(num1 < num2){
			System.out.println(num1 +" < "+num2);
		}
		if(num1 >= num2) {
			System.out.println(num1 +" >= "+num2);
		}
		if(num1 <= num2) {
			System.out.println(num1 +" <= "+num2);
		}
	}
	
	//자릿수 합
	public void test2_33() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		ArrayList<Integer> arrNum = new ArrayList<Integer>();
		int sum = 0;
		
		String str = Integer.toString(num1);
		for (int i = 0; i < str.length(); i++) {
			arrNum.add(Integer.parseInt(String.valueOf(str.charAt(i))));
			sum += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println("각 자릿수의 합 : "+sum);
	}
	
	//육각형 면적 계산
	public void test2_34() {
		Scanner sc = new Scanner(System.in);
		System.out.print("육각형 변의 길이 입력 : ");
		int num1 = sc.nextInt();
		double hexagon = (6 * num1^2)/(4* Math.tan(Math.PI/6));
		
		
		System.out.println("육각형의 면적 : "+hexagon*6);
	}

	//다각형 면적 계산
	public void test2_35() {
		Scanner sc = new Scanner(System.in);
		System.out.print("다각형 갯수 : ");
		int num1 = sc.nextInt();
		System.out.print("변의 길이 : ");
		int num2 = sc.nextInt();
		
		double hexagon = (num1*num2^2)/(4*Math.tan(Math.PI/num1));
		
		System.out.println(num1+"각형의 면적 : "+hexagon*num1);
	}
	
	//문자열 뒤집기
	public void test2_37() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		ArrayList<String> arr = new ArrayList<String>();
		
		String temp = "";
		String swap = "";
		
		//문자열 하나하나 넣기
		for (int i = 0; i < str.length(); i++) {
			arr.add(String.valueOf(str.charAt(i)));
		}
		//문자열 교환
		for (int i = 1; i < arr.size(); i++) {
			
			temp = arr.get(i);
			swap = arr.get(arr.size()-i);
			
			arr.set(i, swap);
			arr.set(arr.size()-i, temp);
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));
		}
	}
	
	//입력 문자열의 문자, 공백, 숫자, 기타문자 세는 프로그램
	public void test2_38() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		ArrayList<String> arr = new ArrayList<String>();
		
		int letter=0;
		int space=0;
		int number=0;
		int other=0;
		
		char ch;
		
		for (int i = 0; i < str.length(); i++) {
			arr.add(String.valueOf(str.charAt(i)));
		}
		for (int i = 0; i < arr.size(); i++) {
			ch = str.charAt(i);
			if(ch< 33) {
				space++;
			}else if(47<ch && ch<58 ) {
				number++;
			}else if(64<ch && ch<91 || 96<ch && ch<123){
				letter++;
			}else {
				other++;
			}
		}
		System.out.println("공백 : "+space);
		System.out.println("숫자 : "+number);
		System.out.println("문자 : "+letter);
		System.out.println("기타 : "+other);
	}
	
	//1,2,3,4 를 이용하여 3자리 숫자를 만들고, 만들어진 숫자의 객수파악
	public void test2_39() {
		int arrNum[] = {1,2,3,4};
		int first = 0;
		int second = 1;
		int third = 2;
		
		for (int i = 0; i < arrNum.length*6; i++) {
			System.out.print(arrNum[first]+""+arrNum[second]+""+arrNum[third]);
			third++;
			if(arrNum[second]==arrNum[third]) {
				second++;
				third=2;
				if(second<=5) {
					first++;
				}
				if(arrNum[first]==arrNum[third] || arrNum[second]==arrNum[third]) {
					third++;	
				}
				if(first<=5) {
					break;
				}
			}
		}
	}
	
	//주어진 문자의 ASCII 값을 출력
	public void test2_41() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int ch = str.charAt(0);
		System.out.println(str+"의 아스키 값은 "+ch+"입니다.");
	}
	
	//암호 입력하고 표시하는 java
	public void test2_42() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력 : ");
		String pass = sc.next();
		
		System.out.print("비밀번호 : "+pass);
	}
	
	//문자열을 특정 형식으로 출력
	public void test2_43() {
		
	}
	
	//정수(n)을 받아 n+nn+nnn
	public void test2_44() {
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.println(num1+"+"+num1+""+num1+"+"+num1+""+num1+""+num1);
	}
	
	//파일의 크기를 찾는 코드
	public void test2_45() {
	}
	
	//현재 날짜 시간을 형식대로 표시
	public void test2_46() {
		SimpleDateFormat day = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		Date time = new Date();
		
		System.out.println(day.format(time));
	}	
	
	//현재 날짜 시간을 형식대로 표시
	public void test2_47() {
		SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.sss");
		Date time = new Date();
		
		System.out.println(day.format(time));
	}	
	
	//1~99 홀수를 제외한 수 출력
	public void test2_48() {
		for (int i = 1; i < 100; i++) {
			if(i%2==0) {
				i++;
			}
			System.out.println(i);
		}
	}	
	
	//홀수 짝수 구별
	public void test2_49() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");		
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
	}	
	
	//정수별 배수 출력
	public void test2_50() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");		
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1+"로 나누기");
		for (int i = 1; i < 100; i++) {
			if(i%num1 == 0) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
		System.out.println(num2+"로 나누기");
		for (int i = 1; i < 100; i++) {
			if(i%num2 == 0) {
				System.out.print(i+", ");
			}
		}
		System.out.println();
		System.out.println(num1+"&"+num2+"로 나누기");
		for (int i = 1; i < 100; i++) {
			if(i%num1 == 0 || i%num2 == 0) {
				System.out.print(i+", ");
			}
		}
	}	
	
	//문자열을 정수로변환
	public void test2_51() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 숫자 입력 : ");		
		String num1 = sc.next();
		
		int num2 = Integer.parseInt(num1);
		System.out.println("숫자열 타입변환 : "+num2);
	}	
	
	//계산식 true/false
	public void test2_52() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");		
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");		
		int num2 = sc.nextInt();
		
		System.out.print("두 정수의 합은 : ");
		int num3 = sc.nextInt();
		if(num3 == num1+num2) {
			System.out.println(num3 == num1+num2);
		}
	}
	
	//계산식 크기비교
	public void test2_53() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");		
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");		
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");		
		int num3 = sc.nextInt();
		
		System.out.print("세 정수의 크기순 : ");
		System.out.println(num1 < num2 && num2 < num3);
	}
	
	//계산식 true/false
	public void test2_54() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");		
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");		
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");		
		int num3 = sc.nextInt();
		
		System.out.print("첫번째 정수와 두번째 정수의 합을 세번째 정수와 비교 : ");
		System.out.println(num3 == num1+num2);
	}
	
	//초를 시 분 초 로
	public void test2_55() {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");		
		int num1 = sc.nextInt();
	}
	
	
	
	
	
}

