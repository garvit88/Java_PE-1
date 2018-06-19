package Exercise1;

public class VowelOrConsonant {
	
	public String check(String str) {
		String res = "";
		int len = str.length();
		for(int i = 0; i < len; i++) {
			if(!Character.isLetter(str.charAt(i))) {
				res = "Invalid input";
				break;
			}
			else {
				char ch = str.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					res += ch + " - vowel ";
				}
				else {
					res += ch + " - consonant ";
				}
			}
		}
		return res;
	}
}
