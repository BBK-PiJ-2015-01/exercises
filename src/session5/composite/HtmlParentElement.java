package session5.composite;

import java.util.LinkedList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
	
	private final List<HtmlTag> children;
//	private String tagBody;
	
	public HtmlParentElement(String tagName) {
		this.tagName = tagName;
		children = new LinkedList<>();
	}
	
//	public void setTagBody(String tagBody) {
//		this.tagBody = tagBody;
//	}
	
	public void addChildTag(HtmlTag htmlTag) {
		children.add(htmlTag);
	}

	public void removeChildTag(HtmlTag htmlTag) {
		children.remove(htmlTag);
	}

	public List<HtmlTag> getChildren() {
		return children;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
//		System.out.println(tagBody);
		children.stream().forEach(h -> h.generateHtml());
		System.out.println(endTag);
	}
}
