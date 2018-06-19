package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exercise1.CharacterCheck;

class CharacterCheckTest {
	
	@Test
	public void validateInput() {
		boolean actual = CharacterCheck.validateInput("a");
		assertTrue(actual);
	}
	
	@Test
	public void checkCapital() {
		String expected = "Capital Letter";
		String actual = CharacterCheck.checkCharacter("A");
		assertEquals(expected,actual);
	}

	@Test
	public void checkLower() {
		String expected = "Small Case Letter";
		String actual = CharacterCheck.checkCharacter("a");
		assertEquals(expected,actual);
	}
	
	@Test
	public void checkDigit() {
		String expected = "Digit";
		String actual = CharacterCheck.checkCharacter("1");
		assertEquals(expected,actual);
	}
	
	@Test
	public void checkSpecialChar() {
		String expected = "Special Character";
		String actual = CharacterCheck.checkCharacter("@");
		assertEquals(expected,actual);
	}
 }
