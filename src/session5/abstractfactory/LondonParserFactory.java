package session5.abstractfactory;

public class LondonParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String xmlParserType) {
		
		return simpleSwitchFactoryBuilder(xmlParserType);
	}
	
	private XMLParser simpleSwitchFactoryBuilder(String xmlParserType) {
		
		switch(xmlParserType) {
		case "LondonORDER":
			return new LondonOrderXMLParser();
		case "LondonERROR":
			return new LondonErrorXMLParser();
		case "LondonRESPONSE":
			return new LondonResponseXMLParser();
		case "LondonFEEDBACK":
			return new LondonFeedbackXMLParser();
			default:
			throw new IllegalArgumentException(String.format("Unknown parser type: %s", xmlParserType));
		}
	}

}
