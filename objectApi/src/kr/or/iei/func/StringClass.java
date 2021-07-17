package kr.or.iei.func;

import java.util.Random;
import java.util.StringTokenizer;

public class StringClass {
	public void test1() {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		sb.append("hi");//���繮�ڿ� ���� �Ű����������޵� �� �߰�
		System.out.println(sb);	//hi
		sb.append(" �ȳ�");
		System.out.println(sb);	//hi �ȳ�
		sb.append(" test");
		System.out.println(sb);	
		
		sb.insert(3, "���Ա���");	//�ذ��� ����
		System.out.println(sb);
		
		sb.insert(7, " ���� ");	//�ذ��� ����
		System.out.println(sb);
		
		sb.replace(3, 7, "��������");
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.reverse();			//��� ���� ���� 
		System.out.println(sb);
		
		StringBuffer joinCode = new StringBuffer();
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			joinCode.append(r.nextInt(10));
		}
		System.out.println(joinCode);
	}
	
	public void test2() {
		//���ڿ��� �м��ؼ� ��ū���� �и���Ŵ
		String str = "���ؽ�/����/�л�";
		StringTokenizer sT = new StringTokenizer(str,"/");
		// "/"���������� �ܾ���� ������
		
		
		//hasMoreTokens<<�� �����ִ� ��ū�� ������ false
//		while(sT.hasMoreTokens()) {
//			System.out.println(sT.nextToken());
//		}
		
		System.out.println(sT.hasMoreTokens());
		
		System.out.println(sT.countTokens()); //������ū��
		String name = sT.nextToken();
		System.out.println(name);
		
		System.out.println(sT.hasMoreTokens());
		
		String addr = sT.nextToken();
		System.out.println(addr);
		System.out.println(sT.nextToken());
		//String name = sT.nextToken(); //��ū�� 1�� ������
		
		
		System.out.println(sT.hasMoreTokens());
		//������ū�� �����ִ��� Ȯ�� true/false
		//sT.countTokens() != 0
		
		}
	
	public void exam1() {
		String str = "J a v a P r o g r a m";
		//StringTokenizer�� �̿��ؼ� ������ ���� ��ū���� �и�
		//1�и��� ��ū�� char[]�� ����
		
		
		StringTokenizer sT = new StringTokenizer(str," ");
		
		StringBuffer sb = new StringBuffer();
		
		char[] arr = new char[sT.countTokens()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sT.nextToken().toUpperCase().charAt(0);
			System.out.print(arr[i]);
		}
		//2.char[]�� ����� ���� ��� �빮�ڷ� ��ȯ�Ͽ� ���ڿ��� �����ϰ� ���
		System.out.println(sb);
		
	}
}
	
	
	








































