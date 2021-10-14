public class Battleship {
	
	private Set<Integer> ships;
	int[][] board;
	
	public Battleboard() {
		ships = new HashSet<>();
		board = new int[10][10];
	}
	
	public void placeShip() {
		
	}
	
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
	
}
