public class Battleship {
	
	private Set<Integer> ships;
	int[][] board;
	
	public Battleboard() {
		ships = new HashSet<>();
		board = new int[10][10];
	}
	
	public void placeShip() {
		
	}
	public void placeShipHorizontal() {
		int shipRow = (int)(Math.random()*board.length);
		int shipColumn = (int)(Math.random()*(board.length - 2);
		for (int i = shipColumn; i<shipColumn+2; i++) 
			board[shipRow][i]=1;
		}
				       //Places battleship positions in subsequent columns.
	}
	
	public void placeShipVertical()
		int shipColumn = (int)(Math.random()*board.length);
		int shipRow = (int)(Math.random()*(board.length - 2);
		for (int i = shipRow; i<shipRow+2; i++) 
			board[i][shipColumn]=1;
				    //Places battleship positions in subsequent rows. 
		}
	}//T
	// This Method is used for testing place Ship
	public printBoard() {
		System.out.println();
		for (int i = 0; i < board.length; i ++) {
			for (int j = 0; j < board[0].length; j ++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void checkhit
	{
		
		Scanner getpos = new Scanner(System.in);
		System.out.print("Select Row you want to hit");
		int row = scan.nextInt();
		System.out.print("Select column you want to hit");
		int column = scan.nextInt()-1;
		guess = new int[10][10];
		if(guess[row][column]==board[shipRow][shipColumn])
		{
			System.out.print("The ship has been hit");
		}
		else
		{
			System.out.print("Miss");
		}
		
		
    }			    
	
}
