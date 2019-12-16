package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
	
	@Test
	void testMultiplicationDollar() {
		Money five = Dollar.dollar(5);
		assertEquals(Dollar.dollar(10), five.times(2));
		assertEquals(Dollar.dollar(15), five.times(3));
	}
	
	@Test
	void testEqualityDollar() {
		assertEquals(Dollar.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(5), Money.dollar(6));
		assertNotEquals(Money.dollar(5), Money.franc(5));
	}
	
	@Test
	void testMultiplicationFranc() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}
	
	@Test
	void testEqualityFranc() {
		assertEquals(Money.franc(5), Money.franc(5));
		assertNotEquals(Money.franc(5), Money.franc(6));
		
	}
}
