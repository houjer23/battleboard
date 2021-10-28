import java.io.*;
import java.util.*;
// import all classes in Java

// Battleship class -- all methods and actions of battleships are written here
public class Computer_Ship {
	
	int[][] board; //  Board stores the locations of ships
	int[][] guess; // guess stores the user input locations
	int posGuessed; // stores how many ships are hit
	int[] ships = {2, 3, 4};
	
	public Computer_Ship() { // construction method
		board = new int[10][10]; // initialize the board to size 10 * 10
		guess = new int[10][10]; // initialize the guess to size 10 * 10
		posGuessed = 0;
	} // end of construction method
	
	public void placeShip() { // method place ship helps to place the ship to the board n times
		for (int i = 2; i <= 4; i ++) { // place ship n times
			int random_num = (int) (Math.random() * 2); // random number (0 or 1)
			// placeShipHorizontal() and placeShipVertical() are true if the locations doesn't have ships already
			if (random_num == 0) { // if the random number is 0, place the ship horizontally (call the helper method)
				if (placeShipHorizontal(i) == false) {
					i--; // if the location is already placed by ship, need to place the ship again
				}
			} else {
				if (placeShipVertical(i) == false) {
					i--; // if the location is already placed by ship, need to place the ship again
				}
			}
		} // end of for loop (place ship n times)
	} // end of the place ship method
	
	
	public boolean placeShipHorizontal(int size) { // helper method for place ship (place ship horizontally)
		// the following shipRow and ship Column are the starting position of a ship
		int shipRow = (int) (Math.random() * board.length); // choose a random number for row from 0 to board length (in this case is 9) -- this doesn't change for ship
		int shipColumn = (int)(Math.random()*(board.length - 2)); // choose a random number for column from 0 to board length - 2 (in this case is 7) because the ship size is 3 -- this changes for the ship
		for (int i = shipColumn; i < shipColumn + size; i++) { // column number add 1 each time
			if(board[shipRow][i] == 1) // This if statement check if these locations are already placed by ship or not
			{
				return false;
			}
		} // end of the for loop
		for (int i = shipColumn; i < shipColumn + size; i++) { // column number add 1 each time
			board[shipRow][i] = size - 1; // If these locations are not placed already, set the whole ship, indicated by 1 in the board
		} // end of the for loop
		return true;
	} // end of helper method for place ship (place ship horizontally)
	
	public boolean placeShipVertical(int size) {
		// helper method for place ship (place ship vertically)
		// the following shipRow and ship Column are the starting position of a ship
		int shipColumn = (int)(Math.random()*board.length); // choose a random number for column from 0 to board length (in this case is 9) -- this doesn't change for the ship
		int shipRow = (int)(Math.random()*(board.length - 2)); // choose a random number for row from 0 to board length - 2 (in this case is 7) because the ship size is 3 -- this changes for the ship
		for(int i = shipRow; i < shipRow+size; i++) // row number add 1 each time
		{
			if (board[i][shipColumn]==1)  // This if statement check if these locations are already placed by ship or not
			{
				return false;
			}
		} // end of the for loop
		for (int i = shipRow; i < shipRow+size; i++) {  // row number add 1 each time
			board[i][shipColumn] = size - 1;  // If these locations are not placed already, set the whole ship, indicated by 1 in the board			
		} // end of the for loop
		return true;
	} // end of helper method for place ship (place ship vertically)
	
	public void printBoard() { // This method prints the board with user guess
		System.out.println();
		System.out.print(" ");
		for (int i = 0; i < guess.length; i ++) {
			System.out.print(" " + i);
		}
		System.out.println();
		for (int i = 0; i < guess.length; i ++) { // looping through rows
			System.out.print(i + " ");
			for (int j = 0; j < guess[0].length; j ++) { // looping through columns
				// print that position (indicated by rows and columns)
				if (guess[i][j] == 1) {
					System.out.print("X ");
				} else if (guess[i][j] == 2) {
					System.out.print("* ");
				} else {
					System.out.print("0 ");
				}
			} // end of looping through columns
			System.out.println();
		} // end of looping through rows
		System.out.println();
	} // end of print board method
	
	public void checkBoard() { // This method checks user input if matches with board
		int rowPos;
		int colPos;
		do {
		   Scanner getpos = new Scanner(System.in);
		   System.out.print("What row do you want? ");
		   rowPos = getpos.nextInt();
		   System.out.print("What column do you want? ");
		   colPos = getpos.nextInt();
		 } while(rowPos < 0 || rowPos > 9); //Restricts user input to a value between 1 and 9
		if (guess[rowPos][colPos] == 2) {
			System.out.println("The position is already hit");
		} else if (board[rowPos][colPos] == 1 || board[rowPos][colPos] == 2 || board[rowPos][colPos] == 3) { //If the guess array matches the board at the user input position, then the guess is correct
			System.out.println("HIT");
			guess[rowPos][colPos] = 2;
			posGuessed ++;
			ships[board[rowPos][colPos] - 1] --;
			if (ships[board[rowPos][colPos] - 1] == 0) {
				System.out.println("Ship Sank");
			}
		} else {
			guess[rowPos][colPos] = 1;
			System.out.println("MISS"); // if not then it's a miss
		}
	}
	
	
	
} // end of Battleship class
import java.io.*;
import java.util.*;
// import all classes in Java

// Battleship class -- all methods and actions of battleships are written here
public class Computer_Ship {
	
	int[][] board; //  Board stores the locations of ships
	int[][] guess; // guess stores the user input locations
	int posGuessed; // stores how many ships are hit
	int[] ships = {2, 3, 4};
	
	public Computer_Ship() { // construction method
		board = new int[10][10]; // initialize the board to size 10 * 10
		guess = new int[10][10]; // initialize the guess to size 10 * 10
		posGuessed = 0;
	} // end of construction method
	
	public void placeShip() { // method place ship helps to place the ship to the board n times
		for (int i = 2; i <= 4; i ++) { // place ship n times
			int random_num = (int) (Math.random() * 2); // random number (0 or 1)
			// placeShipHorizontal() and placeShipVertical() are true if the locations doesn't have ships already
			if (random_num == 0) { // if the random number is 0, place the ship horizontally (call the helper method)
				if (placeShipHorizontal(i) == false) {
					i--; // if the location is already placed by ship, need to place the ship again
				}
			} else {
				if (placeShipVertical(i) == false) {
					i--; // if the location is already placed by ship, need to place the ship again
				}
			}
		} // end of for loop (place ship n times)
	} // end of the place ship method
	
	
	public boolean placeShipHorizontal(int size) { // helper method for place ship (place ship horizontally)
		// the following shipRow and ship Column are the starting position of a ship
		int shipRow = (int) (Math.random() * board.length); // choose a random number for row from 0 to board length (in this case is 9) -- this doesn't change for ship
		int shipColumn = (int)(Math.random()*(board.length - 2)); // choose a random number for column from 0 to board length - 2 (in this case is 7) because the ship size is 3 -- this changes for the ship
		for (int i = shipColumn; i < shipColumn + size; i++) { // column number add 1 each time
			if(board[shipRow][i] == 1) // This if statement check if these locations are already placed by ship or not
			{
				return false;
			}
		} // end of the for loop
		for (int i = shipColumn; i < shipColumn + size; i++) { // column number add 1 each time
			board[shipRow][i] = size - 1; // If these locations are not placed already, set the whole ship, indicated by 1 in the board
		} // end of the for loop
		return true;
	} // end of helper method for place ship (place ship horizontally)
	
	public boolean placeShipVertical(int size) {
		// helper method for place ship (place ship vertically)
		// the following shipRow and ship Column are the starting position of a ship
		int shipColumn = (int)(Math.random()*board.length); // choose a random number for column from 0 to board length (in this case is 9) -- this doesn't change for the ship
		int shipRow = (int)(Math.random()*(board.length - 2)); // choose a random number for row from 0 to board length - 2 (in this case is 7) because the ship size is 3 -- this changes for the ship
		for(int i = shipRow; i < shipRow+size; i++) // row number add 1 each time
		{
			if (board[i][shipColumn]==1)  // This if statement check if these locations are already placed by ship or not
			{
				return false;
			}
		} // end of the for loop
		for (int i = shipRow; i < shipRow+size; i++) {  // row number add 1 each time
			board[i][shipColumn] = size - 1;  // If these locations are not placed already, set the whole ship, indicated by 1 in the board			
		} // end of the for loop
		return true;
	} // end of helper method for place ship (place ship vertically)
	
	public void printBoard() { // This method prints the board with user guess
		System.out.println();
		System.out.print(" ");
		for (int i = 0; i < guess.length; i ++) {
			System.out.print(" " + i);
		}
		System.out.println();
		for (int i = 0; i < guess.length; i ++) { // looping through rows
			System.out.print(i + " ");
			for (int j = 0; j < guess[0].length; j ++) { // looping through columns
				// print that position (indicated by rows and columns)
				if (guess[i][j] == 1) {
					System.out.print("X ");
				} else if (guess[i][j] == 2) {
					System.out.print("* ");
				} else {
					System.out.print("0 ");
				}
			} // end of looping through columns
			System.out.println();
		} // end of looping through rows
		System.out.println();
	} // end of print board method
	
	public void checkBoard() { // This method checks user input if matches with board
		int rowPos;
		int colPos;
		do {
		   Scanner getpos = new Scanner(System.in);
		   System.out.print("What row do you want? ");
		   rowPos = getpos.nextInt();
		   System.out.print("What column do you want? ");
		   colPos = getpos.nextInt();
		 } while(rowPos < 0 || rowPos > 9); //Restricts user input to a value between 1 and 9
		if (guess[rowPos][colPos] == 2) {
			System.out.println("The position is already hit");
		} else if (board[rowPos][colPos] == 1 || board[rowPos][colPos] == 2 || board[rowPos][colPos] == 3) { //If the guess array matches the board at the user input position, then the guess is correct
			System.out.println("HIT");
			guess[rowPos][colPos] = 2;
			posGuessed ++;
			ships[board[rowPos][colPos] - 1] --;
			if (ships[board[rowPos][colPos] - 1] == 0) {
				System.out.println("Ship Sank");
			}
		} else {
			guess[rowPos][colPos] = 1;
			System.out.println("MISS"); // if not then it's a miss
		}
	}
	
	
	
} // end of Battleship class
