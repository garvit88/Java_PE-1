package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.NthIteration;
import Exercise1.TomAndJerry;
// validate input
// check output
class NthIterationTest {

	@Test
	public void validateInput() {
		NthIteration ni = new NthIteration();
		String expected = "Invalid input";
		String actual = ni.generateString("abc");
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkOutput() {
		NthIteration ni = new NthIteration();
		String expected = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";
		String actual = ni.generateString("5");
		assertEquals(expected, actual);
	}

}
