package session5;

public abstract class TextEditor {
	
	protected TextFormatter formatter;
	
	public TextEditor(TextFormatter formatter) {

		this.formatter = formatter;
	}

	public abstract void publishText(String text);
}
