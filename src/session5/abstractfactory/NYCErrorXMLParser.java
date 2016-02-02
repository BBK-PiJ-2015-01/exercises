package session5.abstractfactory;

public class NYCErrorXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
