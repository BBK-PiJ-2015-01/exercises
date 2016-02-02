package session5.abstractfactory;

public class LondonResponseXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
