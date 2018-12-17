package hackathon2;

public class HexToDecimal {

	public static void main(String[] args) {
		
		//the number 16 refers to base 16 that is a number sistem (hexadecimal)
		//where each digit represents one of 16 values 
		//(0-9 and A-F give 16 possibilities)
		//representing the values 0-15
		
		String hex = "F";
		//converts hex to decimal
		//Integer.toHexString() - converts decimal to hex
		int decimal = Integer.parseInt(hex, 16);
		System.out.println(decimal);

	}

}
