package session3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

public class SingletonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void eagerSingletonSimple() {

		EagerSingleton instance = EagerSingleton.getInstance();
		assertNotNull(instance);
	}

	@Test
	public void eagerSingletonImmutableStatic() {

		EagerSingleton instance = EagerSingleton.getInstance();
		EagerSingleton instance2 = EagerSingleton.getInstance();
		assertEquals(instance, instance2);
	}

	@Test
	public void eagerSingletonImmutableInstance() {

		EagerSingleton instance = EagerSingleton.getInstance();
		@SuppressWarnings("static-access")
		EagerSingleton instance2 = instance.getInstance();
		assertEquals(instance, instance2);
	}

	@Test(expected = CloneNotSupportedException.class)
	public void singletonProtectedCloneable() throws CloneNotSupportedException {

		SingletonProtected instance = SingletonProtected.getInstance();
		@SuppressWarnings("unused")
		Object instance2 = instance.clone();
	}

	@Test
	public void singletonProtectedSerializable() throws IOException, ClassNotFoundException {

		SingletonProtected instance = SingletonProtected.getInstance();
		// Stream it out
		ByteArrayOutputStream storage = new ByteArrayOutputStream();
		ObjectOutputStream outStream = new ObjectOutputStream(storage);
		outStream.writeObject(instance);

		// Stream it in
		InputStream input = new ByteArrayInputStream(storage.toByteArray());
		ObjectInputStream inStream = new ObjectInputStream(input);	
		SingletonProtected instance2 = (SingletonProtected) inStream.readObject();
		assertEquals(instance, instance2);
	}
}
