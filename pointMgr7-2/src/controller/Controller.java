package controller;

import java.util.HashMap;
import java.util.Set;

import view.View;
import vo.Members;

public class Controller {

	HashMap<String, Members> mem;
	View view;

	public Controller() {
		super();
		mem = new HashMap<>();
		view = new View();
	}

	public void main() {
		while (true) {
			switch (view.showMenu()) {
			case 1:
				intsertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				modifyMemeber();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				System.out.println("bye~");
				return;
			}
		}
	}

	public void intsertMember() {
		//���̵� �ߺ����ſ�
		String id = "";
		while (true) {
			id = view.idCheck("����");
			if (mem.containsKey(id)) {
				view.printMsg("�ߺ��� ���̵��Դϴ�.");
			} else {
				break;
			}
		}
		//���̵� ���� ����/mem���� id���� ����
		Members s = view.getInsert("���", mem, id);
		mem.put(s.getId(), s);
	}

	public void printAllMember() {
		view.Allmember(mem);
	}

	public void printOneMember() {
		String id = view.idCheck("��ȸ");
		String pass = view.passCheck("����");

		//���̵� �� Ȯ��
		if (mem.containsKey(id)) {
			//��й�ȣ �� Ȯ��
			if (mem.containsKey(pass)) {
				Members s = mem.get(id);
				view.OneMember(s);
			} else {
				view.printMsg("��й�ȣ�� �ٸ��ϴ�");
			}
		} else {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}
	}

	public void modifyMemeber() {
		String id = view.idCheck("����");

		if (mem.containsKey(id)) {
			Members s = view.getInsert("����", mem, id);
			mem.put(id, s);
		} else {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}

	}

	private void deleteMember() {
		String id = view.idCheck("����");
		if (mem.containsKey(id)) {
			mem.remove(id);
		} else {
			System.out.println("ȸ�� ������ �����ϴ�.");
		}
	}
}
