package session5.builder;

public class SportsCarBuilder implements CarBuilder {

	private final Car product;
	private final String TYPE = "SPORTS";

	public SportsCarBuilder() {

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
		product.setBodyStyle("External dimensions: overall length (inches): 192.3,"
				+ "overall width (inches): 75.5, overall height (inches): 54.2,"
				+ "wheelbase (inches): 112.3, front track (inches): 63.7,"
				+ "rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7");
	}

	private void setBrakes() {
		product.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution. Stability control");
	}

	private void setEngine() {
		product.setEngine("3.6L V 6 DOHC and variable valve timing");
	}

	private void setFuelType() {
		product.setFuelType("Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range");
	}

	private void setPower() {
		product.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm");
	}

	private void setSeats() {
		product.setSeats("Driver sports front seat with one power adjustments manual height,"
				+ "front passenger seat sports front seat with one power adjustments");
	}

	private void setWindows() {
		product.setWindows("Front windows with one-touch on two windows");
	}
}
