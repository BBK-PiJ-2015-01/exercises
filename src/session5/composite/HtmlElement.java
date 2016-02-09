package session5.composite;

public class HtmlElement extends HtmlTag {

	private String tagBody;

	public HtmlElement(String tagName) {

		this.tagName = tagName;
	}

	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}

	@Override
	public void generateHtml() {

		System.out.print(startTag);
		System.out.print(tagBody == null ? "" : tagBody);
		System.out.println(endTag);
	}
}
