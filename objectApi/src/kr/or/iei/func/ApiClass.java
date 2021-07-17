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
		
		//�ø�, ����, �ݿø�
		System.out.println(Math.ceil(10.1));	//11
		System.out.println(Math.floor(10.9));	//10
		System.out.println(Math.round(10.1));	//11
		
		//1.3456 =>1.35
		System.out.println(Math.round(1.3456*100)/(double)100);
		//12345
		System.out.println(Math.round(12345/(double)100)*100);
		
		System.out.println(Math.random()); //0.0 ~ 0.1 ���� ���ǰ�
		
		System.out.println(Math.max(50, 30)); //���� ū��
		System.out.println(Math.min(50, 30)); //���� ������
	}
	
	public void calender() {
		Calendar today = Calendar.getInstance();
		//GregorianCalendar��ü�� ������(Calendar�� �߻�Ŭ������ ��ü�����Ұ�)
		//�ѱ� ǥ�ؽð��� ������ ������
		System.out.println(today.get(Calendar.YEAR));	//�⵵ ���
		System.out.println(today.get(Calendar.MONTH)+1);//�� ���-> 0 ~ 11
		System.out.println(today.get(Calendar.DATE));	//�� ���
		System.out.println(today.get(Calendar.AM_PM)); 	//AM==0, PM==1
		System.out.println(today.get(Calendar.HOUR));	//�ð�
		System.out.println(today.get(Calendar.MINUTE));	//��
		System.out.println(today.get(Calendar.SECOND)); //��
		System.out.println(today.get(Calendar.DAY_OF_WEEK));//1=�Ͽ���~7=�����
		
		System.out.println("================");
		Calendar day1 = Calendar.getInstance();
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));
		
		day1.set(Calendar.MONTH, 3);
		day1.set(Calendar.DATE, 27);	//��¥�� 27�� ����
		System.out.println(day1.get(Calendar.DAY_OF_WEEK)); //���ϱ��� �����
		
		//��ǻ�Ͱ� �ð��� ����ϴ� ���
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
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy��MM��dd�� HH�ð� mm�� ss�� E����");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todayString = format1.format(today);
		String todayString2 = format2.format(today);
		System.out.println(todayString);
		System.out.println(todayString2);
	}
	
	public void dday() {
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		String todayString = format1.format(today);
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========D-Day ����============");
		System.out.print("D-Day [�⵵] �Է� : ");
		int year = sc.nextInt();
		System.out.print("D-Day [��] �Է� : ");
		int mon = sc.nextInt();
		System.out.print("D-Day [��] �Է� : ");
		int day = sc.nextInt();
	
		System.out.println("���ó�¥ : "+todayString);
		
		System.out.println("D-Day ��¥ : "+year +"��"+mon+"��"+ day+"��");
		//���ó�¥
		Calendar day1 = Calendar.getInstance();
		long timetime=day1.getTimeInMillis();
		//System.out.println(timetime);
		
		//�����ѳ�¥
		Calendar day2 = Calendar.getInstance();
		day2.set(Calendar.YEAR,year);
		day2.set(Calendar.MONTH,mon-1);
		day2.set(Calendar.DAY_OF_MONTH,day);
		long dday = day2.getTimeInMillis();
		
		//System.out.println(timetime/86400000/1000);
		
		//System.out.println(dday/86400000/1000);
		
		long dayday = (dday/1000-timetime/1000);	
		//�ʹ� �����ؼ� d-day�� �ȳ����� �Ҽ����� �ƴ� ���ڸ���(/1000) ������ش�
		long d = dayday/(24*60*60);	//ms->day ��ȯ
		
		//System.out.println(d);
		
		if(timetime<dday) {
			System.out.println(d+ "�� ���ҽ��ϴ�");
		}else if(timetime>dday) {
			System.out.println(d+ "�� �������ϴ�");
		}else {
			System.out.println("d-day�Դϴ�");
		}		
	}
	
	public void wrapper() {
		//���������� �����ؼ� 10����
		int num = 10;
		System.out.println(num);
		//wrapperclass�� ������ 10����
		Integer num1 = new Integer(10);
		System.out.println(num1);
		//auto-boxing
		Integer num2 = 10;	//new Integer(10);
		System.out.println(num2.toString()+1);//num2.intValue();
		
		Character ch ='a';	//new Character('a');
		System.out.println(ch);//ch.charValue();
		
		//String ->�⺻ �ڷ��� ��ȯ
		String str = "10";
		System.out.println(str+1);
		int no = Integer.parseInt(str);
		double d = Double.parseDouble(str);
		System.out.println(no);
		
		//�⺻�ڷ��� - > String��ȯ
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
























