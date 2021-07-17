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
		//아이디 중복제거용
		String id = "";
		while (true) {
			id = view.idCheck("가입");
			if (mem.containsKey(id)) {
				view.printMsg("중복된 아이디입니다.");
			} else {
				break;
			}
		}
		//아이디 별도 저장/mem에선 id빼고 저장
		Members s = view.getInsert("등록", mem, id);
		mem.put(s.getId(), s);
	}

	public void printAllMember() {
		view.Allmember(mem);
	}

	public void printOneMember() {
		String id = view.idCheck("조회");
		String pass = view.passCheck("수정");

		//아이디 값 확인
		if (mem.containsKey(id)) {
			//비밀번호 값 확인
			if (mem.containsKey(pass)) {
				Members s = mem.get(id);
				view.OneMember(s);
			} else {
				view.printMsg("비밀번호가 다릅니다");
			}
		} else {
			System.out.println("회원 정보가 없습니다.");
		}
	}

	public void modifyMemeber() {
		String id = view.idCheck("수정");

		if (mem.containsKey(id)) {
			Members s = view.getInsert("수정", mem, id);
			mem.put(id, s);
		} else {
			System.out.println("회원 정보가 없습니다.");
		}

	}

	private void deleteMember() {
		String id = view.idCheck("삭제");
		if (mem.containsKey(id)) {
			mem.remove(id);
		} else {
			System.out.println("회원 정보가 없습니다.");
		}
	}
}
