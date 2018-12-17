package pl.codeme.javase.hackathon1;

import java.util.Scanner;

public class CeasarEncryption {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		char[] toBeCoded = user.nextLine().toCharArray();
		user.close();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
		char aLetter = ' ';
		for (int i = 0; i < toBeCoded.length; i++) {
			aLetter = toBeCoded[i];
			toBeCoded[i] = moveLetter(alphabet, aLetter);
		}
		System.out.println(String.valueOf(toBeCoded));

	}

	private static char moveLetter(char[] alphabet, char aLetter) {
		char newLetter = ' ';
		for (int i = 0; i < alphabet.length; i++) {
			if (aLetter == alphabet[i]) {
				newLetter = alphabet[i + 3];
			}
		}
		return newLetter;
	}

}
