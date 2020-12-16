package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class Eachtests {

	private userLog.UserTests user;

	@BeforeEach
	void addUser() {
		System.out.println("@BeforeEach executed");

		user = new userLog.UserTests();

	}

	@AfterEach
	void removeUser() {
		System.out.println("@AfterEach executed");
		user.clear();
	}

	@DisplayName("First name test")
	@Order(1)
	@Test
	void testFirstname() {
		System.out.println("======testFirstname=======");
		user.setfName("Jane");
		Assertions.assertTrue(user.checkfName());
	}

	@DisplayName("Last name test")
	@Order(2)
	@Test
	void testLastname() {
		System.out.println("======testLastname=======");
		user.setlName("Doe");
		Assertions.assertTrue(user.checklName());
	}

	@DisplayName("Id test")
	@Order(2)
	@Test
	void testFistname() {
		System.out.println("======testId=======");
		user.setId(1);
		Assertions.assertTrue(user.checkId());
	}

}
