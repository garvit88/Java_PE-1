package Exercise1;

public class TargetNumber {
	public String targetNo(String input) {
		String res = "";
		try {
			int no = Integer.parseInt(input);
			if(no > 50) {
				res = "Number guessed is greater than original no";
			}
			else if(no < 50) {
				res = "Number guessed is less than original no";
			}
			else if(no == 50) {
				res = "Number guessed matches the original number";
			}
		}
		catch(NumberFormatException e) {
			res = "Invalid input";
		}
		return res;
	}
}
