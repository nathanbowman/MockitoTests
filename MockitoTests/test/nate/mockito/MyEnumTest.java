/**
 * 
 */
package nate.mockito;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * @author nate_
 *
 */
public class MyEnumTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link nate.mockito.MyEnum#getObject()}.
	 */
	@Test
	public final void testGetObject() {

		MyEnum enumMock = org.mockito.Mockito.mock(MyEnum.class);
		when(enumMock.getObject()).thenReturn(new String("Success"));

		assertNotEquals(null, enumMock.getObject());
		assertEquals("Success", (String)enumMock.getObject());
	}

}
