package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	// 문구출력문
	public void test1_1() {
		System.out.println("hello");
		System.out.println("SeoJunsik");
	}

	// 숫자 더하기
	public void test1_2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 더하기");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		System.out.println("숫자 총합 : " + (num1 + num2));
	}

	// 숫자 나누기
	public void test1_3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 나누기");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		System.out.println("숫자 나누기값 : " + (num1 / num2));
	}

	// 산수 출력문
	public void test1_4() {
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}

	// 산수 곱하기
	public void test1_5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 곱하기");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		System.out.println("숫자 곱하기값 : " + num1 * num2);
	}

	// 산수 사칙연산
	public void test1_6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 사칙연산");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		System.out.println("숫자 더하기값 : " + (num1 + num2));
		System.out.println("숫자 뺄셈값 : " + (num1 - num2));
		System.out.println("숫자 곱하기값 : " + num1 * num2);
		System.out.println("숫자 나누기값 : " + num1 / num2);
		System.out.println("숫자 나머지값 : " + num1 % num2);
	}

	// 산수 반복문
	public void test1_7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 반복문");
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(num1 + "x" + i + "=" + num1 * i);
		}
	}

	// 문자 출력문
	public void test1_8() {
		System.out.println("   J    a   v     v  a   ");
		System.out.println("   J   a a   v   v  a a  ");
		System.out.println("J  J  aaaaa   V V  aaaaa ");
		System.out.println(" JJ  a     a   V  a     a");
	}

	// 산수 사칙연산
	public void test1_9() {
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
	}

	// 산수 사칙연산
	public void test1_0() {
		System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
	}

	// 원의 넓이와 둘레 출력
	public void test1_11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 넓이와 둘레 출력");
		System.out.print("반경 : ");
		double num1 = sc.nextDouble();
		double Area = num1 * num1 * Math.PI;
		double Perimeter = (num1 * 2) * Math.PI;
		System.out.println("원의 넓이 :" + Area);
		System.out.println("원의 둘레 :" + Perimeter);
	}

	// 세 숫자의 평균값
	public void test1_12() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int sum = 0;
		System.out.println("세 숫자의 평균값");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("세 숫자의 평균값 : " + sum / 3);
	}

	// 직사각형의 넓이와 둘레구하기
	public void test1_13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형의 면적과 둘레구하기");
		System.out.print("넓이 : ");
		double width = sc.nextDouble();
		System.out.print("높이 : ");
		double height = sc.nextDouble();

		double area = width * height;
		double Perimeter = 2 * (width * height);
		System.out.println("면적은 : " + area);
		System.out.println("둘레는 : " + Perimeter);
	}

	// 국기 모양 출력문
	public void test1_14() {
		System.out.println("");
		System.out.println("* * * * * * ===================================");
		System.out.println(" * * * * * ===== =============================");
		System.out.println("* * * * * * ================ ===================");
		System.out.println(" * * * * * =========================== ========");
		System.out.println("* * * * * * ====================================");
		System.out.println(" * * * * * ====================================");
		System.out.println("* * * * * * ======== ============================");
		System.out.println(" * * * * =================== ================");
		System.out.println("* * * * * * ============================= ======");
		System.out.println("============================================= ==");
		System.out.println("==============================================");
		System.out.println("==== ==========================================");
		System.out.println("======== ======================================");
		System.out.println("============ ==================================");
		System.out.println("================ ================================");
	}

	//변수 교환
	public void test1_15() {
		Scanner sc = new Scanner(System.in);
		String temp = null;
		
		System.out.print("첫번째 변수 : ");
		String str1 = sc.next();
		System.out.print("두번째 변수 : ");
		String str2 = sc.next();
		System.out.println("변수1 :"+str1+", 변수2 :"+str2);
		
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("변수 교환");
		System.out.println("변수1 :"+str1+", 변수2 :"+str2);
	}
	
	// 국기 모양 출력문
	public void test1_16() {
		System.out.println("+\"\"\"\"\"+");
		System.out.println("[| oo |] ");
		System.out.println(" | ^ |  ");
		System.out.println(" | '-' |");
		System.out.println(" +-----+");
	}
	
	//이진수 더하기
	public void test1_17() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 십진수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 십진수 : ");
		int num2 = sc.nextInt();
		System.out.println("두 십진수 합 : "+(num1+num2));
	}
	
	//이진수 곱하기
	public void test1_18() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 십진수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 십진수 : ");
		int num2 = sc.nextInt();
		System.out.println("두 십진수 곱셈 : "+num1*num2);
	}
	
	//10진수 2진수 변환
	public void test1_19() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int arr[] = new int[777];
		System.out.print("임의의십진수 : ");
		int num1 = sc.nextInt();
		
		while(num1 != 0) {
			arr[count] = num1%2;
			count++;
			num1 = num1/2;
		}
		
		System.out.print("이진수로 변환 : ");
		for (int i = 1; i < count; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//10진수 16진수 변환
	public void test1_20() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String str = "";
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		System.out.print("임의의십진수 : ");
		int num1 = sc.nextInt();
		
		while(num1 > 0) {
			str = hex[num1]+str;
			num1 = num1/16;
		}
		System.out.print("16진수로 변환 : "+str);
	}
	
	//10진수를 8진수로
	 public void test1_21() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("임의의 십진수 : ");
		 int num1 = sc.nextInt();
		 String str = "";
		 
		 while(num1 >0) {
			 str = (num1/8+str);
			 num1 = num1/8;
			 if(num1/8>=0) {
				 str = (num1+8)%8 +str;
				 break;
			 }
		 }
		 System.out.println("8진수 변환 : " + str);
	 }
	 
//	//2진수를 10진수로
//	 public void test1_22() {
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("임의의 2진수 : ");
//		 String num1 = sc.next();
//		 ArrayList<Integer> arrNum = new ArrayList<Integer>();
//		 int sum = 0;
//		 
//		int hex[] = {1, 2, 4, 8, 16, 32, 64, 128};
//		
//		for (int i = 0; i < hex.length; i++) {
//			arrNum.add(Integer.parseInt(String.valueOf(num1.charAt(i))));
//			sum += hex[arrNum.get(i)];
//		}
//		System.out.println("10진수 변환 : "+sum);
//	 }	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}























