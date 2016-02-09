package session5.bridge;

public class AbstractProduct implements Product{

	private final String description;

	public AbstractProduct(String description) {
		super();
		this.description = description;
	}
	
	@Override
	public String getDescription(){
		return description;
	}
}