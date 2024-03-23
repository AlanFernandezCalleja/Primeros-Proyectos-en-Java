package Product;

public class Product {
	String model;
	String mark;
	double price;
	public Product () {
		
	}
	public Product(String model, String mark, double price) {
		this.model = model;
		this.mark = mark;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
