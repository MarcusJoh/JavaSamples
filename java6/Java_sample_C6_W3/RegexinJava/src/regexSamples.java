import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexSamples {

	public static void main(String args[]) {

		String content = "There is some stuff in here";

		// .* ignores whatever is before or after it
		String pattern = ".*stuff.*";
		boolean match = Pattern.matches(pattern, content);
		System.out.println(match);

		// [if chars is in the content]
		pattern = ".*[abc].*";
		match = Pattern.matches(pattern, content);
		System.out.println(match);

		// [if any lowercase (a-z)or uppercase (A-Z)]
		pattern = ".*[a-zA-Z].*";
		match = Pattern.matches(pattern, content);
		System.out.println(match);

		
		//  must contain at least 1 numeric character
		pattern = ".*(?=.*[0-9]).*";
		match = Pattern.matches(pattern, content);
		System.out.println(match);

		
		
		
		
		
		
		
		
		// remove () from string
		content = "Hello (Java)";
		Matcher m = Pattern.compile("\\((.*?)\\)").matcher(content);
		while (m.find()) {
			System.out.println(m.group(1));
		}

		// remove () from string

		content = "Quotation \"marks\" ";
		Pattern p = Pattern.compile("\"([^\"]*)\"");
		m = p.matcher(content);
		while (m.find()) {
			System.out.println(m.group(1));
		}
	}

}
