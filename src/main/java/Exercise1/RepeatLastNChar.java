package Exercise1;

public class RepeatLastNChar {
	public String repeat(String str, String input) {
		String res = "";
		try {
			int n = Integer.parseInt(input);
			int len = str.length();
			if(n > len) {
				res = "No input is greater than string length";
			}
			else {
				int index = len - n;
				String s = "";
				for(int i = index; i < len; i++) {
					s += str.charAt(i);
				}
				res = str;
				for(int i = 0; i < n; i++) {
					res += s; 
				}
			}
		}
		catch(Exception e) {
			res = "Invalid input";
		}
		return res;
	}
}
