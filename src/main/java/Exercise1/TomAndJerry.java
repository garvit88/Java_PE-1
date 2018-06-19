package Exercise1;

public class TomAndJerry {
	public String check(String input) {
		String res = "";
		try {
			int no = Integer.parseInt(input);
			if(!(no % 2 == 0) && (no > 20) && (no < 30)) {
				res = "Tom";
			}
			else if((no % 2 == 0) && (no > 20) && (no < 30)) {
				res = "Jerry";
			}
			else {
				res = "no is not in a range";
			}
		}
		catch(NumberFormatException e) {
			res =  "Invalid input";
		}
		return res;
	}
}
