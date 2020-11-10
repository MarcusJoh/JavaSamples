package week2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

	private String carColorBlue = "Blue";
	private String carColorOrange = "Orange";

	@Test
	@DisplayName("Asserting same 1")
	public void getBrandTest1() {
		Car carObj1 = new Car();
		carObj1.setColor("Green");

		// assertEquals(this.carColorBlue, carObj1.getColor());

	}

	@Test
	@DisplayName("Asserting same 2")
	public void getBrandTest2() {
		Car carObj1 = new Car();
		carObj1.setColor("Green");

		// assertEquals(this.carColorBlue, carObj1.getColor());
		// assertFalse(1 < 2);
	}

}
