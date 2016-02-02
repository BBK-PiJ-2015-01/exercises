package session5;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TextEditorTest {

	private TextEditor instance;
	
	private PrintStream ps;
	private BufferedReader reader;
	private ByteArrayOutputStream os;

	@Before
	public void setUp() throws Exception {
		os = new ByteArrayOutputStream(1024);
		ps = new PrintStream(os);		
	}

	@Test
	public void upperCaseFormatterTest() throws IOException {
				
		String testCase = "all lower case";
		String expected = testCase.toUpperCase();
		
		instance = new SimpleTextEditor(new UpperCaseTextFormatter(ps));
		instance.publishText(testCase);

		String result = readLine();
		assertEquals(expected, result);
	}
	
	@Test
	public void lowerCaseFormatterTest() throws IOException {
				
		String testCase = "ALL UPPER CASE";
		String expected = testCase.toLowerCase();
		
		instance = new SimpleTextEditor(new LowerCaseTextFormatter(ps));
		instance.publishText(testCase);

		String result = readLine();
		assertEquals(expected, result);
	}
	
	private String readLine() throws IOException {
		reader = new BufferedReader( new InputStreamReader (new ByteArrayInputStream(os.toByteArray())));
		return reader.readLine();
	}
}
