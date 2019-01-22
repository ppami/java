package armstrongnums;

public class ArmstrongNumbers {
	public boolean checkIfArmstrongNumber(int number) {
		
		boolean checker;
		int finalNumber = countNumber(number);
		
		if (number == finalNumber) {
			checker = true;
		} else {
			checker = false;
		}
		
		return checker;
		
	}

	private int countNumber(int number) {
		char numberChar[] = String.valueOf(number).toCharArray();
		int cube = numberChar.length;
		int finalNumber = 0;

		for (int i = 0; i < cube; i++) {

			finalNumber = finalNumber + (int)Math.pow(Character.getNumericValue(numberChar[i]), cube);

		}
		return finalNumber;
	}
}
