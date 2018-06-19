package Exercise1;

public class Palindrome {
	
	public String checkPalindrome(String str) {
		String res = "";
		try {
			int rev = 0;
			int no = Integer.parseInt(str);
			while(no != 0) {
				rev = rev * 10;
				rev = rev + no % 10;
				no /= 10;
			}
			res = String.valueOf(rev);
			if(res.equals(str)) {
				res = str + " is palindrome";
			}
			else {
				res =  str + " is not a palindrome";
			}
		}
		catch(NumberFormatException e) {
			res =  "Invalid input";
		}
		return res;
	}
	
	public String checkSum(String str) {
		String res = "";
		int temp = 0;
		int r;
		int sum = 0;
		try {
			int rev = 0;
			int no = Integer.parseInt(str);
			temp = no;
			while(no != 0) {
				rev = rev * 10;
				rev = rev + no % 10;
				no /= 10;
			}
			
			res = String.valueOf(rev);
			while(temp != 0) {   
               r = temp % 10;
               if(r % 2 == 0) {
                   sum += r;
               }
               temp = temp / 10;  
			}
			
			if(res.equals(str) && sum > 25) {
				res = str + " is palindrome and the sum of even numbers is greater than 25";
			}
			else if(res.equals(str) && sum < 25) {
				res =  str + " is palindrome and sum of even numbers is less than 25";
			}
			else {
				res = str + " is not palindrome";
			}
		}
		catch(NumberFormatException e) {
			res =  "Invalid input";
		}

		return res;
	}
	
}

