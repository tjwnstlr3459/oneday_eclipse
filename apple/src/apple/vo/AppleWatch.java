package apple.vo;

public class AppleWatch extends Product{

	
	
	public AppleWatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppleWatch(String name, String color, int stock, int price) {
		super(name, color, stock, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}


}
