package session5.abstractfactory;

public class NYCResponseXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
