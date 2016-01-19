package session3;

public interface Creator {
	
	
	default Product getProductInstance() {
		
		return new ConcreteProduct();
	}
}
