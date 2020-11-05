package week1;

public class StringUtility {

	public static StringBuilder reverseString(String arg) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(arg);
		StringBuilder theReversed = strBuilder.reverse();
		System.out.println(theReversed);
		return theReversed;
	}

	public static String makeStringLowerCase(String arg) {
		String lowerCased = arg.toLowerCase();
		return lowerCased;
	}

	public static String makeStringUpperCase(String arg) {
		String upperCased = arg.toUpperCase();
		return upperCased;
	}

	public static int getLengthOfString(String arg) {
		int theLength = arg.length();
		return theLength;
	}

	public static String getSubString(String arg, int start, int end) {

		String subStringed = arg.substring(start, end);
		System.out.println(subStringed);
		return subStringed;
	}

	public static void main(String[] args) {

		// StringUtility.getSubString("Erfan", 1, 3);
	}
}
