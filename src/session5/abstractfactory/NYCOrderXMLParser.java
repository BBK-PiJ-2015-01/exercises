package session5.abstractfactory;

public class NYCOrderXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
