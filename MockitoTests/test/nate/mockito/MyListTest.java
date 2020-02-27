package nate.mockito;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testInvocation() {
		List<String> mockedList = mock(MyList.class);
		mockedList.size();
		verify(mockedList).size();
	}
	
	@Test
	public final void testSize() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetInt() {
		fail("Not yet implemented"); // TODO
	}

}
