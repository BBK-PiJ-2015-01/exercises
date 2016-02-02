package session5;

import java.io.PrintStream;

public abstract class PrintStreamTextFormatter implements TextFormatter {

	protected PrintStream ps;

	public PrintStreamTextFormatter() {
		this(System.out);
	}

	public PrintStreamTextFormatter(PrintStream ps) {
		super();
		this.ps = ps;
	}
}