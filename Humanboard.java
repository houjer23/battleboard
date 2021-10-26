import java.io.*;
import java.util.*;

public class Humanboard
{
     public Humanboard() { // construction method
		humanboard = new int[10][10]; // initialize the board to size 10 * 10
		computerguess = new int[10][10]; // initialize the guess to size 10 * 10
		posGuessed = 0;
     } // end of construction method
		
		  
		 
      public void placeShiphuman(int n) { // method place ship helps to place the ship to the board n times
		Scanner getdetermine = new Scanner(System.in);
		System.out.print("Select numbers 0 or 1");
		int determine = getdetermine.nextInt();
		   for (int i = 0; i < n; i ++) 
		     { // place ship n times
			 // random number (0 or 1)
			if (getdetermine == 0) 
			{ // if the random number is 0, place the ship horizontally (call the helper method)
				if(placeShipHorizontalhuman()==false)
				{
					i--;
				}
			} else 
			{
				if (placeShipVerticalhuman() == false) 
				{
					i--;
				} // if the random number is 1, place the ship horizontally (call the helper method)
			}
		  } // end of for loop (place ship n times)
	    } // end of the place ship method
	
	
	public void placeShipHorizontalhuman() 
	{  
		Scanner getcol = new Scanner(System.in);
		System.out.print("Select col");
		int humancol = getcol.nextInt();
		System.out.print("select row");
		int humanrow = getcol.nextInt();
		// helper method for place ship (place ship horizontally)
		// the following shipRow and ship Column are the starting position of a ship 
		// choose a random number for row from 0 to board length (in this case is 9) -- this doesn't change for ship
		humancol-=2;
		for (int i = humancol; i <= humancol + 2; i++) 
		{ 
			
			humanboard[humanrow][i] = 1;
		} 
	} 
	
	public boolean placeShipVertical() 
	{
		
		Scannergetrow = new Scanner(System.in);
		System.out.print("Input row");
		humanrow = getrow.nextInt();
		System.out.print("Input column");
		humancol = getrow.nextInt();
		
		humanrow-=2;
		for(int i = humanrow; i <= humanrow+2; i++)
		{
			if(humanboard[i][humancol]==1)
			{
				return false;
			}
		}
		for (int i = shipRow; i <= shipRow+2; i++) 
		 {
			humanboard[i][humancol]=1;
			
			
			
		}
		return true; 
	}
  }
