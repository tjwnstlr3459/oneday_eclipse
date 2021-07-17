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
		System.out.print(msg+"되었습니다.");
		String name = sc.next();
		return name;
	}

	public int menu() {
		System.out.println("=======Apple Store=======");
		System.out.println("|\t  1.직원\t\t|");
		System.out.println("|\t  2.손님\t\t|");
		System.out.println("|\t  3.퇴장\t\t|");
		System.out.println("=========================");
		System.out.print("선택 ==>");
		int sel = sc.nextInt();
		return sel;
	}

	public int Manager() {
		System.out.println("========관리 프로그램========");
		System.out.println("|\t1.새 제품 등록\t|");
		System.out.println("|\t2.현재 재고 현황\t|");
		System.out.println("|\t3.재고 변경\t\t|");
		System.out.println("|\t4.제품 삭제\t\t|");
		System.out.println("|\t0.뒤로 가기\t\t|");
		System.out.println("=========================");
		System.out.print("선택 >>");
		int num = sc.nextInt();
		return num;
	}
	public int Register() {
		System.out.println("=======Apple Store=======");
		System.out.println("|\t1.아이폰 등록\t|");
		System.out.println("|\t2.맥북 등록\t\t|");
		System.out.println("|\t3.아이패드 등록\t|");
		System.out.println("|\t4.애플워치 등록\t|");
		System.out.println("|\t0.뒤로가기\t\t|");
		System.out.println("=========================");
		System.out.print("선택 ==>");
		int sel = sc.nextInt();
		return sel;
	}

	public void printAll(Product[][] p, int index,int iphone) {

		System.out.println("===========아이폰==============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[iphone][i].getName()+"\t"+p[iphone][i].getColor()+"\t"+p[iphone][i].getStock()+"\t"+p[iphone][i].getPrice());
		}System.out.println();
	}
	public void printAll2(Product[][] p, int index2, int macbook) {
		System.out.println("============맥북===============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index2; i++) {
			System.out.println(count++ +"\t"+p[macbook][i].getName()+"\t"+p[macbook][i].getColor()+"\t"+p[macbook][i].getStock()+"\t"+p[macbook][i].getPrice());
		}System.out.println();
	}
	public void printAll3(Product[][] p, int index3, int ipad) {
		System.out.println("===========아이패드=============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index3; i++) {
			System.out.println(count++ +"\t"+p[ipad][i].getName()+"\t"+p[ipad][i].getColor()+"\t"+p[ipad][i].getStock()+"\t"+p[ipad][i].getPrice());
		}System.out.println();
	}
	public void printAll4(Product[][] p, int index4, int watch) {
		System.out.println("===========애플워치=============");
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		int count = 1;
		for (int i = 0; i < index4; i++) {
			System.out.println(count++ +"\t"+p[watch][i].getName()+"\t"+p[watch][i].getColor()+"\t"+p[watch][i].getStock()+"\t"+p[watch][i].getPrice());
		}System.out.println();
	}


	public int modify() {
		System.out.println("==어떤 제품의 재고 변경하시겠습니까?==");
		System.out.println("|\t  1.아이폰 \t|");
		System.out.println("|\t  2.맥북     \t|");
		System.out.println("|\t  3.아이패드 \t|");
		System.out.println("|\t  4.애플워치 \t|");
		System.out.println("|\t  0.뒤로가기\t|");
		System.out.println("=========================");
		System.out.print("선택 ==>");
		int sel = sc.nextInt();
		return sel;
	}
	public void modifyIphone(Product[][] p, int index,int iphone) {
		System.out.println("===========아이폰==============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[iphone][i].getName()+"\t"+p[iphone][i].getColor()+"\t"+p[iphone][i].getStock()+"\t"+p[iphone][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[iphone][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 "+p[iphone][sel-1].getStock()+"개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[iphone][sel-1].setStock(num);
		System.out.println("변경 완료");
	}
	public void modifyMacbook(Product[][] p, int index,int macbook) {
		System.out.println("============맥북===============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[macbook][i].getName()+"\t"+p[macbook][i].getColor()+"\t"+p[macbook][i].getStock()+"\t"+p[macbook][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[macbook][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 "+p[macbook][sel-1].getStock()+"개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[macbook][sel-1].setStock(num);
		System.out.println("변경 완료");
	}
	public void modifyIpad(Product[][] p, int index,int ipad) {
		System.out.println("===========아이패드==============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[ipad][i].getName()+"\t"+p[ipad][i].getColor()+"\t"+p[ipad][i].getStock()+"\t"+p[ipad][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[ipad][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 "+p[ipad][sel-1].getStock()+"개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[ipad][sel-1].setStock(num);
		System.out.println("변경 완료");
	}
	public void modifyWatch(Product[][] p, int index,int watch) {
		System.out.println("===========애플워치==============");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[watch][i].getName()+"\t"+p[watch][i].getColor()+"\t"+p[watch][i].getStock()+"\t"+p[watch][i].getPrice());
		}
		System.out.print("변경할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[watch][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.println("현재 재고는 "+p[watch][sel-1].getStock()+"개입니다.");
		System.out.print("변경 하시려는 재고량을 입력해주세요 : ");
		int num = sc.nextInt();
		p[watch][sel-1].setStock(num);
		System.out.println("변경 완료");
	}

	public int deleteMenu() {
		System.out.println("===어떤 제품을 삭제 하시겠습니까?===");
		System.out.println("|\t 1.아이폰 \t|");
		System.out.println("|\t 2.맥북     \t|");
		System.out.println("|\t 3.아이패드 \t|");
		System.out.println("|\t 4.애플워치 \t|");
		System.out.println("|\t 0.뒤로가기\t|");
		System.out.println("=========================");
		System.out.print("선택 ==>");
		int sel = sc.nextInt();
		return sel;
	}
	public int deleteIphone(Product[][] p, int index,int iphone) {
		System.out.println("====아이폰====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[iphone][i].getName()+"\t"+p[iphone][i].getColor()+"\t"+p[iphone][i].getStock()+"\t"+p[iphone][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[iphone][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;		
	}
	public int deletemacbook(Product[][] p, int index,int macbook) {
		System.out.println("====맥북====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[macbook][i].getName()+"\t"+p[macbook][i].getColor()+"\t"+p[macbook][i].getStock()+"\t"+p[macbook][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[macbook][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;		
	}
	public int deleteIpad(Product[][] p, int index, int ipad) {
		System.out.println("====아이패드====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[ipad][i].getName()+"\t"+p[ipad][i].getColor()+"\t"+p[ipad][i].getStock()+"\t"+p[ipad][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[ipad][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;		
	}
	public int deletewatch(Product[][] p, int index,int watch) {
		System.out.println("====애플워치====");
		int count = 1;
		System.out.println("No\t제품명\t컬러\t재고\t가격");
		for (int i = 0; i < index; i++) {
			System.out.println(count++ +"\t"+p[watch][i].getName()+"\t"+p[watch][i].getColor()+"\t"+p[watch][i].getStock()+"\t"+p[watch][i].getPrice());
		}
		System.out.print("삭제할 제품의 'No'를 입력하세요 : ");
		int sel = sc.nextInt();
		System.out.println("["+p[watch][sel-1].getName()+"]"+"의 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제 하시겠습니까?[y/n] : ");
		char ch = sc.next().toLowerCase().charAt(0);
		if(ch=='y') {
			return sel;
		}else {
			System.out.println("삭제 작업이 취소되었습니다.");
		}
		return -1;		
	}







	public Product Iphone() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.Iphone(name, color, stock, price);
		return p;
	}
	public Product MacBook() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.MacBook(name, color, stock, price);
		return p;
	}
	public Product Ipad() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.Ipad(name, color, stock, price);
		return p;
	}
	public Product AppleWatch() {
		System.out.print("상품명을 입력하세요 : ");
		String name = sc.next();
		System.out.print("컬러색을 입력하세요 : ");
		String color = sc.next();
		System.out.print("수량을 입력하세요 : ");
		int stock = sc.nextInt();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();

		Product p = null;
		p = new apple.vo.AppleWatch(name, color, stock, price);
		return p;
	}

}



























