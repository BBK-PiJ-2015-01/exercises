package session5.abstractfactory;

public class LondonErrorXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
