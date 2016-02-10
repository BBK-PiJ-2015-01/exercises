package session5.builder;

public class SedanCarBuilder implements CarBuilder {

	private final Car product;

	private final String TYPE = "SEDAN";
	
	public SedanCarBuilder() {

		product = new Car(TYPE);
	}

	@Override
	public void build() {
		
		setBodyStyle();
		setBrakes();
		setEngine();
		setFuelType();
		setPower();
		setSeats();
		setWindows();
	}

	@Override
	public Car getCar() {
		
		return product;
	}

	private void setBodyStyle() {
		product.setBodyStyle("External dimensions: overall length (inches): 202.9,"
				+ "overall width (inches): 76.2, overall height (inches): 60.7,"
				+ "wheelbase (inches): 112.9, front track (inches): 65.3,"
				+ "rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
	}

	private void setBrakes() {
		product.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
	}

	private void setEngine() {
		product.setEngine("3.5L Duramax V 6 DOHC");
	}

	private void setFuelType() {
		product.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
	}

	private void setPower() {
		product.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
	}

	private void setSeats() {
		product.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats");
	}

	private void setWindows() {
		product.setWindows("Laminated side windows.Fixed rear window with defroster");
	}
}
