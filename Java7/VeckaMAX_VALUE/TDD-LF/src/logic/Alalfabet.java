package logic;

import java.util.Random;

public class Alalfabet {

	public final static char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static char checkChar(char c) {
		return c;

	}

	public static char ranLetter() {

		Random rand = new Random();
		int ranNumber = rand.nextInt(ALPHABET.length);
		char letter = ALPHABET[ranNumber];

		return letter;

	}

	// Stub, it will fail the test
	public static char NextChar(char c) {

		return c;
	}

//	public static char NextChar(char c) {
//		char nextChar = ' ';
//		for (int i = 0; i < ALPHABET.length; i++) {
//			if (c == ALPHABET[i]) {
//				  System.out.println(ALPHABET[i + 1]);
//				nextChar = ALPHABET[i + 1];
//			}
//
//		}
//
//		return nextChar;
//	}

	public static Iterable<?> toArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Iterable<?> toHashSet() {
		// TODO Auto-generated method stub
		return null;
	}

//	public static ArrayList<Character> toArrayList() {
//		ArrayList<Character> alphabetList = new ArrayList<Character>();
//
//		for (char letter : ALPHABET) {
//			alphabetList.add(letter);
//		}
//
//		return alphabetList;
//	}
//
//	public static HashSet<Character> toHashSet() {
//		HashSet<Character> alphabetList = new HashSet<Character>();
//
//		for (char letter : ALPHABET) {
//			alphabetList.add(letter);
//		}
//
//		return alphabetList;
//	}

}
