import java.io.*;
import java.util.*;
// import all classes in Java

// Tester class -- running the game, access to Battleship class
public class Tester {
	public static void main(String args[]) { // program starts running here
		Scanner scan = new Scanner(System.in); 
		System.out.println("\nWelcome to Battleship game!");
		System.out.println("The computer will generate random positions. If you guess correctly, you got a HIT");
		System.out.println("A ship is sunk when all its positions are hit");
		
		Battleship battleship = new Battleship(); // construct Battleship
		
		System.out.println("The computer will generate random positions for battleships");
		System.out.println("Generating...");
		battleship.placeShip(3); // calling placeShip method in battleship class
		
		for (int i = 0; i < battleship.guess.length; i ++) { // looping through rows
			for (int j = 0; j < battleship.guess[0].length; j ++) { // looping through columns
				System.out.print(battleship.board[i][j] + " "); // print that position (indicated by rows and columns)
			} // end of looping through columns
			System.out.println();
		} // end of looping through rows
		
		
		System.out.print("Hit return to continue ");
		scan.nextLine();
		System.out.println("\nThe computer placed 3 ships");
		System.out.println("Try to guess where the computer place the ship");
		System.out.println("\n----------------------------------------------\n");
		while (battleship.posGuessed < 9) {
			battleship.printBoard(); // calling printBoard method in battleship class
			battleship.checkBoard();
		}
	} // end of the program
} // end of Tester class
