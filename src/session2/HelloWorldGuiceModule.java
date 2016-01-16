package session2;

import com.google.inject.AbstractModule;

public class HelloWorldGuiceModule extends AbstractModule{

	@Override
	protected void configure() {
		
		bind(MessageProvider.class).to(HelloWorldMessageProvider.class);
		
		bind(MessageRenderer.class).to(StandardOutMessageRenderer.class);	
	}
}
