/*
 *  By Kevin and Jerry
 *  Tester class -- running the game, getting access to other classes
 */

import java.io.*;
import java.util.*;
// import all classes in Java

public class Tester {
	public static void main(String args[]) { // program starts running here
		System.out.println("\nWelcome to Battleship game!\n");
		human_place_ships();
		System.out.println("Your turn\n");
		computer_place_ships();
	} // end of the program
	
	
	public static void human_place_ships() { // method that human place ship and computer guess ship
		
		Humanboard human = new Humanboard();
		human.placeShip();
		int steps = 0;
		while(human.posGuessed < 9)
		{
			steps ++;
			human.printBoard();
			human.checkBoard();
		}
		System.out.println("Computer wins the Game in " + steps + " steps");
		
	} // end of human place ships method
	
	
	public static void computer_place_ships() { // method that computer place ship and human guess ship
		Scanner scan = new Scanner(System.in); 
		System.out.println("The computer will generate random positions. If you guess correctly, you got a HIT");
		System.out.println("A ship is sunk when all its positions are hit");
		
		
		Computer_Ship computer_board = new Computer_Ship(); // construct Battleship
		
		System.out.println("The computer will generate random positions for battleships");
		System.out.println("Generating...");
		computer_board.placeShip(); // calling placeShip method in battleship class
		
		
		
		System.out.print("Hit return to continue ");
		scan.nextLine();
		System.out.println("\nThe computer placed 3 ships");
		System.out.println("Try to guess where the computer place the ship");
		System.out.println("\n----------------------------------------------\n");
		System.out.println("Guess the ship");
		System.out.println("If you hit the ship, it will be indicated by *");
		System.out.println("If you doesn't hit the ship, it will be indicated by X");
		while (computer_board.posGuessed < 9) {
			computer_board.printBoard(); // calling printBoard method in battleship class
			computer_board.checkBoard(); // calling checkBoard method in battleship class
		}
		computer_board.printBoard();
		System.out.println("You win the game");
	} // end of computer place ships method
} // end of Tester class
