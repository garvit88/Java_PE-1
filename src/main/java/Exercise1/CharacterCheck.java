package Exercise1;

public class CharacterCheck {
	
	public static boolean validateInput(String ch) {
		int len = ch.length();
		if(len == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String checkCharacter(String str) {
		String rt = null;
		if((validateInput(str))) {
			char ch = str.charAt(0);
			if(Character.isUpperCase(ch)) {
				rt = "Capital Letter";
			}
			else if(Character.isLowerCase(ch)) {
				rt = "Small Case Letter";
			}
			else if(Character.isDigit(ch)) {
				rt = "Digit";
			}
			else {
				rt = "Special Character";
			}
		}
		return rt;
	}
	
}
