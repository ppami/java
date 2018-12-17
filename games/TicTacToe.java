package games;

import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		char[][] board = new char[3][3];
		char[] players = {'X', 'O'};
		char player;
		int i = 0;
		String win = "no";
		int row;
		int column;
		
		while (win.equals("no")) {

		    player = players[i % 2];
			System.out.print(String.valueOf(player) + ", choose your location (row, column): ");
			row = user.nextInt();
			column = user.nextInt();
			System.out.println();
			board[row][column] = player;
			printBoard(board);

			win = checkWin(board, player);
            i++;
		}

		user.close();

	}
	
	private static String checkWin(char[][] board, char ex) {
		if ((board[0][0] == ex) && (board[0][1] == ex) && (board[0][2] == ex)) {
			System.out.println("'X', you won!");
			return "yes";
		} else if ((board[1][0] == ex) && (board[1][1] == ex) && (board[1][2] == ex)) {
			System.out.println("'X', you won!");
			return "yes";
		} else if ((board[2][0] == ex) && (board[2][1] == ex) && (board[2][2] == ex)) {
			System.out.println("'X', you won!");
			return "yes";
		} else if ((board[0][0] == ex) && (board[1][1] == ex) && (board[2][2] == ex)) {
			System.out.println("'X', you won!");
			return "yes";
		} else if ((board[0][2] == ex) && (board[1][1] == ex) && (board[2][0] == ex)) {
			System.out.println("'X', you won!");
			return "yes";
		} else {
		    return "no";
        }
	}

	private static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int e = 0; e < board[i].length; e++) {
				System.out.print(board[i][e] + " ");
			}
			System.out.println();
		}
		
	}

}


