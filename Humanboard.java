/*
 *  By Kevin and Jerry
 *  Humanboard class -- human place the ship and computer guess the ship
 */

import java.io.*;
import java.util.*;
// import all classes in Java

public class Humanboard {
	
	int[][] human_board; //  human_board stores the locations of ships
	int[][] computer_guess; // It stores computer guess locations
	int posGuessed; // stores how many ships are hit
	
	public Humanboard() { // construction method
		human_board = new int[10][10]; // initialize the board to size 10 * 10
		computer_guess = new int[10][10]; // initialize the guess to size 10 * 10
		posGuessed = 0; // the amount of ships already guess
	} // end of construction method
	
	public void placeShip() { // method place ship helps to place the ship to the board n times
		System.out.println("Please select column and row of the starting position of your ship. Computer will guess your board");
		for (int i = 2; i <= 4; i ++) {
			print_Humanboard();
			System.out.println("This ship will be size " + i);
			// select vertical or horizontal
			int vertical_or_horizontal;
		    do {
			   Scanner get_num = new Scanner(System.in);
			   System.out.print("Select 0 for horizontal ship and 1 for vertical ship: ");
			   vertical_or_horizontal = get_num.nextInt();
			} while (vertical_or_horizontal != 1 && vertical_or_horizontal != 0); //restricts user input to 0 and 1;
			// input row and column
			int shipRow;
			int shipColumn;
			Scanner scan = new Scanner(System.in);
			System.out.print("What column do you want? ");
			shipRow = scan.nextInt();
			System.out.print("What row do you want? ");
			shipColumn = scan.nextInt();
			// call placeship helper
			if(vertical_or_horizontal == 0)
			{
				placeShipHorizontal(i, shipRow, shipColumn);
		    }
		    else
		    {
				placeShipVertical(i, shipRow, shipColumn);
		    }
		}
	} // end of the place ship method
	
	
	public void placeShipHorizontal(int size, int shipRow, int shipColumn) {
		for (int i = shipColumn; i < shipColumn + size; i++) { // column number add 1 each time
			human_board[shipRow][i] = 1; // set the whole ship, indicated by 1 in the board
		} // end of the for loop
	} // end of helper method for place ship (place ship horizontally)
	
	public void placeShipVertical(int size, int shipRow, int shipColumn) {
		for (int i = shipRow; i < shipRow+size; i++) {  // row number add 1 each time
			human_board[i][shipColumn] = 1;  // set the whole ship, indicated by 1 in the board			
		} // end of the for loop
	} // end of helper method for place ship (place ship vertically)
	
	public void print_Humanboard() { // This method prints the board to give hints of where the human puts 
		System.out.println();
		System.out.print(" ");
		for (int i = 0; i < human_board.length; i ++) {
			System.out.print(" " + i);
		}
		System.out.println();
		for (int i = 0; i < human_board.length; i ++) { // looping through rows
			System.out.print(i + " ");
			for (int j = 0; j < human_board[0].length; j ++) { // looping through columns
				// print that position (indicated by rows and columns)
				System.out.print(human_board[i][j] + " ");
			} // end of looping through columns
			System.out.println();
		} // end of looping through rows
		System.out.println();
	} // end of print_Humanboard
	
	public void printBoard() { // This method prints the board with computer guess
		System.out.println();
		System.out.print(" ");
		for (int i = 0; i < computer_guess.length; i ++) {
			System.out.print(" " + i);
		}
		System.out.println();
		for (int i = 0; i < computer_guess.length; i ++) { // looping through rows
			System.out.print(i + " ");
			for (int j = 0; j < computer_guess[0].length; j ++) { // looping through columns
				// print that position (indicated by rows and columns)
				if (computer_guess[i][j] == 1) {
					System.out.print("X ");
				} else if (computer_guess[i][j] == 2) {
					System.out.print("* ");
				} else {
					System.out.print("0 ");
				}
			} // end of looping through columns
			System.out.println();
		} // end of looping through rows
		System.out.println();
	} // end of print board method
	
	public void checkBoard() { // This method checks computer input if matches with board
		// Gets computer guesses on rows and columns
		int rowPos = (int)(Math.random() * 10);
		int colPos = (int)(Math.random() * 10);
		if (computer_guess[rowPos][colPos] == 2) {
			System.out.println("The position is already hit");
		} else if (human_board[rowPos][colPos] == 1 || human_board[rowPos][colPos] == 2 || human_board[rowPos][colPos] == 3) { // If the guess array matches the board at the computer input position, then the guess is correct
			System.out.println("HIT");
			computer_guess[rowPos][colPos] = 2;
			posGuessed ++;
		} else {
			computer_guess[rowPos][colPos] = 1;
			System.out.println("MISS"); // if not then it's a miss
		}
	} // end of checkBoard methos
} // end of the class
