package test;

import java.util.Scanner;

public class Test58 {
	//문장에서 각 단어 첫글자만 대문자로 변환
	public void test58() {
		
		//변수 선언
		Scanner sc;
		String str;
		String strArr;
		
		//초기화 선언
		sc = new Scanner(System.in);
		strArr = null;
		
		//로직처리
		System.out.print("문장을 영어로 적어주세요 : ");
		str = sc.nextLine();
		
		//검증
		if(str == null) {
			//미입력시
			System.out.println("문장을 입력해 주세요");
		}else {
			
			//입력시
			// split을 이용한 문자열 분리
			String[] txtArr = str.split(",",-1) ;
			
			//첫글자 대문자 변경 후 값 넣기
			for(int i=0; i < txtArr.length; i++){
				strArr = txtArr[i].substring(0,1).toUpperCase()+txtArr[i].substring(1);
			}
			
			//출력
			System.out.println(strArr);
		}
        sc.close();
	}
}









