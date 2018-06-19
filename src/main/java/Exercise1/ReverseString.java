package Exercise1;

public class ReverseString {
	public String reverse(String str) {
		String res = "";
		try {
			int len = str.length();
			for(int i = len - 1; i != -1; i--) {
				res += str.charAt(i);
			}
		}
		catch(Exception e) {
			res = "Invalid input";
		}
		return res;
	}
}
