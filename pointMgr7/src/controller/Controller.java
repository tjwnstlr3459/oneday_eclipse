package controller;

import java.util.HashMap;

import view.View;
import vo.Grade;

public class Controller {

	HashMap<String, Grade> members;
	View view;

	public Controller() {
		super();
		members = new HashMap<String, Grade>();
		view = new View();
	}

	public void main() {

		while (true) {

			switch (view.showMenu()) {
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
				break;

			}
		}
	}
	
	

	

	

	private void insertMember() {

		Grade name = view.getMember("���");
		members.put(name.getName(), name);
	}
	private void printAllMember() {
		view.AllMember(members);
		
	}
	
	private void printOneMember() {
		String name = view.getName("��ȸ");
		
		if(members.containsKey(name)) {
			Grade s = members.get(name);
			view.OneMember(s);
		}else {
			view.printMsg("ȸ�������� �����ϴ�.");
		}		
	}
	private void modifyMember() {
		String name = view.getName("����");
		
		if(members.containsKey(name)) {
			members.remove(name);
			Grade m = view.getMember("����");
			members.put(name, m);	
		}else {
			view.printMsg("ȸ�������� �����ϴ�.");
		}
	}

	private void deleteMember() {
		String name = view.getName("����");

		if(members.containsKey(name)) {
			members.remove(name);		
		}else {
			view.printMsg("ȸ�������� �����ϴ�.");
		}
	}


}








































