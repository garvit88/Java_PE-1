package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.ReverseString;
import Exercise1.TomAndJerry;

class ReverseStringTest {
	// verify output
	
	@Test
	public void reverseString() {
		ReverseString rs = new ReverseString();
		String expected = "london";
		String actual = rs.reverse("nodnol");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkNull() {
		ReverseString rs = new ReverseString();
		String expected = "Invalid input";
		String actual = rs.reverse(null);
		assertEquals(expected, actual);
	}

}
