package hackathon2;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		System.out.print("Enter file size: ");
		long value = user.nextLong();
		user.close();
		System.out.println();
		
		long kb = 1024;
		long mb = kb*kb;
		long gb = mb*kb;
		long tb = gb*kb;
		long result = 0;
		
		long[] dividers = new long[] {kb, mb, gb, tb};
		String[] units = new String[] {"KB", "MB", "GB", "TB", "B"};
		
		System.out.println(value + " " + units[4]);
		for (int i = 0; i < dividers.length; i++) {
			if (value >= dividers[i]) {
				result = value/dividers[i];
				System.out.println(result + " " + units[i]);
			} else if (value < kb){
				System.out.println(value + " " + units[4]);
				break;
			} else if (value < 1) {
				System.out.println("Invalid file size: " + value);
			}
		}
	}

}
