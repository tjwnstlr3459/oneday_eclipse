package kr.or.iei.controller;

import kr.or.iei.view.MemberView;
import kr.or.iei.vo.Grade;

public class PointController {

	Grade[] members;	//�������� �̿��� �ϳ��� ��ü�� ����
	
	int index;
	
	MemberView mv;

	public PointController() {
		super();
		members = new Grade[30];
		
		index = 0;
		
		mv = new MemberView();
	}
	
	public void main() {
		
		while(true) {
			int sel = mv.memberShow();
			
			switch (sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllmamber();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				modifyMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				break;
		
			}		
		}
	}	
	
	public void insertMember() {
		
		members[index++] = mv.insertMember();
	}
	
	public void printAllmamber() {
		
		mv.printAllmember(members,index);
	}
	
	public void printOneMember() {
		
		String name = mv.intputName("��ȸ");
		
		int memberIndex = searchName(name);
		
		if(memberIndex==-1) {
			System.out.println("��� ������ �����ϴ�.");
		}else{
		mv.printOneMember(memberIndex,members);
		}
				
	}
	
	public void modifyMember() {
		String name = mv.intputName("����");
		
		int memberIndex = searchName(name);
		
		for (int i = memberIndex; i < index-1; i++) {
			members[i]=members[i+1];
		}
		if(memberIndex==-1) {
			System.out.println("��� ������ �����ϴ�.");
		}else{
		members[index--] = null;
		members[index++] = mv.modifyMember();
		}
		
	}

	public void deleteMember() {
		String name = mv.intputName("����");

		int memberIndex = searchName(name);
		if(memberIndex == -1) {
		for (int i = memberIndex; i < index-1; i++) {
			members[i]=members[i+1];
		}
		members[index--] = null;
		System.out.println("���� �Ϸ�");
		}
	}
	


	
	
	public int searchName(String name) {
		for (int i = 0; i < index; i++) {
			if(members[i].getName().equals(name)){
				return i;
			}
		}
		return -1;
	}
}




























