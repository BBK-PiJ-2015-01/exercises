package session2;

import dagger.ObjectGraph;

public class HelloWorldWithDagger {

	public static void main(String[] args) {

		ObjectGraph objectGraph = ObjectGraph.create(new HelloWorldDaggerModule());
		MessageRenderer mr = objectGraph.get(MessageRenderer.class);
		mr.render();
	}
}
