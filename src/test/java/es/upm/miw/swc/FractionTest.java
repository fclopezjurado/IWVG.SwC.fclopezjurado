/**
 * 
 */
package es.upm.miw.swc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author franlopez
 *
 */
public class FractionTest {
	private Fraction fraction;

	@Before
	public void before() {
	    fraction = new Fraction(7, 9);
	}
	
	@Test
	public void testFractionIntInt() {
	    assertEquals(7, fraction.getNumerator());
	    assertEquals(9, fraction.getDenominator());
	}
	
	@Test
	public void testFraction() {
	    fraction = new Fraction();
	    assertEquals(1, fraction.getNumerator());
	    assertEquals(1, fraction.getDenominator());
	}
	
	@Test
	public void testGetNumerator() {
	    assertEquals(7, fraction.getNumerator());
	}
	
	@Test
	public void testGetDenominator() {
	    assertEquals(9, fraction.getDenominator());
	}
	
	@Test
	public void testDecimal() {
	    assertEquals((double)7/9, fraction.decimal(), 0.0001);
	}
	
	@Test
	public void testDiv() {
		this.fraction.div(new Fraction(3, 5));
	    assertEquals((double)7/9, this.fraction.decimal(), 0.0001);
	}

}
