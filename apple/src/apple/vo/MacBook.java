package apple.vo;

public class MacBook extends Product{

	

	public MacBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MacBook(String name, String color, int stock, int price) {
		super(name, color, stock, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
