package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import userLog.UserTests;

class TestInMock {
	// or this over MockitoAnnotations.initMocks(this);
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	// A Mock "object" shell
	@Mock
	UserTests user = new UserTests();

	@BeforeEach
	void addUser() {

		System.out.println("@BeforeEach executed");

		// Use this if none of the two about works..
		MockitoAnnotations.initMocks(this);

	}

	@DisplayName("Id test")
	@Test
	void testFistname() {
		System.out.println("======testId=======");

		// mock what will return
		Mockito.when(user.checkId()).thenReturn(true);

		Assertions.assertTrue(user.checkId());

	}

	// Spy vs Mock
	@DisplayName("mock test")
	@Test
	public void Mock_test() {
		ArrayList<String> aList = Mockito.mock(ArrayList.class);

		aList.add("one");
		Mockito.verify(aList).add("one");

		assertEquals(0, aList.size());
	}
	@DisplayName("Spy test")
	@Test
	public void Spy_test() {
		ArrayList<String> aList = Mockito.spy(new ArrayList<String>());

		aList.add("one");
		Mockito.verify(aList).add("one");

		assertEquals(1, aList.size());
	}

}
