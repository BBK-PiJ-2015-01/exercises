package session5.strategy;

public class SimpleTextEditor extends TextEditor {

	public SimpleTextEditor(TextFormatter formatter) {
		super(formatter);
	}

	@Override
	public void publishText(String text) {

		formatter.format(text);
	}
}
