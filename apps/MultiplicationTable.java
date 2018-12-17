package pl.codeme.javase.hackathon1;

public class MultiplicationTable {

	public static void main(String[] args) {
		int[][] table = new int[11][11];
		
		for (int row = 1; row <= table.length - 1; row++) {
			for (int col = 1; col <= table[row].length - 1; col++) {
				table[row][col] = (row*col);
			}
		}
		
		for (int row = 1; row <= table.length - 1; row++) {
			for (int col = 1; col <= table[row].length - 1; col++) {
				System.out.print(table[row][col] + "	");
			}
			System.out.println();
		}
		

	}

}
