package kr.or.iei.func;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ApiClass {

	public void math() {
		System.out.println(-10);
		System.out.println(10);
		
		//올림, 버림, 반올림
		System.out.println(Math.ceil(10.1));	//11
		System.out.println(Math.floor(10.9));	//10
		System.out.println(Math.round(10.1));	//11
		
		//1.3456 =>1.35
		System.out.println(Math.round(1.3456*100)/(double)100);
		//12345
		System.out.println(Math.round(12345/(double)100)*100);
		
		System.out.println(Math.random()); //0.0 ~ 0.1 사이 임의값
		
		System.out.println(Math.max(50, 30)); //둘중 큰값
		System.out.println(Math.min(50, 30)); //둘중 작은값
	}
	
	public void calender() {
		Calendar today = Calendar.getInstance();
		//GregorianCalendar객체를 생성함(Calendar는 추상클래스로 객체생성불가)
		//한국 표준시간대 정보를 가져옴
		System.out.println(today.get(Calendar.YEAR));	//년도 출력
		System.out.println(today.get(Calendar.MONTH)+1);//월 출력-> 0 ~ 11
		System.out.println(today.get(Calendar.DATE));	//일 출력
		System.out.println(today.get(Calendar.AM_PM)); 	//AM==0, PM==1
		System.out.println(today.get(Calendar.HOUR));	//시간
		System.out.println(today.get(Calendar.MINUTE));	//분
		System.out.println(today.get(Calendar.SECOND)); //초
		System.out.println(today.get(Calendar.DAY_OF_WEEK));//1=일요일~7=토요일
		
		System.out.println("================");
		Calendar day1 = Calendar.getInstance();
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));
		
		day1.set(Calendar.MONTH, 3);
		day1.set(Calendar.DATE, 27);	//날짜를 27로 세팅
		System.out.println(day1.get(Calendar.DAY_OF_WEEK)); //요일까지 변경됨
		
		//컴퓨터가 시간을 계산하는 방법
		Calendar day2 = Calendar.getInstance();
		
		System.out.println(day2.getTime());
		
		long time1 = day2.getTimeInMillis();
		System.out.println(time1);
		
		day2.set(Calendar.DATE, 27);
		long time2 = day2.getTimeInMillis();
		System.out.println(time2-time1);
		
	}
	public void date() {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년MM월dd일 HH시간 mm분 ss초 E요일");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todayString = format1.format(today);
		String todayString2 = format2.format(today);
		System.out.println(todayString);
		System.out.println(todayString2);
	}
	
	public void dday() {
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String todayString = format1.format(today);
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========D-Day 계산기============");
		System.out.print("D-Day [년도] 입력 : ");
		int year = sc.nextInt();
		System.out.print("D-Day [월] 입력 : ");
		int mon = sc.nextInt();
		System.out.print("D-Day [일] 입력 : ");
		int day = sc.nextInt();
	
		System.out.println("오늘날짜 : "+todayString);
		
		System.out.println("D-Day 날짜 : "+year +"년"+mon+"월"+ day+"일");
		//오늘날짜
		Calendar day1 = Calendar.getInstance();
		long timetime=day1.getTimeInMillis();
		//System.out.println(timetime);
		
		//지정한날짜
		Calendar day2 = Calendar.getInstance();
		day2.set(Calendar.YEAR,year);
		day2.set(Calendar.MONTH,mon-1);
		day2.set(Calendar.DAY_OF_MONTH,day);
		long dday = day2.getTimeInMillis();
		
		//System.out.println(timetime/86400000/1000);
		
		//System.out.println(dday/86400000/1000);
		
		long dayday = (dday/1000-timetime/1000);	
		//너무 세밀해서 d-day가 안나오면 소수점이 아닌 초자리로(/1000) 만들어준다
		long d = dayday/(24*60*60);	//ms->day 변환
		
		//System.out.println(d);
		
		if(timetime<dday) {
			System.out.println(d+ "일 남았습니다");
		}else if(timetime>dday) {
			System.out.println(d+ "일 지났습니다");
		}else {
			System.out.println("d-day입니다");
		}		
	}
	
	public void wrapper() {
		//정수형변수 선언해서 10대입
		int num = 10;
		System.out.println(num);
		//wrapperclass로 정수형 10대입
		Integer num1 = new Integer(10);
		System.out.println(num1);
		//auto-boxing
		Integer num2 = 10;	//new Integer(10);
		System.out.println(num2.toString()+1);//num2.intValue();
		
		Character ch ='a';	//new Character('a');
		System.out.println(ch);//ch.charValue();
		
		//String ->기본 자료형 변환
		String str = "10";
		System.out.println(str+1);
		int no = Integer.parseInt(str);
		double d = Double.parseDouble(str);
		System.out.println(no);
		
		//기본자료형 - > String변환
		double d1 = 11.1;
		String str1 = Double.valueOf(d1).toString();
		String str11 = String.valueOf(d1);
		
		int no1 = 100;
		String str2 = Integer.valueOf(no1).toString();
		String str22 = String.valueOf(str2);
		Character ch1 = 'a';
		ch1.toString();
		
	}
}
























