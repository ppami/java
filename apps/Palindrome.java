package pl.codeme.javase.hackathon1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		char[] word = (user.nextLine()).toCharArray();
		user.close();
		
		String reversedWord = "";
		
		for (int i = word.length - 1; i >= 0; i--) {
			reversedWord += word[i];
		}

		System.out.println(reversedWord);
	}

}
