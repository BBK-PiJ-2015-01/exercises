package session5.strategy;

import java.io.PrintStream;

public class LowerCaseTextFormatter extends AbstractTextFormatter {

	
	public LowerCaseTextFormatter() {
		super();
	}

	public LowerCaseTextFormatter(PrintStream ps) {
		super(ps);
	}

	@Override
	public void format(String text) {

		ps.println(text == null ? "NULL" : text.toLowerCase());
	}
}
