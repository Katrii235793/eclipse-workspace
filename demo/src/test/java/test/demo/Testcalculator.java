package test.demo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import junit.framework.TestCase;

public class Testcalculator {

	Calculator c=new Calculator();
	@Test
	public void testAdd()
	{
		assertEquals(11,c.add(6,4));
		
	}

}
