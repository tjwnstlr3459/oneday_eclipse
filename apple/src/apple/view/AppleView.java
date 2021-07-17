package apple.view;

import java.util.Scanner;

import apple.vo.Product;

public class AppleView {

	Scanner sc;

	public AppleView() {
		super();
		sc = new Scanner(System.in);
	}

	public String intputName(String msg) {
		System.out.print(msg+"�Ǿ����ϴ�.");
		String name = sc.next();
		return name;
	}

	public int menu() {
		System.out.println("=======Apple Store=======");
		System.out.println("|\t  1.����\t\t|");
		System.out.println("|\t  2.�մ�\t\t|");
		System.out.println("|\t  3.����\t\t|");
		System.out.println("=========================");
		System.out.print("���� ==>");
		int sel = sc.nextInt();
		return sel;
	}

	public int Manager() {
		System.out.println("========���� ���α׷�========");
		System.out.println("|\t1.�� ��ǰ ���\t|");
		System.out.println("|\t2.���� ��� ��Ȳ\t|");
		System.out.println("|\t3.��� ����\t\t|");
		System.out.println("|\t4.��ǰ ����\t\t|");
		System.out.println("|\t0.�ڷ� ����\t\t|");
		System.out.println("=========================");
		System.out.print("���� >>");
		int num = sc.nextInt();
		return num;
	}
	public int Register() {
		System.out.println("=======Apple Store=======");
		System.out.println("|\t1.������ ���\t|");
		System.out.println("|\t2.�ƺ� ���\t\t|");
		System.out.println("|\t3.�����е� ���\t|");
		System.out.println("|\t4.���ÿ�ġ ���\t|");
		System.out.println("|\t0.�ڷΰ���\t\t|");
		System.out.println("=========================");
		System.out.print("���� ==>");
		int sel = sc.nextInt();
		return sel;
	}

	public void printAll(Product[][] p, int index,int iphone) {

		System.out.println("===========������==============");
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		int count = 1;
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[iphone][i].getName()+"\t"+p[iphone][i].getColor()+"\t"+p[iphone][i].getStock()+"\t"+p[iphone][i].getPrice());
		}System.out.println();
	}
	public void printAll2(Product[][] p, int index2, int macbook) {
		System.out.println("============�ƺ�===============");
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		int count = 1;
		for (int i = 0; i < index2; i++) {
			System.out.println(count++ +"\t"+p[macbook][i].getName()+"\t"+p[macbook][i].getColor()+"\t"+p[macbook][i].getStock()+"\t"+p[macbook][i].getPrice());
		}System.out.println();
	}
	public void printAll3(Product[][] p, int index3, int ipad) {
		System.out.println("===========�����е�=============");
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		int count = 1;
		for (int i = 0; i < index3; i++) {
			System.out.println(count++ +"\t"+p[ipad][i].getName()+"\t"+p[ipad][i].getColor()+"\t"+p[ipad][i].getStock()+"\t"+p[ipad][i].getPrice());
		}System.out.println();
	}
	public void printAll4(Product[][] p, int index4, int watch) {
		System.out.println("===========���ÿ�ġ=============");
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		int count = 1;
		for (int i = 0; i < index4; i++) {
			System.out.println(count++ +"\t"+p[watch][i].getName()+"\t"+p[watch][i].getColor()+"\t"+p[watch][i].getStock()+"\t"+p[watch][i].getPrice());
		}System.out.println();
	}


	public int modify() {
		System.out.println("==� ��ǰ�� ��� �����Ͻðڽ��ϱ�?==");
		System.out.println("|\t  1.������ \t|");
		System.out.println("|\t  2.�ƺ�     \t|");
		System.out.println("|\t  3.�����е� \t|");
		System.out.println("|\t  4.���ÿ�ġ \t|");
		System.out.println("|\t  0.�ڷΰ���\t|");
		System.out.println("=========================");
		System.out.print("���� ==>");
		int sel = sc.nextInt();
		return sel;
	}
	public void modifyIphone(Product[][] p, int index,int iphone) {
		System.out.println("===========������==============");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[iphone][i].getName()+"\t"+p[iphone][i].getColor()+"\t"+p[iphone][i].getStock()+"\t"+p[iphone][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[iphone][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.println("���� ���� "+p[iphone][sel-1].getStock()+"���Դϴ�.");
		System.out.print("���� �Ͻ÷��� ����� �Է����ּ��� : ");
		int num = sc.nextInt();
		p[iphone][sel-1].setStock(num);
		System.out.println("���� �Ϸ�");
	}
	public void modifyMacbook(Product[][] p, int index,int macbook) {
		System.out.println("============�ƺ�===============");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[macbook][i].getName()+"\t"+p[macbook][i].getColor()+"\t"+p[macbook][i].getStock()+"\t"+p[macbook][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[macbook][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.println("���� ���� "+p[macbook][sel-1].getStock()+"���Դϴ�.");
		System.out.print("���� �Ͻ÷��� ����� �Է����ּ��� : ");
		int num = sc.nextInt();
		p[macbook][sel-1].setStock(num);
		System.out.println("���� �Ϸ�");
	}
	public void modifyIpad(Product[][] p, int index,int ipad) {
		System.out.println("===========�����е�==============");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[ipad][i].getName()+"\t"+p[ipad][i].getColor()+"\t"+p[ipad][i].getStock()+"\t"+p[ipad][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[ipad][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.println("���� ���� "+p[ipad][sel-1].getStock()+"���Դϴ�.");
		System.out.print("���� �Ͻ÷��� ����� �Է����ּ��� : ");
		int num = sc.nextInt();
		p[ipad][sel-1].setStock(num);
		System.out.println("���� �Ϸ�");
	}
	public void modifyWatch(Product[][] p, int index,int watch) {
		System.out.println("===========���ÿ�ġ==============");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[watch][i].getName()+"\t"+p[watch][i].getColor()+"\t"+p[watch][i].getStock()+"\t"+p[watch][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[watch][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.println("���� ���� "+p[watch][sel-1].getStock()+"���Դϴ�.");
		System.out.print("���� �Ͻ÷��� ����� �Է����ּ��� : ");
		int num = sc.nextInt();
		p[watch][sel-1].setStock(num);
		System.out.println("���� �Ϸ�");
	}

	public int deleteMenu() {
		System.out.println("===� ��ǰ�� ���� �Ͻðڽ��ϱ�?===");
		System.out.println("|\t 1.������ \t|");
		System.out.println("|\t 2.�ƺ�     \t|");
		System.out.println("|\t 3.�����е� \t|");
		System.out.println("|\t 4.���ÿ�ġ \t|");
		System.out.println("|\t 0.�ڷΰ���\t|");
		System.out.println("=========================");
		System.out.print("���� ==>");
		int sel = sc.nextInt();
		return sel;
	}
	public int deleteIphone(Product[][] p, int index,int iphone) {
		System.out.println("====������====");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[iphone][i].getName()+"\t"+p[iphone][i].getColor()+"\t"+p[iphone][i].getStock()+"\t"+p[iphone][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[iphone][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.print("�ش� ��ǰ�� ���� �Ͻðڽ��ϱ�?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("���� �۾��� ��ҵǾ����ϴ�.");
		}
		return -1;		
	}
	public int deletemacbook(Product[][] p, int index,int macbook) {
		System.out.println("====�ƺ�====");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[macbook][i].getName()+"\t"+p[macbook][i].getColor()+"\t"+p[macbook][i].getStock()+"\t"+p[macbook][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[macbook][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.print("�ش� ��ǰ�� ���� �Ͻðڽ��ϱ�?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("���� �۾��� ��ҵǾ����ϴ�.");
		}
		return -1;		
	}
	public int deleteIpad(Product[][] p, int index, int ipad) {
		System.out.println("====�����е�====");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[ipad][i].getName()+"\t"+p[ipad][i].getColor()+"\t"+p[ipad][i].getStock()+"\t"+p[ipad][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[ipad][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.print("�ش� ��ǰ�� ���� �Ͻðڽ��ϱ�?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("���� �۾��� ��ҵǾ����ϴ�.");
		}
		return -1;		
	}
	public int deletewatch(Product[][] p, int index,int watch) {
		System.out.println("====���ÿ�ġ====");
		int count = 1;
		System.out.println("No\t��ǰ��\t�÷�\t���\t����");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[watch][i].getName()+"\t"+p[watch][i].getColor()+"\t"+p[watch][i].getStock()+"\t"+p[watch][i].getPrice());
		}
		System.out.print("������ ��ǰ�� 'No'�� �Է��ϼ��� : ");
		int sel = sc.nextInt();
		System.out.println("["+p[watch][sel-1].getName()+"]"+"�� ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.print("�ش� ��ǰ�� ���� �Ͻðڽ��ϱ�?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("���� �۾��� ��ҵǾ����ϴ�.");
		}
		return -1;		
	}







	public Product Iphone() {
		System.out.print("��ǰ���� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("�÷����� �Է��ϼ��� : ");
		String color = sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		int stock = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.Iphone(name, color, stock, price);
		return p;
	}
	public Product MacBook() {
		System.out.print("��ǰ���� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("�÷����� �Է��ϼ��� : ");
		String color = sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		int stock = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.MacBook(name, color, stock, price);
		return p;
	}
	public Product Ipad() {
		System.out.print("��ǰ���� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("�÷����� �Է��ϼ��� : ");
		String color = sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		int stock = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.Ipad(name, color, stock, price);
		return p;
	}
	public Product AppleWatch() {
		System.out.print("��ǰ���� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("�÷����� �Է��ϼ��� : ");
		String color = sc.next();
		System.out.print("������ �Է��ϼ��� : ");
		int stock = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.AppleWatch(name, color, stock, price);
		return p;
	}

}



























