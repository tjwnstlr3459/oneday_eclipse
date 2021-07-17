package kr.or.iei.run;

import kr.or.iei.controller.PointMgr;
import kr.or.iei.vo.Grade;
import kr.or.iei.vo.Silver;

public class Start {

	public static void main(String[] args) {
		
		Silver silver = new Silver();
		//Grade g = new Grade();	//abstract가 붙여져 사용불가
		Grade g1 = new Silver(); //자식객체(다형성) 대입은 사용가능
		
		PointMgr pm = new PointMgr();
		
		pm.main();
	}

}
