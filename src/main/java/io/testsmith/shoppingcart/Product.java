package io.testsmith.shoppingcart;

public class Product {
	private final String title;
	private final double price;
	
	public Product (String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Product) {
			Product product = (Product)o;
			return product.getTitle().equals(title);
		}
		return false;
	}
}

