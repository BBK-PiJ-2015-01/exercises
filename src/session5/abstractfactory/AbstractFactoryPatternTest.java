package session5.abstractfactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbstractFactoryPatternTest {

	private AbstractParserFactory instance;


	@Test
	public void NYCFactoryTest() {

		instance = ParserFactoryProducer.getFactory("NYCFactory");
		XMLParser parser = instance.getParserInstance("NYCORDER");
		
		String expected = NYCOrderXMLParser.class.getSimpleName();
		String result = parser.parse();
		assertEquals(expected, result );
	}
	
	@Test
	public void LondonFactoryTest() {

		instance = ParserFactoryProducer.getFactory("LondonFactory");
		XMLParser parser = instance.getParserInstance("LondonORDER");
		
		String expected = LondonOrderXMLParser.class.getSimpleName();
		String result = parser.parse();
		assertEquals(expected, result );
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void UnknownFactoryTest() {

		instance = ParserFactoryProducer.getFactory("UnknownFactory");
	}
}
