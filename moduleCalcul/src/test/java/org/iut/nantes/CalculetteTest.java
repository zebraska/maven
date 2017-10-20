package org.iut.nantes;

import junit.framework.TestCase;

public class CalculetteTest extends TestCase{
	public void testAddition(){
		Calculette c = new Calculette();
        
		assertEquals("3 + 2 doit faire 5",c.additionDouble(3, 2),5.0);
	}
}
