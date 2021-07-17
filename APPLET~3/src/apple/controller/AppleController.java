package apple.controller;

import apple.view.AppleView;
import apple.vo.AppleWatch;
import apple.vo.IPad;
import apple.vo.IPhone;
import apple.vo.MacBook;
import apple.vo.Product;

public class AppleController {
	Product[][] productStock; // 재고 - 0 : Watch, 1 : Pad, 2 : Phone, 3 : MacBook
	Product[] buyList; // 구매목록

	// product
	// 재고 - 0 : Watch, 1 : Pad, 2 : Phone, 3 : MacBook
	final int WATCH = 0;
	final int PAD = 1;
	final int PHONE = 2;
	final int MACBOOK = 3;

	// index
	int buyIndex; // 구매목록 index
	int watchIndex; // watch index
	int padIndex;
	int phoneIndex;
	int macBookIndex;

	AppleView view;

	// back
	boolean toWelcome;
	boolean toShopping;

	public AppleController() {
		super();
		productStock = new Product[4][10]; // 종류 : 4 + stock 10 까지
		buyList = new Product[10];

		buyIndex = 0;
		watchIndex = 0;
		padIndex = 0;
		phoneIndex = 0;
		macBookIndex = 0;

		toWelcome = false;
		toShopping = false;
		// 재고 추가
		inputStock();

		view = new AppleView();
	}

	public void main() {

		while (true) {
			switch (view.showAppleStore()) { // 메인메뉴
			case 1:
				staff();
				break;
			case 2: // 손님
				guest();
				break;
			case 0:
				view.printMsg("퇴장하기");
				return;
			default:
				view.printFaultMsg();
				break;
			}
		}
	}

	

	public void staff() {

		
		while (true) {

			int num = view.Manager();

			switch (num) {
			case 1:
				
					int Prod = view.Register();
					switch (Prod) {
					case 1:
						productStock[PHONE][phoneIndex++] = view.Iphone();
						break;
					case 2:
						productStock[MACBOOK][macBookIndex++] = view.MacBook();
						break;
					case 3:
						productStock[PAD][padIndex++] = view.Ipad();
						break;
					case 4:
						productStock[WATCH][watchIndex++] = view.AppleWatch();
						break;
					case 0:
						break;
					}
				break;
			case 2:
				view.printAll(productStock, phoneIndex, PHONE);
				view.printAll2(productStock, macBookIndex, MACBOOK);
				view.printAll3(productStock, padIndex, PAD);
				view.printAll4(productStock, watchIndex, WATCH);

				break;
			case 3:
				while (true) {
					int modifyNum = view.modify();

					switch (modifyNum) {
					case 1: // 아이폰
						view.modifyIphone(productStock, phoneIndex, PHONE);
						break;
					case 2: // 맥북
						view.modifyMacbook(productStock, phoneIndex, MACBOOK);
						break;
					case 3: // 아이패드
						view.modifyIpad(productStock, phoneIndex, PAD);
						break;
					case 4: // 애플워치
						view.modifyWatch(productStock, phoneIndex, WATCH);
						break;
					case 0:
						break;
					}
					break;
				}
				break;

			case 4:
				int deleteNum = view.deleteMenu();

				switch (deleteNum) {
				case 1:
					int Iphone = view.deleteIphone(productStock, phoneIndex, PHONE);
					if (Iphone != -1) {		
						for (int i = Iphone - 1; i < phoneIndex-1; i++) {	
							productStock[PHONE][i] = productStock[PHONE][i+1];
						}
						productStock[PHONE][--phoneIndex] = null;
						view.printMsg("삭제되었습니다");
						//view.intputName("삭제");			
						break;
					} else
						break;
				case 2:
					int mac = view.deletemacbook(productStock, macBookIndex, MACBOOK);
					if (mac != -1) {
						for (int i = mac - 1; i < macBookIndex - 1; i++) {
							productStock[MACBOOK][i] = productStock[MACBOOK][i+1];
						}
						productStock[MACBOOK][--macBookIndex] = null;
						view.printMsg("삭제되었습니다");
						break;
					} else
						break;
				case 3:
					int Ipad = view.deleteIpad(productStock, padIndex, PAD);
					if (Ipad != -1) {
						for (int i = Ipad - 1; i < padIndex - 1; i++) {
							productStock[PAD][i] = productStock[PAD][i+1];
						}
						productStock[PAD][--padIndex] = null;
						view.printMsg("삭제되었습니다");
						break;
					} else
						break;
				case 4:
					int Watch = view.deletewatch(productStock, watchIndex, WATCH);
					if (Watch != -1) {
						for (int i = Watch - 1; i < watchIndex - 1; i++) {
							productStock[WATCH][i] = productStock[WATCH][i+1];
						}
						productStock[WATCH][--watchIndex] = null;
						view.printMsg("삭제되었습니다");
						break;
					} else
						break;
				case 0:
					break;
				default:
					continue;
				}
				break;
			case 0:
				return;
			}	
		}
	}

	public void guest() {
		toWelcome = true;

		while (toWelcome) {
			switch (view.showWelCome()) { // Store 입장
			case 1: // Shopping
				toShopping = true;

				while (toShopping) {
					switch (view.showShopping()) { // ShoppingList
					case 1: // AppleWatch
						view.printProductList(productStock[WATCH], watchIndex);

						if (view.buyProduct(productStock[WATCH], buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 2: // Ipad
						view.printProductList(productStock[PAD], padIndex);

						if (view.buyProduct(productStock[PAD], buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 3: // IPhone
						view.printProductList(productStock[PHONE], phoneIndex);

						if (view.buyProduct(productStock[PHONE], buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 4: // MacBook
						view.printProductList(productStock[MACBOOK], macBookIndex);

						if (view.buyProduct(productStock[MACBOOK], buyList, buyIndex)) {
							buyIndex++; // 구매목록 추가
							back("welcome");
						} else {
							back("welcome");
						}
						break;
					case 0: // welcome 돌아가기
						back("welcome");
						break;
					default:
						view.printFaultMsg();
						break;
					}
				}
				break;
			case 2: // BuyList
				view.printBuyList(buyList, buyIndex);
				break;
			case 0: // Store 나가기
				back("exit");
				break;
			default:
				view.printFaultMsg();
				break;
			}
		}
	}

	// 재고 추가
	public void inputStock() {
		// watch
		productStock[WATCH][watchIndex++] = new AppleWatch("AppleWatch 3", "White", "watch", 10, 100000, 1);
		productStock[WATCH][watchIndex++] = new AppleWatch("AppleWatch Nike", "Black", "watch", 10, 200000, 2);
		productStock[WATCH][watchIndex++] = new AppleWatch("AppleWatch SE", "Yellow", "watch", 10, 300000, 3);
		// pad
		productStock[PAD][padIndex++] = new IPad("iPad", "White", "pad", 10, 100000, 1);
		productStock[PAD][padIndex++] = new IPad("iPad Air", "Black", "pad", 10, 200000, 2);
		productStock[PAD][padIndex++] = new IPad("iPad Pro", "Gold", "pad", 10, 300000, 3);
		// phone
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone 12", "White", "phone", 10, 50000, 1);
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone 12 Mini", "Black", "phone", 10, 70000, 2);
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone 12 Pro", "Green", "phone", 10, 100000, 3);
		productStock[PHONE][phoneIndex++] = new IPhone("iPhone SE", "Purple", "phone", 10, 200000, 4);
		// macBook
		productStock[MACBOOK][macBookIndex++] = new MacBook("iMac", "White", "macBook", 10, 100000, 1);
		productStock[MACBOOK][macBookIndex++] = new MacBook("iMac Pro", "Black", "macBook", 10, 200000, 2);
		productStock[MACBOOK][macBookIndex++] = new MacBook("MacBook Air", "Green", "macBook", 10, 400000, 3);
		productStock[MACBOOK][macBookIndex++] = new MacBook("MacBook Pro", "Yellow", "macBook", 10, 800000, 4);
	}

	public void back(String where) {
		if (where.equals("welcome")) {
			toWelcome = true; // welCome 실행
			toShopping = false; // Shopping 종료
		} else if (where.equals("exit")) {
			toWelcome = false;
		}
	}
}
