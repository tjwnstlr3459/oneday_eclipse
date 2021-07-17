package apple.controoler;

import apple.view.AppleView;
import apple.vo.Product;

public class AppleController {

	Product[][] p;

	int index;	//아이폰
	int index2;	//맥북
	int index3;	//아이패드
	int index4;	//애플워치

	AppleView view;

	int iphone = 1;	//배열 열
	int macbook = 2;//배열 열
	int ipad = 3;	//배열 열
	int watch = 4;	//배열 열
	
	

	public AppleController() {
		super();
		p = new Product[4][10];
		view = new AppleView();
		index = 0;
		index2 = 0;
		index3 = 0;
		index4 = 0;
	}

	public void main() {

		while (true) {
			int sel = view.menu();
			switch (sel) {
			case 1:
				staff();
				break;
			case 2:
				guest();
				break;
			case 0:
				return;
			}
		}
	}

	public void staff() {

		while (true) {

			int num = view.Manager();

			switch (num) {
			case 1:
				while (true) {
					int Prod = view.Register();
					switch (Prod) {
					case 1:
						p[iphone][index++] = view.Iphone();
						break;
					case 2:
						p[macbook][index2++] = view.MacBook();
						break;
					case 3:
						p[ipad][index3++] = view.Ipad();
						break;
					case 4:
						p[watch][index4++] = view.AppleWatch();
						break;
					case 0:
						return;
					}
				}
			case 2:
				view.printAll(p, index, iphone);
				view.printAll2(p, index2, macbook);
				view.printAll3(p, index3, ipad);
				view.printAll4(p, index4, watch);

				break;
			case 3:
				while (true) {
					int modifyNum = view.modify();

					switch (modifyNum) {
					case 1: // 아이폰
						view.modifyIphone(p, index, iphone);
						break;
					case 2: // 맥북
						view.modifyMacbook(p, index, macbook);
						break;
					case 3: // 아이패드
						view.modifyIpad(p, index, ipad);
						break;
					case 4: // 애플워치
						view.modifyWatch(p, index, watch);
						break;
					case 0:
						return;
					}
				}

			case 4:
				while (true) {
					int deleteNum = view.deleteMenu();
					switch (deleteNum) {
					case 1:
						while (true) {
							int Iphone = view.deleteIphone(p, index, iphone);
							if (Iphone != -1) {
								for (int i = Iphone - 1; i < index - 1; i++) {
									p[iphone][Iphone - 1] = p[iphone][Iphone];
								}
								p[iphone][index--] = null;
								view.intputName("삭제");
								continue;
							} else
								return;
						}
					case 2:
						int mac = view.deletemacbook(p, index, macbook);
						if (mac != -1) {
							for (int i = mac - 1; i < index - 1; i++) {
								p[macbook][mac - 1] = p[macbook][mac];
							}
							p[macbook][index--] = null;
							view.intputName("삭제");
						} else
							break;
					case 3:
						int Ipad = view.deleteIpad(p, index, ipad);
						if (Ipad != -1) {
							for (int i = Ipad - 1; i < index - 1; i++) {
								p[ipad][Ipad - 1] = p[ipad][Ipad];
							}
							p[ipad][index--] = null;
							view.intputName("삭제");
						} else
							break;
					case 4:
						int Watch = view.deletewatch(p, index, watch);
						if (Watch != -1) {
							for (int i = Watch - 1; i < index - 1; i++) {
								p[watch][Watch - 1] = p[watch][Watch];
							}
							p[watch][index--] = null;
							view.intputName("삭제");
						} else
							break;
					case 0:
						return;
					}
					continue;
				}
			case 0:
				return;
			}

		}

	}

	private void guest() {
		// TODO Auto-generated method stub

	}
}
