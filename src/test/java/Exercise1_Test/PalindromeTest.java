package Exercise1_Test;

import Exercise1.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	Palindrome p = new Palindrome();
	
	@Test
	public void validateInput() {
		String str = "aba";
		String expected = "Invalid input";
		String actual = p.checkPalindrome(str);
		assertEquals(expected, actual);
	}
	
	@Test
	public void isPalindrome() {
		String str = "2468642";
		String expected = str + " is palindrome";
		String actual = p.checkPalindrome(str);
		assertEquals(expected, actual);
	}
	
	@Test
	public void notPalindrome() {
		String str = "246864";
		String expected = str + " is not a palindrome";
		String actual = p.checkPalindrome(str);
		assertEquals(expected, actual);
	}
	
	@Test
	public void validateOddSum() {
		String str = "13531";
		String expected = str + " is palindrome and sum of even numbers is less than 25";
		String actual = p.checkSum(str);
		assertEquals(expected, actual);
	}
	
	@Test
	public void validateSum() {
		String n = "2468642";
		String expected = n + " is palindrome and the sum of even numbers is greater than 25";
		String actual = p.checkSum(n);
		assertEquals(expected, actual);
	}

}
