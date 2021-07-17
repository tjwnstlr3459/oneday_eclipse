package kr.or.iei.run;

import kr.or.iei.func.GenericEx1;
import kr.or.iei.func.GenericEx2;

public class Start {

	public static void main(String[] args) {
		
		GenericEx1<Integer> g = new GenericEx1<Integer>(10);
		GenericEx1<Character> g1 = new GenericEx1<Character>('a');
		//제네릭 생략시 자동으로 object로 설정 그러면 다운캐스팅해야함
		//제네릭 사용시 기본자료형을 못쓰기에 wrapClass사용해야함
		System.out.println(g.getData()+10);
		System.out.println(g1.getData()+5);
		GenericEx2<Integer,String> g2 = new GenericEx2<Integer,String>(10,"str");
		int num1 = g2.getData1();
		String str = g2.getData2();//오토 언박싱
		System.out.println(num1);
		System.out.println(str);
		
		
		
		
		
		//올바른 제네릭사용법
		/*Tiger t = new Tiger(100);
		Bear b = new Bear(200);
		
		//여기서 <>설정시 다운캐스팅을 할필요가 없다
		AnimalMgr<Tiger> mgr1 = new AnimalMgr<Tiger>(t);
		AnimalMgr<Bear> mgr2 = new AnimalMgr<Bear>(b);
		//hp만 출력시
		System.out.println(mgr1.getData().getHp());
		System.out.println(mgr2.getData().getHp());
		
		Tiger t1 = mgr1.getData();
		int hp1 = t1.getHp();
		Bear b1 = mgr2.getData();
		int hp2 = b1.getHp();
		
		System.out.println(hp1);
		System.out.println(hp2);*/
		
		
		//제네릭 안쓸시 (다운캐스팅)
		/*AnimalMgr mgr1 = new AnimalMgr(t);
		AnimalMgr mgr2 = new AnimalMgr(b);
		//mgr1에 있는 data의 hp => 100
		//mgr2에 있는 data의 hp => 200
		
		Object obj1 = mgr1.getData();
		
		//tiger객체의 getHp 메소드를 쓰기위해서 다운캐스팅
		int hp1 = ((Tiger)obj1).getHp();
		System.out.println(hp1);
		
		Object obj2 = mgr2.getData();
		int hp2 =((Bear)obj2).getHp();
		
		System.out.println(hp2);*/
		
		
	}

}

















