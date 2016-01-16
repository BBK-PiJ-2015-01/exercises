package session2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class HelloWorldWithGuice {

	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new HelloWorldGuiceModule());
		
		MessageRenderer mr = injector.getInstance(MessageRenderer.class);
		
		mr.render();
	}
}
