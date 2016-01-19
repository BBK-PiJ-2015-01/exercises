package session3;

public class EagerSingleton {

	final static private EagerSingleton instance;

	static {
		instance = new EagerSingleton();
	}

	private EagerSingleton() {
		// Do nothing
	}

	public static EagerSingleton getInstance() {
		return instance;
	}
}
