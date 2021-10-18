import java.io.*;
import java.util.*;


public class Humanboard
	{
		int determine;
		public Humanboard()
	  {
		  Scanner getdetermine = new Scanner(System.in);
		  determine = getdetermine.nextInt();
		  System.out.print("Pick 0 for column placement pick 1 for row placement");
		  
		 
		 
		 
		 public void placeShiphuman(int n) 
		 { // method place ship helps to place the ship to the board n times
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
				if (placeShipVerticalhuman() == false) {
					i--;
				} // if the random number is 1, place the ship horizontally (call the helper method)
			}
		  } // end of for loop (place ship n times)
	    } // end of the place ship method
	
	
	public void placeShipHorizontalhuman() 
	{  
		Scanner getcol = new Scanner(System.in);
		int humancol = getcol.nextInt();
		// helper method for place ship (place ship horizontally)
		// the following shipRow and ship Column are the starting position of a ship 
		// choose a random number for row from 0 to board length (in this case is 9) -- this doesn't change for ship
		humancol-=2;
		for (int i = humancol; i <= humancol + 2; i++) 
		{ 
			
			board[humanrow][i] = 1;
		} 
	} 
	
	public boolean placeShipVertical() 
	{
		
		Scannergetrow = new Scanner(System.in);
		int humanrow = getrow.nextInt();
		humanrow-=2;
		for(int i = humanrow; i <= humanrow+2; i++)
		{
			if(board[i][humancol]==1)
			{
				return false;
			}
		}
		 for (int i = shipRow; i <= shipRow+2; i++) 
		 {
			board[i][humancol]==1
			
			
			
		}
		return true; 
	}
  }
 }

