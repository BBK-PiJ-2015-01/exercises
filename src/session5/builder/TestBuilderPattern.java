package session5.builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		
		CarBuilder carBuilder = new SedanCarBuilder();
//		CarDirector director = new CarDirector(carBuilder);
		carBuilder.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		carBuilder = new SportsCarBuilder();
//		director = new CarDirector(carBuilder);
		carBuilder.build();
		car = carBuilder.getCar();
		System.out.println(car);
	}
}
