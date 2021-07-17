package kr.or.iei.func;

import java.util.Random;
import java.util.StringTokenizer;

public class StringClass {
	public void test1() {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		sb.append("hi");//현재문자열 끝에 매개변수로전달된 값 추가
		System.out.println(sb);	//hi
		sb.append(" 안녕");
		System.out.println(sb);	//hi 안녕
		sb.append(" test");
		System.out.println(sb);	
		
		sb.insert(3, "삽입구문");	//준간에 삽입
		System.out.println(sb);
		
		sb.insert(7, " 여기 ");	//준간에 삽입
		System.out.println(sb);
		
		sb.replace(3, 7, "수정변경");
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.reverse();			//모든 글자 역순 
		System.out.println(sb);
		
		StringBuffer joinCode = new StringBuffer();
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			joinCode.append(r.nextInt(10));
		}
		System.out.println(joinCode);
	}
	
	public void test2() {
		//문자열을 분석해서 토큰으로 분리시킴
		String str = "서준식/서울/학생";
		StringTokenizer sT = new StringTokenizer(str,"/");
		// "/"를기준으로 단어들을 나눈다
		
		
		//hasMoreTokens<<는 남아있는 토큰이 없으면 false
//		while(sT.hasMoreTokens()) {
//			System.out.println(sT.nextToken());
//		}
		
		System.out.println(sT.hasMoreTokens());
		
		System.out.println(sT.countTokens()); //현재토큰수
		String name = sT.nextToken();
		System.out.println(name);
		
		System.out.println(sT.hasMoreTokens());
		
		String addr = sT.nextToken();
		System.out.println(addr);
		System.out.println(sT.nextToken());
		//String name = sT.nextToken(); //토큰을 1개 꺼내옴
		
		
		System.out.println(sT.hasMoreTokens());
		//현재토큰이 남아있는지 확인 true/false
		//sT.countTokens() != 0
		
		}
	
	public void exam1() {
		String str = "J a v a P r o g r a m";
		//StringTokenizer를 이용해서 공백을 통해 토큰으로 분리
		//1분리된 토큰을 char[]에 저장
		
		
		StringTokenizer sT = new StringTokenizer(str," ");
		
		StringBuffer sb = new StringBuffer();
		
		char[] arr = new char[sT.countTokens()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sT.nextToken().toUpperCase().charAt(0);
			System.out.print(arr[i]);
		}
		//2.char[]에 저장된 값을 모두 대문자로 변환하여 문자열로 저장하고 출력
		System.out.println(sb);
		
	}
}
	
	
	








































