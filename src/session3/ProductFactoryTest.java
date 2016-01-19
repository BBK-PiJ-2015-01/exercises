package session3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ProductFactoryTest {
	
	private Creator instance;

	@Before
	public void setUp() throws Exception {
		
		instance = new ConcreteCreator();
	}

	@Test
	public void defaultProductCreation() {
		
		Product result = instance.getProductInstance();
		assertNotNull(result);
		assertEquals(result.getClass(), ConcreteProduct.class);
	}
}
