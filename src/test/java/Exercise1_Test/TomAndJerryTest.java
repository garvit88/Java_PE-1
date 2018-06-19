package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.TomAndJerry;

class TomAndJerryTest {
// Given a string as input
// no is not between 20 and 30
// print tom if odd and b/w 20 and 30
// print jerry if even and  b/w 20 and 30
	
	@Test
	public void validateInput() {
		TomAndJerry tj = new TomAndJerry();
		String expected = "Invalid input";
		String actual = tj.check("a");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkNoRange() {
		TomAndJerry tj = new TomAndJerry();
		String expected = "no is not in a range";
		String actual = tj.check("50");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkTom() {
		TomAndJerry tj = new TomAndJerry();
		String expected = "Tom";
		String actual = tj.check("25");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkJerry() {
		TomAndJerry tj = new TomAndJerry();
		String expected = "Jerry";
		String actual = tj.check("28");
		assertEquals(expected, actual);
	}
}
