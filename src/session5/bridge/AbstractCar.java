package session5.bridge;

public abstract class AbstractCar implements Car {

	protected final Product product;
	protected final String description;

	public AbstractCar(Product product, String description) {
		super();
		this.product = product;
		this.description = description;
		System.out.println("Producing " + product.getDescription());
	}

	@Override
	public void produceProduct() {
		System.out.println("Modifying product " + product.getDescription() + " according to " + description);
	}

	@Override
	public void assemble() {
		System.out.println("Assembling " + product.getDescription() + " for " + description);
	}

	@Override
	public void printDetails() {
		System.out.println("Car: " + description + ", Product: " + product.getDescription());
	}
}