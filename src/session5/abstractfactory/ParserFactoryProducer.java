package session5.abstractfactory;

public class ParserFactoryProducer {

	public static AbstractParserFactory getFactory(String factoryType) {

		return simpleSwitchParserFactory(factoryType);
	}

	private static AbstractParserFactory simpleSwitchParserFactory(String factoryType) {

		switch (factoryType) {
		case "NYCFactory":
			return new NYCParserFactory();
		case "LondonFactory":
			return new LondonParserFactory();
		default:
			throw new IllegalArgumentException(String.format("Unknown factory type: %s", factoryType));
		}
	}
}
