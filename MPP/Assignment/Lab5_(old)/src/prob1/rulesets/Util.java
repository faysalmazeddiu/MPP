package prob1.rulesets;

import java.util.regex.Pattern;

public class Util {
	//implemented
	public static boolean checkLength10or13(String string) {
		return string.length() == 10 || string.length() == 13;
	}

	public static boolean checkIsbnStartsWithValidation(String string) {
		boolean isValid = false;
		if (string.length() == 10) {
			if (string.startsWith("0") || string.startsWith("1")) {
				isValid = true;
			}
		} else if (string.length() == 13) {
			if (string.startsWith("978") || string.startsWith("979")) {
				isValid = true;
			}
		}
		return isValid;

	}
	
	public static boolean checkPriceValidty(String string) {
		String regularEx = "^[-+]?[0-9]*\\.\\d\\d$";
	    return Pattern.matches(regularEx, string);

	}
}
