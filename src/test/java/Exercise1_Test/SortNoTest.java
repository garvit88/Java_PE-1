package Exercise1_Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Exercise1.SortNumber;

class SortNoTest {

	 @Test
	   public void testsortNumber() {
		   SortNumber s = new SortNumber();
	       ArrayList <Integer> actual = new ArrayList<Integer>();  
	       actual = s.sortNumber(123);
	       ArrayList <Integer> expected = new ArrayList<Integer>();
           expected.add(3);
           expected.add(2);
           expected.add(1);
	       assertEquals(expected, actual);        
	   }
	   
	   @Test
	   public void testsumOfEven() {
		   SortNumber s = new SortNumber();
	       boolean actual = s.sumOfEven(234534);
	       boolean expected = false;
	       assertEquals(expected,actual);
	   }

}
