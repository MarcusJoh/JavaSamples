package week3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

	private static Car car1;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
		car1 = new Car();
		car1.setBrand("Volvo");
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	@ParameterizedTest
	@ValueSource(strings = {"Volvo", "Toyota", "Audi"})
	void onlyParamAnnotation(String arg) {
		
		assertTrue(arg.length() > 3);
	
	}

	

}
