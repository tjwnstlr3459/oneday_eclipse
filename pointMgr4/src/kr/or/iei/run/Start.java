package kr.or.iei.run;

import kr.or.iei.controller.PointMgr;
import kr.or.iei.vo.Grade;
import kr.or.iei.vo.Silver;

public class Start {

	public static void main(String[] args) {
		
		Silver silver = new Silver();
		//Grade g = new Grade();	//abstract�� �ٿ��� ���Ұ�
		Grade g1 = new Silver(); //�ڽİ�ü(������) ������ ��밡��
		
		PointMgr pm = new PointMgr();
		
		pm.main();
	}

}
