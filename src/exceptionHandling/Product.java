package exceptionHandling;

public class Product {
	private String brand;
	private int cost;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost)throws InvalidPriceException {
		if(cost>=10000)
			this.cost = cost;
		else
			throw new InvalidPriceException("Invalid Price");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Product(String brand, int cost, String color) throws InvalidPriceException {
		super();
		setBrand(brand);
		setColor(color);
		setCost(cost);
	}
	
	@Override
	public String toString() {
		return "Product [brand=" + brand + ", cost=" + cost + ", color=" + color + "]";
	}
	
	
}
