package games;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EvilHangman {

	public static void main(String[] args) throws Exception {
		Scanner user = new Scanner(System.in);
		Random generator = new Random();
		
		String[] dictionary = readFile();
		
		int wordLength = getWordLength(user);
		
		List<String> evilDictionary = createEvilDictionary(dictionary, wordLength);
		List<String> wordList = new ArrayList<>();
		List<String> wordListSecond = new ArrayList<>();
		List<String> guessList = new ArrayList<>();
		Map<String, List<String>> newMap = new HashMap<>();
		
		int rounds = 1;
		StringBuilder guesses = new StringBuilder();
		String guessedWord = "";
		char[] guessWordPattern = generatePatternGuess(wordLength);
		
		while (rounds <= 10) {
			
			String userGuess = getUserLetter(user);
			
			guesses.append(userGuess);
			guesses.append(" ");
			
			printStatistics(rounds, guesses);
		
			if (rounds == 1) {
				for (String element : evilDictionary) {
					if (element.contains(userGuess)) {
					guessList.add(element);
					}
				}
			
				newMap = getPatternMapForGuess(userGuess, guessList, newMap);
				findShortListOfWords(wordList, newMap);
		
				guessedWord = wordList.get(generator.nextInt(wordList.size()));
				wordListSecond.addAll(wordList);
				
				System.out.println("Word: " + String.valueOf(logicOfGuess(guessedWord, userGuess, guessWordPattern)));
				
			} else if (rounds != 1) { 
				for (String element : wordList) {
					if (element.contains(userGuess) && wordListSecond.size() != 1) {
						wordListSecond.remove(element);
					} else if (wordListSecond.size() == 1) {
						break;
					}
				}
				
				if (wordListSecond.size() == 1) {
					guessedWord = wordListSecond.get(0);
				} else {
					guessedWord = wordListSecond.get(generator.nextInt(wordListSecond.size()));
				}
				
				System.out.println("Word: " + String.valueOf(logicOfGuess(guessedWord, userGuess, guessWordPattern)));
			}
			
			if (rounds == 10 && !guessedWord.equals(String.valueOf(guessWordPattern))) {
				user.close();
				printStatistics(rounds, guesses);
				System.out.println("This was the last round. You lost!");
				System.out.println("The word was " + guessedWord + ".");
			}
			
			if (guessedWord.equals(String.valueOf(guessWordPattern))) {
				System.out.println("Congratulations! You won!");
				printStatistics(rounds, guesses);
				user.close();
				break;
			}
			
			rounds++;
			
		}
		
	}
	
	private static String getUserLetter(Scanner user) {
		System.out.print("Guess a letter: ");
		String userGuess = user.next();
		return userGuess;
	}
	
	private static int getWordLength(Scanner user) {
		System.out.print("Choose word length (number): ");
		int wordLength = user.nextInt();
		System.out.println();
		return wordLength;
	}
	
	private static List<String> createEvilDictionary(String[] dictionary, int wordLength) {
		List<String> evilDictionary = new ArrayList<>();
		for (String element : dictionary) {
			if (element.length() == wordLength) {
				evilDictionary.add(element);
			}
		}
		return evilDictionary;
	}
	
	private static char[] logicOfGuess (String guessedWord, String userGuess, char[] guessWordPattern) {
		char[] temp = guessedWord.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			for (int x = 0; x < userGuess.toCharArray().length; x++) {
				if (userGuess.toCharArray()[x] == temp[i]) {
					guessWordPattern[i] = userGuess.toCharArray()[x];
				}
			}
		}
		return guessWordPattern;
	}
	
	private static char[] generatePatternGuess(int wordLength) {
		char[] guessWordPattern = new char[wordLength];
		for (int f = 0; f < wordLength; f++) {
			guessWordPattern[f] = '-';
		}
		return guessWordPattern;
	}

	private static String[] readFile() throws IOException {
		Path filePath = new File("words.txt").toPath();
		List<String> dictList = Files.readAllLines(filePath);
		String[] dictionary = dictList.toArray(new String[]{});
		return dictionary;
	}

	private static List<String> findShortListOfWords(List<String> wordList, Map<String, List<String>> newMap) {
		int biggestNumber = Integer.MIN_VALUE;
		for (List<String> words : newMap.values()) {		
			if (words.size() > biggestNumber) {
				biggestNumber = words.size();
				wordList.clear();
				wordList.addAll(words);
			}
		}
		return wordList;
	}
	
	private static Map<String, List<String>> getPatternMapForGuess(String userGuess, List<String> guessList, Map<String, List<String>> newMap) {
		for (String element : guessList) {
			String pattern = createPattern(userGuess, element);
			List<String> wordList;
			if (newMap.containsKey(pattern)) {
				wordList = newMap.get(pattern);
			} else {
				wordList = new ArrayList<String>();
			}
			
			if (!wordList.contains(element)) {
				wordList.add(element);
			}
	
			newMap.put(pattern, wordList);
			
		}
		return newMap;	
	}

	private static String createPattern(String userGuess, String element) {
		String replaceRegex = "[^" + userGuess + "]";
		String pattern = element.replaceAll(replaceRegex, "-");
		return pattern;
	}
	
	private static void printStatistics(int rounds, StringBuilder guesses) {
		System.out.println("Round: " + rounds);
		System.out.println("Your guesses: " + guesses + " ");
		System.out.println("---------------------------------");
	}

}
