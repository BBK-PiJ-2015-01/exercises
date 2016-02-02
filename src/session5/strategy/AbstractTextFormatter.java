package session5.strategy;

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