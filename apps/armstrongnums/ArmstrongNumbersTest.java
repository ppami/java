package armstrongnums;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArmstrongNumbersTest {

	@Test
	public void should_ReturnTrue_When_IsArmstrongNumber() {
		int number = 153;
		
		ArmstrongNumbers an = new ArmstrongNumbers();
		
		assertTrue(an.checkIfArmstrongNumber(number));
	}
	
	@Test
	public void should_ReturnFalse_When_IsNotArmstrongNumber() {
		int number = 100;
		
		ArmstrongNumbers an = new ArmstrongNumbers();
		
		assertFalse(an.checkIfArmstrongNumber(number));
	}
}
