package pkgMyInteger;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgMain.MyInteger;

public class MyIntegerTest {
	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	private static MyInteger myIntPrime;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven() {
		MyInteger myIntEven = new MyInteger(2);
		MyInteger myIntOdd = new MyInteger(3);
		MyInteger myIntPrime = new MyInteger (5);
		
		assertTrue(myIntEven.isEven() == true);
		assertFalse(myIntOdd.isEven() == true);
		int x = 0;
		assertTrue(myIntPrime.isPrimee(x) == true);

	}

}
