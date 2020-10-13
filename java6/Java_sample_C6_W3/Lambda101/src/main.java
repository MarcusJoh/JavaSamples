public class main {

	public static void main(String[] args) {

		aString a = (str) -> "String goes here " + str + "!";

		System.out.println(a.computeString("marcus"));

		
		//Block Lambda Expressions
		aString reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};
		// end
		
		
		System.out.println(reverse.computeString("Lambda")); 

	}

	interface aString {
		String computeString(String str);
	}

	
}
