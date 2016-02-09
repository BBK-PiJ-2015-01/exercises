package session5.composite;

import java.util.List;

public abstract class HtmlTag {
	
	protected String startTag;
	protected String endTag;
	protected String tagName;
	

	public String getTagName(){
		return tagName;
	}

	public  void setStartTag(String tag) {
		startTag = tag;
	}

	public  void setEndTag(String tag) {
		endTag = tag;
	}

	public void setTagBody(String tagBody) {
		throw new UnsupportedOperationException("Current operation is not support - for this object");
	}

	public void addChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Current operation is not support - for this object");
	}

	public void removeChildTag(HtmlTag htmlTag) {
		throw new UnsupportedOperationException("Current operation is not support - for this object");
	}

	public List<HtmlTag> getChildren() {
		throw new UnsupportedOperationException("Current operation is not support - for this object");
	}
	public abstract void generateHtml();
}
