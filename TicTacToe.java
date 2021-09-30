package com.TicTacToe;

public class TicTacToe {

	public static void createBoard() {

		char[] board = new char[10];

		for (int i = 0; i < board.length; i++) {

			board[i] = ' ';

		}
	}

	public static void main(String[] args) {
		
		System.out.println("Create a board:");
		
		TicTacToe.createBoard();
		

	}

}
