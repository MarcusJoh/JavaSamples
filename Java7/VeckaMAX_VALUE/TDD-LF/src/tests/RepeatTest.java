package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import logic.Alalfabet;

class RepeatTest {

	@Disabled
	@Test
	void testAlalfabet_checkChar() {
		System.out.println("======testAlalfabet_checkChar=======");
		Assertions.assertEquals('A', Alalfabet.checkChar('A'));
	}

	// Repeat tests
	@Disabled
	@DisplayName("Test same letter X times")
	@RepeatedTest(5)
	void testAlalfabet_checkChar(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals('A', Alalfabet.checkChar('A'), "A not A");
	}

	@Disabled
	@DisplayName("how random is random")
	@RepeatedTest(100)
	void testAlalfabet_ranLetter(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals('A', Alalfabet.ranLetter(), "A did happen A?");
	}
	// will run all

	// Stup
	@DisplayName("next Char")
	@Test
	void testAlalfabet_NextChar() {
		System.out.println("======testAlalfabet_NextChar=======");

		Assertions.assertEquals('B', Alalfabet.NextChar('A'), " After A is B");
	}

	@DisplayName("ALL chars ")
	@ParameterizedTest
	@ValueSource(chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' }) // Alalfabet
	void testAlalfabet_TestAllChar(char letter) {
		System.out.println("======testAlalfabet_NextChar=======");
		char toTest = (char) (letter + 1);
		Assertions.assertEquals(toTest, Alalfabet.NextChar(letter));

	}

	@DisplayName("after Last?")
	@Test
	void testAlalfabet_afterLast() {
		System.out.println("======testAlalfabet_NextChar=======");

		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			Assertions.assertEquals('Z', Alalfabet.NextChar('Z'), " After Z is ?");
		});
	}

}
