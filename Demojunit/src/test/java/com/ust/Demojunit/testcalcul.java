package com.ust.Demojunit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.framework.TestCase;

public class testcalcul {
	calculato c=new calculato();
	@Test
	public void testAdd()
	{
		assertEquals(10,c.add(6,4));
		
	}

}
