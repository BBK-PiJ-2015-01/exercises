package session5.abstractfactory;

public class LondonFeedbackXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
