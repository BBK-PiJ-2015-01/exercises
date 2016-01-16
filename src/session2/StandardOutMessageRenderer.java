package session2;

import javax.inject.Inject;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider = null;

	public void render() {
		
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class:" + StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}
	
	@Inject
	public void setMessageProvider(MessageProvider provider) {
		
		this.messageProvider = provider;
	}

	public MessageProvider getMessageProvider() {
		
		return this.messageProvider;
	}
}
