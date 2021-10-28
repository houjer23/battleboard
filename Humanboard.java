import java.io.*;
import java.util.*;
// import all classes in Java

// Battleship class -- all methods and actions of battleships are written here
public class Humanboard {
	
	int[][] human_board; //  Board stores the locations of ships
	int[][] computer_guess; // guess stores the user input locations
	int posGuessed; // stores how many ships are hit
	int[] ships = {2, 3, 4};
	public Humanboard() { // construction method
		human_board = new int[10][10]; // initialize the board to size 10 * 10
		computer_guess = new int[10][10]; // initialize the guess to size 10 * 10
		posGuessed = 0;
		
	} // end of construction method
	
	public void placeShip(int n) { // method place ship helps to place the ship to the board n times
		System.out.println("Please select column and row. Computer will guess your board");
		for (int i = 2; i <= 4; i ++) 
		{
			System.out.println("This ship will be size " + i);
			Scanner get_num = new Scanner(System.in);
			System.out.print("Select 0 for horizontal ship and 1 for vertical ship ");
			int vertical_or_horizontal =  get_num.nextInt();
			
			Scanner scan = new Scanner(System.in);
			System.out.print("What column do you want? ");
			int shipRow = scan.nextInt();
			System.out.print("What row do you want?");
			int shipColumn = scan.nextInt();
			
			if(vertical_or_horizontal==0)
			{
				placeShipHorizontal(i, shipRow, shipColumn);
		    }
		    else
		    {
				placeShipVertical(i, shipRow, shipColumn);
		    }
		} // end of for loop (place ship n times)
	} // end of the place ship method
	
	
	public void placeShipHorizontal(int size, int shipRow, int shipColumn) {
		for (int i = shipColumn; i < shipColumn + size; i++) { // column number add 1 each time
			human_board[shipRow][i] = 1; // If these locations are not placed already, set the whole ship, indicated by 1 in the board
		} // end of the for loop
	} // end of helper method for place ship (place ship horizontally)
	
	public void placeShipVertical(int size, int shipRow, int shipColumn) {
		for (int i = shipRow; i < shipRow+size; i++) {  // row number add 1 each time
			human_board[i][shipColumn] = 1;  // If these locations are not placed already, set the whole ship, indicated by 1 in the board			
		} // end of the for loop
		
	} 
	
	
	public void checkBoard() { // This method checks user input if matches with board
		int rowPos = (int)(Math.random()*9);
		int colPos = (int)(Math.random()*9); // Gets user guesses on rows and columns
		if (computer_guess[rowPos][colPos] == 2) {
			System.out.println("The position is already hit");
		} else if (human_board[rowPos][colPos] == 1 || board[rowPos][colPos] == 2 || board[rowPos][colPos] == 3) { //If the guess array matches the board at the user input position, then the guess is correct
			System.out.println("HIT");
			computer_guess[rowPos][colPos] = 2;
			posGuessed ++;
			ships[human_board[rowPos][colPos] - 1] --;
			if (ships[human_board[rowPos][colPos] - 1] == 0) {
				System.out.println("Ship Sank");
			}
		} else {
			computer_guess[rowPos][colPos] = 1;
			System.out.println("MISS"); // if not then it's a miss
		}
	}
