package week1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilityTest {

	@Test
	public void test() {

		// Endast om du behöver anropa objekt-metoder
		// ReverseString obj = new ReverseString();
		StringBuilder checkReversed = StringUtility.reverseString("Erfan");

		assertEquals("nafrE", checkReversed.toString());
		assertEquals(5, checkReversed.length());
		assertEquals("like", StringUtility.getSubString("Ilikeyou", 1, 5));
	}
	
	

}
