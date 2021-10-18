import java.io.*;
import java.util.*;
// import all classes in Java

// Tester class -- running the game, access to Battleship class
public class Tester {
	public static void main(String args[]) { // program starts running here
		Scanner scan = new Scanner(System.in); 
		System.out.println("\nWelcome to Battleship game!");
		System.out.print("The computer will generate random positions. If you guess correctly, you got a HIT");
		System.out.print("A ship is sunk when all its positions are hit");
		
		Battleship battleship = new Battleship(); // construct Battleship
		battleship.placeShip(3); // calling placeShip method in battleship class
		battleship.printBoard(); // calling printBoard method in battleship class
		
		// Just some prompts here
		System.out.println("The computer will generate random positions for battleships");
		
		
		System.out.println("Generating...");
		System.out.print("Hit return to continue ");
		scan.nextLine();
		System.out.println("\nThe computer placed 3 ships");
		System.out.println("Try to guess where the computer place the ship");
	} // end of the program
} // end of Tester class
