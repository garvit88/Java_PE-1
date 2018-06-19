package Exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class SortNumber {
	public ArrayList<Integer> sortNumber(int a) {
	      ArrayList <Integer> arr = new ArrayList<Integer>();        
	       while(a > 0) {
	           int r = a % 10;
	           a = a / 10;
	           arr.add(r);
	       }
	       Collections.sort(arr, Collections.reverseOrder());
	       return arr;
	  }
	   
	   public boolean sumOfEven(int a) {
	       int sum = 0;
	       while(a > 0) {
	           int r = a % 10;
	           a= a/10;
	           sum += r % 2 == 0? r : 0;
	       }
	       if(sum > 15) {
	    	   return true;
	       }
	       else {
	    	   return false;
	       }
	       
	   }
}
