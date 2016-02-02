package session5;

import java.io.PrintStream;

public abstract class AbstractTextFormatter implements TextFormatter {

	protected PrintStream ps;

	public AbstractTextFormatter() {
		this(System.out);
	}

	public AbstractTextFormatter(PrintStream ps) {
		super();
		this.ps = ps;
	}
}