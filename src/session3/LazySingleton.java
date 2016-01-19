package session3;

public class LazySingleton {

	static private LazySingleton instance;


	private LazySingleton() {
		// Do nothing as yet
	}

	public static synchronized LazySingleton getInstance() {

		if (instance == null) {
			instance = instance();
		}
		return instance;
	}

	private static synchronized LazySingleton instance() {
		return new LazySingleton();
	}
}
