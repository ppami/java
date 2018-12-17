package games;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) throws Exception {
		
		Scanner reader = new Scanner(System.in);
		
		String[] dictWords = readFile();				
		char[] randomWord = generateRandomWord(dictWords);
		
		int misses = 0;
		String allGuesses = " ";
		
		char[] guesses = new char[randomWord.length];
		for (int f = 0; f < guesses.length; f++) {
			guesses[f] = '-';
		}
		
		printGuesses(guesses);
		
		while (String.valueOf(randomWord).equals(String.valueOf(guesses)) == false) {
			char guess = getLetterFromUser(reader);
			
			misses = checkGuess(randomWord, misses, guesses, guess);
			
			allGuesses = allGuesses + guess + " ";
			printGuesses(guesses);
			printStatistics(misses, allGuesses);
			
		}
		
		System.out.println("Congratz! The word was: " + String.valueOf(randomWord));
		printStatistics(misses, allGuesses);
		reader.close();
		
	}

	private static int checkGuess(char[] randomWord, int misses, char[] guesses, char guess) {
		String missed = "yes";
		
		for (int i = 0; i < randomWord.length; i++) {
			if (guess == randomWord[i]) {
				missed = "no";
				guesses[i] = guess;
			} 
		}
		
		if (missed == "yes") {
			misses++;
		}
		return misses;
	}

	private static char getLetterFromUser(Scanner reader) {
		System.out.print("Your guess (one letter): ");
		char guess = reader.next().charAt(0);
		System.out.println();
		return guess;
	}

	private static String[] readFile() throws IOException {
		Path filePath = new File("words.txt").toPath();
		List<String> dictList = Files.readAllLines(filePath);
		String[] dictWords = dictList.toArray(new String[]{});
		return dictWords;
	}

	private static char[] generateRandomWord(String[] dictWords) {
		Random rand = new Random();
		char[] randomWord = (dictWords[(int)rand.nextInt(dictWords.length)]).toCharArray();
		return randomWord;
	}

	private static void printStatistics(int misses, String allGuesses) {
		System.out.println();
		System.out.println("Misses: " + misses);
		System.out.println("Guessed letters:" + allGuesses);
		System.out.println("======================");
	}

	private static void printGuesses(char[] list) {
		System.out.print("Word: ");
		for (int f = 0; f < list.length; f++) {
			System.out.print(list[f]);
		}
		System.out.println();
	}

}
