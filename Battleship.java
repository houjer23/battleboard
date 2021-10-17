import java.io.*;
import java.util.*;
// import all classes in Java

// Battleship class -- all methods and actions of battleships are written here
public class Battleship {
	
	Set<Integer> ships; // This Set will be used later to check if the ship is hit
	int[][] board; //  Board stores the locations of ships
	
	public Battleship() { // construction method
		ships = new HashSet<>(); // initialize the set
		board = new int[10][10]; // initialize the board to size 10 * 10 
	} // end of construction method
	
	public void placeShip(int n) { // method place ship helps to place the ship to the board n times
		for (int i = 0; i < n; i ++) { // place ship n times
			int random_num = (int) (Math.random() * 2); // random number (0 or 1)
			if (random_num == 0) { // if the random number is 0, place the ship horizontally (call the helper method)
				placeShipHorizontal();
			} else {
				placeShipVertical(); // if the random number is 1, place the ship horizontally (call the helper method)
			}
		} // end of for loop (place ship n times)
	} // end of the place ship method
	
	
	public void placeShipHorizontal() { // helper method for place ship (place ship horizontally)
		// the following shipRow and ship Column are the starting position of a ship
		int shipRow = (int) (Math.random() * board.length); // choose a random number for row from 0 to board length (in this case is 9) -- this doesn't change for ship
		int shipColumn = (int)(Math.random()*(board.length - 2)); // choose a random number for column from 0 to board length - 2 (in this case is 7) because the ship size is 3 -- this changes for the ship
		for (int i = shipColumn; i <= shipColumn + 2; i++) { // column number add 1 each time
			// Set the whole ship, indicated by 1 in the board
			board[shipRow][i] = 1;
		} // end of the for loop
	} // end of helper method for place ship (place ship horizontally)
	
	public void placeShipVertical() { // helper method for place ship (place ship vertically)
		// the following shipRow and ship Column are the starting position of a ship
		int shipColumn = (int)(Math.random()*board.length); // choose a random number for column from 0 to board length (in this case is 9) -- this doesn't change for the ship
		int shipRow = (int)(Math.random()*(board.length - 2)); // choose a random number for row from 0 to board length - 2 (in this case is 7) because the ship size is 3 -- this changes for the ship
		for (int i = shipRow; i <= shipRow+2; i++) { // row number add 1 each time
			// Set the whole ship, indicated by 1 in the board
			board[i][shipColumn] = 1;
		} // end of the for loop
	} // end of helper method for place ship (place ship vertically)
	
	public void printBoard() { // This method prints the board with ships
		System.out.println();
		for (int i = 0; i < board.length; i ++) { // looping through rows
			for (int j = 0; j < board[0].length; j ++) { // looping through columns
				System.out.print(board[i][j] + " "); // print that position (indicated by rows and columns)
			} // end of looping through columns
			System.out.println();
		} // end of looping through rows
		System.out.println();
	} // end of print board method
	
	public void checkBoard()
	{
		guess = new int[10][10];//creates new array that stores user guesses
		Scanner getpos = new Scanner(System.in);
		System.out.print("What row do you want?");
		int rowpos = getpos.nextInt();
		System.out.print("What column do you want?");
		int colpos = getpos.nextInt();//Gets user guesses on rows and columns
		for (int i=0; i<board.length; i++)//loops through the rows and columns respectively of the board array
		{
			for(int j=0; j<board[0].length; j++){
				if(board[i][j]==1 && guess[rowpos][colpos]==board[i][j]){//If the guess array matches the board at any position, then the guess is correct
					System.out.print("HIT");
				}
				else
				{
				  System.out.print("MISS");// if not then it's a miss
				}
	}
			
		
		

} // end of Battleship class
