package apple.vo;

public class Iphone extends Product{


	
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Iphone(String name, String color, int stock, int price) {
		super(name, color, stock, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
