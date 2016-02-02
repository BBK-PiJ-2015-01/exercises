package session5;

import java.io.PrintStream;

public class UpperCaseTextFormatter extends AbstractTextFormatter {

	
	public UpperCaseTextFormatter() {
		super();
	}

	public UpperCaseTextFormatter(PrintStream ps) {
		super(ps);
	}

	@Override
	public void format(String text) {

		ps.println(text == null ? "NULL" : text.toUpperCase());
	}
}
