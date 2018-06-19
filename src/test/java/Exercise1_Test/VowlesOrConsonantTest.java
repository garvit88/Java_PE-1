package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.TomAndJerry;
import Exercise1.VowelOrConsonant;

class VowlesOrConsonantTest {
// input is not a letter
// input is vowel
// input is consonant
	
	@Test
	public void validateInput() {
		VowelOrConsonant vc = new VowelOrConsonant();
		String expected = "Invalid input";
		String actual = vc.check("ab3b");
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkOutput() {
		VowelOrConsonant vc = new VowelOrConsonant();
		String expected = "a - vowel b - consonant ";
		String actual = vc.check("ab");
		assertEquals(expected, actual);
	}
}
