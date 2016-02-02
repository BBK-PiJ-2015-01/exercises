package session5.abstractfactory;

public interface AbstractParserFactory {
	
	public XMLParser getParserInstance(String ParserType);
}
