package simpleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void testAdd() {
		calculator calc = new calculator();
		calc.add(10,20);
		assertEquals(30,calc.getResult());
	}

}
