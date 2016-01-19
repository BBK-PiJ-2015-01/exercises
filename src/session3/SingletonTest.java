package session3;

import static org.junit.Assert.*;

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
}
