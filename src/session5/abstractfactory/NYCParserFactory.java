package session5.abstractfactory;

public class NYCParserFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String xmlParserType) {
		
		return simpleSwitchFactoryBuilder(xmlParserType);
	}
	
	private XMLParser simpleSwitchFactoryBuilder(String xmlParserType) {
		
		switch(xmlParserType) {
		case "NYCORDER":
			return new NYCOrderXMLParser();
		case "NYCERROR":
			return new NYCErrorXMLParser();
		case "NYCRESPONSE":
			return new NYCResponseXMLParser();
		case "NYCFEEDBACK":
			return new NYCFeedbackXMLParser();
			default:
			throw new IllegalArgumentException(String.format("Unknown parser type: %s", xmlParserType));
		}
	}

}
