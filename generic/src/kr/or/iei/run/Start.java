package kr.or.iei.run;

import kr.or.iei.func.GenericEx1;
import kr.or.iei.func.GenericEx2;

public class Start {

	public static void main(String[] args) {
		
		GenericEx1<Integer> g = new GenericEx1<Integer>(10);
		GenericEx1<Character> g1 = new GenericEx1<Character>('a');
		//���׸� ������ �ڵ����� object�� ���� �׷��� �ٿ�ĳ�����ؾ���
		//���׸� ���� �⺻�ڷ����� �����⿡ wrapClass����ؾ���
		System.out.println(g.getData()+10);
		System.out.println(g1.getData()+5);
		GenericEx2<Integer,String> g2 = new GenericEx2<Integer,String>(10,"str");
		int num1 = g2.getData1();
		String str = g2.getData2();//���� ��ڽ�
		System.out.println(num1);
		System.out.println(str);
		
		
		
		
		
		//�ùٸ� ���׸�����
		/*Tiger t = new Tiger(100);
		Bear b = new Bear(200);
		
		//���⼭ <>������ �ٿ�ĳ������ ���ʿ䰡 ����
		AnimalMgr<Tiger> mgr1 = new AnimalMgr<Tiger>(t);
		AnimalMgr<Bear> mgr2 = new AnimalMgr<Bear>(b);
		//hp�� ��½�
		System.out.println(mgr1.getData().getHp());
		System.out.println(mgr2.getData().getHp());
		
		Tiger t1 = mgr1.getData();
		int hp1 = t1.getHp();
		Bear b1 = mgr2.getData();
		int hp2 = b1.getHp();
		
		System.out.println(hp1);
		System.out.println(hp2);*/
		
		
		//���׸� �Ⱦ��� (�ٿ�ĳ����)
		/*AnimalMgr mgr1 = new AnimalMgr(t);
		AnimalMgr mgr2 = new AnimalMgr(b);
		//mgr1�� �ִ� data�� hp => 100
		//mgr2�� �ִ� data�� hp => 200
		
		Object obj1 = mgr1.getData();
		
		//tiger��ü�� getHp �޼ҵ带 �������ؼ� �ٿ�ĳ����
		int hp1 = ((Tiger)obj1).getHp();
		System.out.println(hp1);
		
		Object obj2 = mgr2.getData();
		int hp2 =((Bear)obj2).getHp();
		
		System.out.println(hp2);*/
		
		
	}

}

















