package view;

import java.util.HashMap;
import java.util.Scanner;

import vo.Members;

public class View {
	Scanner sc;

	public View() {
		super();
		sc = new Scanner(System.in);
	}

	public String getName(String str) {
		System.out.print(str + "�� ȸ�� �̸� : ");
		String name = sc.next();
		return name;
	}

	public void printMsg(String str) {
		System.out.println(str);
	}

	public int showMenu() {
		System.out.println("====ȸ������ ���α׷�====");
		System.out.println("1. ȸ�� ����");
		System.out.println("2. ��ü ȸ�� ���� ��ȸ");
		System.out.println("3. ȸ�� ���� ��ȸ(1��)");
		System.out.println("4. ���� ����(ID���� �Ұ�)");
		System.out.println("5. ȸ�� Ż��");
		System.out.println("0. ���α׷� ����");
		System.out.print("����>>");
		int sel = sc.nextInt();
		return sel;
	}

	public Members getInsert(String str, HashMap<String, Members> mem, String id) {
		System.out.print(str + " ��й�ȣ �Է� : ");
		String pass = sc.next();
		System.out.print(str + " �̸� �Է� : ");
		String name = sc.next();
		System.out.print(str + " ���� �Է� : ");
		int age = sc.nextInt();
		System.out.print(str + " ��ȭ��ȣ �Է� : ");
		String phon = sc.next();
		Members s = new Members(id, pass, name, age, phon);
		return s;

	}

	public void Allmember(HashMap<String, Members> mem) {
		System.out.println("====��ü ȸ�� ���� ���====");
		System.out.println("���̵�\t\t�̸�\t����\t��ȭ��ȣ");
		for (String id : mem.keySet()) {
			System.out.println(mem.get(id).getId() + "\t" + mem.get(id).getName() + "\t" 
							+ mem.get(id).getAge() + "\t"+ mem.get(id).getPhon());
		}
	}

	public void OneMember(Members s) {
		System.out.println("ID :" + s.getId());
		System.out.println("Password :" + s.getPass());
		System.out.println("�̸� :" + s.getName());
		System.out.println("���� :" + s.getAge());
		System.out.println("��ȭ��ȣ : " + s.getPhon());
	}

	public String idCheck(String str) {
		System.out.print(str + "�� ID �Է�:");
		String id = sc.next();
		return id;
	}

	public String passCheck(String str) {
		System.out.print(str + "�� ��й�ȣ �Է� : ");
		String pass = sc.next();
		return pass;
	}
}
