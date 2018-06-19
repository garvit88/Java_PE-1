package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.RepeatLastNChar;
import Exercise1.TomAndJerry;

class RepeatLastNCharTest {
	// length of int should not be greater than string
	// string should not be null
	// verify output
	// second param should always be number
	
	@Test
	public void intNotGreaterThanString() {
		RepeatLastNChar rc = new RepeatLastNChar();
		String expected = "No input is greater than string length";
		String actual = rc.repeat("abc","5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void stringIsNull() {
		RepeatLastNChar rc = new RepeatLastNChar();
		String expected = "Invalid input";
		String actual = rc.repeat(null,"5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void validateInput() {
		RepeatLastNChar rc = new RepeatLastNChar();
		String expected = "Invalid input";
		String actual = rc.repeat("abc","abc");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkOutput() {
		RepeatLastNChar rc = new RepeatLastNChar();
		String expected = "Stackrouterouterouterouterouteroute";
		String actual = rc.repeat("Stackroute","5");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkOutput1() {
		RepeatLastNChar rc = new RepeatLastNChar();
		String expected = "Stackroutetete";
		String actual = rc.repeat("Stackroute","2");
		assertEquals(expected, actual);
	}

}
