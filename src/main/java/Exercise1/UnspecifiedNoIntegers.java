package Exercise1;

public class UnspecifiedNoIntegers {
	public String summation(String str) {
		String a[] = str.split(" ");
		String res = "";
		int total = 0;
		try {
			for(String i : a) {
					total += Integer.parseInt(i);
			}
			res = String.valueOf(total);
		}
		catch(NumberFormatException e) {
			res = "Invalid input";
		}
		return res;
	}
}
