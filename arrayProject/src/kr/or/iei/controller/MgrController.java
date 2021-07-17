package kr.or.iei.controller;

import kr.or.iei.vo.Grade;
import kr.or.iei.view.MgrView;

public class MgrController {
	Grade [] members;
	int index;
	MgrView view;

	public MgrController() {
		super();
		members = new Grade[30];
		index = 0;
		view = new MgrView();
	}
	
	public void main() {
		while(true) {
			int sel = view.showMenu();
			switch(sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
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
				view.printMsg("Bye~!");
				return;
			default:
				view.printMsg("잘못입력하셨습니다");
			}
		}
	}
	public void insertMember() {
		Grade member = view.insertMember();
		members[index++] = member;
		view.printMsg("회원등록 완료");
	}
	public void printAllMember() {
		view.printAllMember(members, index);
	}
	public void printOneMember() {
		String name = view.searchMember("조회");
		int searchIndex = searchMember(name);
		if(searchIndex==-1) {
			view.printMsg("회원정보가 없습니다.");
		}else {
			view.printOneMember(members[searchIndex]);
		}
	}
	public void modifyMember() {
		String name = view.searchMember("수정");
		int searchIndex = searchMember(name);
		if(searchIndex==-1) {
			view.printMsg("회원정보가 없습니다.");
		}else {
			members[searchIndex] = view.modifyMember();
			view.printMsg("수정 완료");
		}
	}
	public void deleteMember() {
		String name = view.searchMember("삭제");
		int searchIndex = searchMember(name);
		if(searchIndex==-1) {
			view.printMsg("회원정보가 없습니다.");
		}else {
			for(int i=searchIndex;i<index-1;i++) {
				members[i] = members[i+1];
			}
			members[--index] = null;
			view.printMsg("삭제 완료");
		}
	}
	public int searchMember(String name) {
		for(int i=0;i<index;i++) {
			if(members[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
}
