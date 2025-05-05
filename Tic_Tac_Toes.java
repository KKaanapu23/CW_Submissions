import java.util.Scanner;
public class Tic_Tac_Toes {

static char[][] board = 
	{
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '}};
	static Scanner myReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		//This makes the board
		boardMaker(board);
		//This entire sequence will check who wins after each player takes a turn since I don't know how
		//to make a loop of it
		playerXRow(board);
	    //Player O turn
	    playerORow(board);
	    //Player X turn
	    playerXRow(board);
	    //Player O turn
	    playerORow(board);
	    //Player X turn and check win
	    playerXRow(board);
	    //looks to see if X applies to the algorithm of three in a row, if so then they win
	    if (checkWin('X')) 
	    {
	    	System.out.println("Player X wins!");
	    }
	    //Player O turn and check win
	    playerORow(board);
	    //looks to see if O applies to the algorithm of three in a row, if so then they win
	    if (checkWin('O')) 
	    {
	    	System.out.println("Player O wins!");
	    }
	    //Player X turn and check win
	    playerXRow(board);
	    //looks to see if X applies to the algorithm of three in a row, if so then they win
	    if (checkWin('X')) 
	    {
	    	System.out.println("Player X wins!");
	    }
	    //Player O turn and check win
	    playerORow(board);
	    //looks to see if O applies to the algorithm of three in a row, if so then they win
	    if (checkWin('O')) 
	    {
	    	System.out.println("Player O wins!");
	    }
	    //Player X turn and check win
	    playerXRow(board);
	    //looks to see if X applies to the algorithm of three in a row, if so then they win
	    if (checkWin('X')) 
	    {
	    	System.out.println("Player X wins!");
	    }
	    //Check for a tie
	    tieCheck();
	}
	
	/*
	 * This method makes the board
	 */
	public static void boardMaker(char[][] arr)
	
	{
		//This goes through the board and prints spaces side to side
		for(int i = 0; i <= board.length-1; i++)
		{
			System.out.println();
			//This also does that but up and down
			for(int j = 0; j <= board.length-1; j++)
			{
				System.out.print(board[i][j]);
			}
		}
		
		
	}
	/*
	 * This method is player X's turn to see what row they want their X in
	 */
	public static void playerXRow(char[][] board)
	{
		//Just to make it more organized
		System.out.println();
		//Instructions
		System.out.println("What row would you like to put your X in player X?");
		//scanner will read for the next int that it sees
		int p1Input = (myReader.nextInt());
		//Makes sure the number is between 3 and 1
		if(p1Input > 3 || p1Input < 1)
		{
			//prints this if it's not and makes them try again until done correctly
			System.out.println("This option is invalid, Try again");
			playerXRow(board);
		}
		
		//this goes to the next players turn
		else
		{
			playerXcol(board, p1Input);
		}
		
		
	}
	/*
	 * This method asks player O what column they want to be in
	 */
	public static void playerOcol(char[][] board, int row)
	{
		//instructions
		System.out.print("What column would you like to put your O in player O?");
		//Scanner will read for the next int being between 3 and 1
		int p1Input = (myReader.nextInt());
		if(p1Input > 3 || p1Input < 1)
		{
			//prints this if they don't say the correct numbers and try again
			System.out.print("This option is invalid, Try again");
			playerORow(board);
		}
		
		else
		{
			board[row-1][p1Input-1] = 'O';
			boardMaker(board);
		}
		
		
		
		
	}
	
	/*
	 * This method checks what row player O wants their O in
	 */
	public static void playerORow(char[][] board)
	{
		//instructions
		System.out.println();
		System.out.println("What row would you like to put your O in player O?");
		//looks for next int between 3 and 1
		int p1Input = (myReader.nextInt());
		
		if(p1Input > 3 || p1Input < 1)
		{
			//if it's an invalid number try again
			System.out.println("This option is invalid, Try again");
			playerORow(board);
		}
		
		else
		{
			//next turn
			playerOcol(board, p1Input);
		}
		
		
	}
	/*
	 * This method checks what column player X wants their X in
	 */
	public static void playerXcol(char[][] board, int row)
	{
		//instructions
		System.out.print("What column would you like to put your X in player X?");
		//looks for next int between 3 and 1
		int p1Input = (myReader.nextInt());
		if(p1Input > 3 || p1Input < 1)
		{
			//makes you try again
			System.out.print("This option is invalid, Try again");
			playerXRow(board);
		}
		
		else
		{
			board[row-1][p1Input-1] = 'X';
			boardMaker(board);
		}
	}
	/*
	 * This method checks for a tie
	 */
	public static String tieCheck() 
	{
		//Goes through the entire board side to side
		for(int i = 0; i <= board.length-1; i++)
		{
			//Goes through the entire board up and down
			for(int j = 0; j <= board.length-1; j++)
			{
				//Checks to see if there's still spaces and if the game isn't finished
				if(board[i][j] == ' ')
				{
					//This means the game isn't finished
					return "unfinished game";
				}
			}
		}
		//This is the result of a tie
		return "You both tied";
	}
	/*
	 * This method checks for three in a row
	 */
	public static boolean checkWin(char player)
	{
		//This goes through all three rows or columns
		for (int i = 0; i < 3; i++)
		{
			//This checks for anything straight across
			if(board[i][0] == player && board[i][1] == player && board[i][2] == player)
			{
				return true;
			}
			//This checks for anything that's up and down
			if(board[0][i] == player && board[1][i] == player && board[2][i] == player)
			{
				return true;
			}
		}
		//This checks for a diagonal angle to the right
		if(board[0][0] == player && board [1][1] == player && board[2][2] == player)
		{
			return true;
		}
		//This checks for a diagonal angle to the left
		if(board[0][2] == player && board [1][1] == player && board[2][0] == player)
		{
			//Winner!
			return true;
		}
		//Games not finished keep playing
		return false;
	}
}
