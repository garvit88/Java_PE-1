package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.TomAndJerry;
import Exercise1.UnspecifiedNoIntegers;

class UnspecifiedNoIntegersTest {
	// no string input
	// verify output
	
	@Test
	public void validateInput() {
		UnspecifiedNoIntegers ui = new UnspecifiedNoIntegers();
		String expected = "Invalid input";
		String actual = ui.summation("a b c");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkOutput() {
		UnspecifiedNoIntegers ui = new UnspecifiedNoIntegers();
		String expected = "41";
		String actual = ui.summation("12 23 2 4");
		assertEquals(expected, actual);
	}

}
