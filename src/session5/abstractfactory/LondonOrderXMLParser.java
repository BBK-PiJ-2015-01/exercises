package session5.abstractfactory;

public class LondonOrderXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
