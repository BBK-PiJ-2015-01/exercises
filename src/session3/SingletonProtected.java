package session3;

import java.io.Serializable;

public class SingletonProtected implements Cloneable, Serializable {

	private static final long serialVersionUID = -370814771141840459L;

	static private SingletonProtected instance;
	
	private final String CANNOT_CLONE ="Cannot clone this object";
	
	private SingletonProtected() {
		// Do nothing as yet
	}

	public static synchronized SingletonProtected getInstance() {

		if (instance == null) {

			instance = instance();
		}
		return instance;
	}

	private static synchronized SingletonProtected instance() {
		return new SingletonProtected();
	}
	
	public Object clone() throws CloneNotSupportedException {

		throw new CloneNotSupportedException(CANNOT_CLONE);
	}
	
	private Object readResolve() {

	    return instance;
	  }
}
