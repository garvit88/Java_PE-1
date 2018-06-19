package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.TargetNumber;
import Exercise1.TomAndJerry;

class TargetNumberTest {
	// input should be no always
	// no is guessed more than original no
	// no is guessed ledd tham original no
	// no is identified
	
	@Test
	public void validateInput() {
		TargetNumber tn = new TargetNumber();
		String expected = "Invalid input";
		String actual = tn.targetNo("abc");
		assertEquals(expected, actual);
	}
	
	@Test
	public void noLessThanOriginalNo() {
		TargetNumber tn = new TargetNumber();
		String expected = "Number guessed is greater than original no";
		String actual = tn.targetNo("75");
		assertEquals(expected, actual);
	}
	
	@Test
	public void noMoreThanOriginalNo() {
		TargetNumber tn = new TargetNumber();
		String expected = "Number guessed is less than original no";
		String actual = tn.targetNo("30");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkOutput() {
		TargetNumber tn = new TargetNumber();
		String expected = "Number guessed matches the original number";
		String actual = tn.targetNo("50");
		assertEquals(expected, actual);
	}

}
