package entites;

public class ImportedProduct extends Product{
	private Double customsFee;
	
	// Constructors
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	// Getters and Setters
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// Methods
	private Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $" + String.format("%.2f", totalPrice()) + " (Customs fee: $" + String.format("%.2f", this.customsFee) + ")";
	}
}
