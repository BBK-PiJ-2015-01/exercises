package session3;

public class ConcreteCreator implements Creator {
	
	@Override
	public Product getProductInstance() {
		
		return Creator.super.getProductInstance();
	}
}
