import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nWelcome to Battleship game!");
		System.out.println("The computer will generate random positions for battleships");
		System.out.println("Generating...");
		System.out.print("Hit return to continue ");
		scan.nextLine();
		System.out.println("\nThe computer placed 3 ships");
		System.out.println("Try to guess where the computer place the ship");
	}
}
