package tests;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import logic.Alalfabet;

@TestMethodOrder(OrderAnnotation.class)
class CicleOfLife {

	private static ArrayList<Character> ListofSomething = new ArrayList<Character>();

	@BeforeAll
	static void setUpList() {
		System.out.println("@BeforeAll executed");
		// array to arraylist..
		for (int i = 0; i < logic.Alalfabet.ALPHABET.length; i++) {
			ListofSomething.add(Alalfabet.ALPHABET[i]);

		}

	}

	@AfterAll
	static void clearList() {

		System.out.println("@AfterAll executed");
		ListofSomething.clear();

	}

	@DisplayName("ArrayList")
	@Order(1)
	@Test
	void testAlalfabet_ArrayList() {
		System.out.println("======testAlalfabet_toArrayList=======");

		Assertions.assertIterableEquals(ListofSomething, Alalfabet.toArrayList(), " Into list?");
	}

	@DisplayName("toHashSet fail")
	@Order(2)
	@Test
	void testAlalfabet_toHashSetfails() {
		System.out.println("======testAlalfabet_toHashSet=======");
		Assertions.assertEquals(ListofSomething, Alalfabet.toHashSet());
		// content is the same but not the collection

	}

	@DisplayName("toHashSet")
	@Order(3)
	@Test
	void testAlalfabet_toHashSet() {
		System.out.println("======testAlalfabet_toHashSet=======");
		Assertions.assertIterableEquals(ListofSomething, Alalfabet.toHashSet());

	}

}
