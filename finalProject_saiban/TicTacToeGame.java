/**
 * Created By: James Saiban
 * Date Created: 
 * Description:
 *
 * Modification Log
 * Date		Programmer		Desc
 * 			SaibanJ
 */
package finalProject_saiban;


public class TicTacToeGame {
	//Instance Variables/Encapsulation
	private static final int ROWS = 3;
	private static final int COLS = 3;
	//2D String array (chapter 5)
	private String[][] gameBoard;
	//X/O Pos
	private String arx = "\\s{3}";
	
	//Constructor
	public TicTacToeGame() 
	{
		gameBoard = new String[ROWS][COLS];
	}
	
	//Loop through rows/columns
	public void boardInitialization() 
	{
		//Index variables 
		int r;
		int c;
		
		for(r = 0; r < ROWS; r++) // Loop through Rows
		{ 
			for(c = 0; c < COLS; c++) // Loop through columns
			{
				gameBoard[r][c] = "   "; //position 
			}//End the column Loop
		}//End the row loop
	}//End method
	
	//positions of player
	public void setPlayPos(int r, int c, String player) 
	{
		if(gameBoard[r][c].matches(arx)) 
		{
			gameBoard[r][c] = " " + player + " ";
		}
	}
	
	public boolean isGameOver() 
	{
		//This will determine rows
		for(int r = 0; r < ROWS; r++) 
		{
			if(!gameBoard[r][0].matches(arx) && gameBoard[r][0].equals(gameBoard[r][1]) && gameBoard[r][1].equals(gameBoard[r][2])) 
			{
				return true;
			}
		}
		//This will determine Columns
		for(int c = 0; c < COLS; c++) 
		{
			if(!gameBoard[0][c].matches(arx) && gameBoard[0][c].equals(gameBoard[1][c]) && gameBoard[1][c].equals(gameBoard[2][c])) 
			{	return true;
			
			}
		}
		//This will determine diagonals 
		if(!gameBoard[0][0].matches(arx) && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2])) 
		{
			return true;
		}
		if(!gameBoard[0][2].matches(arx) && gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][0])) 
		{
			return true;
		}
		return false;
	}
	
	public String displayBoard() 
	{	
		int r;
		int c;
		
		String strgameBoard = ""; //Will be the board
		
		for(r = 0; r < ROWS; r++) 
		{
			for(c = 0; c < COLS; c++)  
			{
				if(c != COLS - 1) 
				{
					strgameBoard = strgameBoard + gameBoard[r][c] + "|"; 
				}else strgameBoard = strgameBoard + gameBoard[r][c]; //End if
			}//End columns for loop
			if(r != COLS - 1) 
			{
				strgameBoard = strgameBoard + "\n---+---+---\n"; 
			}//End if
		}//End rows for loop
	return strgameBoard;
	}//End method
}//End Class
