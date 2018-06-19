package Exercise1;

public class NthIteration {
	public String generateString(String input) {
		String res = "";
		try {
			int no = Integer.parseInt(input);
			for(int i = 1; i <= no; i++) {
				for(int j = 0; j < i; j++) {
					res += i + " ";
				}
			}
		}
		catch(NumberFormatException e) {
			res =  "Invalid input";
		}
		return res;
	}
}
