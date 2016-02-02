package session5.abstractfactory;

public class NYCFeedbackXMLParser implements XMLParser {

	@Override
	public String parse() {

		return getClass().getSimpleName();
	}
}
