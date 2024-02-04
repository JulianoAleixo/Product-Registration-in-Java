package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	// Constructors
	public UsedProduct() {
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	// Getters and Setters
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// Methods
	@Override
	public String priceTag() {
		return super.getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(this.manufactureDate) + ")";
	}
}
