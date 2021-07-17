package apple.vo;

public abstract class Product {

	private String name;
	private String color;
	private int stock;
	private int price;
	private int buyCnt;

	public Product(String name, String color, int stock, int price) {
		super();
		this.name = name;
		this.color = color;
		this.stock = stock;
		this.price = price;
		buyCnt = 0;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract int getDiscount();
	
	public void setBuyCnt(int buyCnt) {
		this.buyCnt = buyCnt;
	}

}
