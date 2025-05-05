import java.util.Scanner;

/*
 * This entire thing is my invisible maze
 * that I will be using to play a silly 
 * game. It's nothing special but I tried my best
 * with a lot of assistance especially my
 * funny dumb friend Reiden.
 * We did it
 */
public class Invisible_Maze {
	//This is my scanner
	public static Scanner myReader = new Scanner (System.in);
	public static void main(String[] args) 
	{
		//This makes the board which is a 5x5 board
		GameTile[][] board = new GameTile[5][5];
		// This assigns the properties from my game tile class to the board
	    for (int i = 0; i < 5; i++) {
	        for (int j = 0; j < 5; j++) {
	            board[i][j] = new GameTile();
	        }
	    }
	    //This is my method used to make the board
	    boardMaker(board);  
	    //This is my method used to setup the walls
	    wallMakers(board);  
	    //This is my method used to show the tiles
	    revealTiles(board); 
	    //This is where the player starts the game at
	    int[] playerPos = {4,0};
	    board[4][0].setHP(true);  

	    //This is the number of turns a player gets
	    int max = 18;
	    //This determines if they win the game
	    boolean win = false;
	    
	    //This is the loop that goes through the turns
	    for(int turn = 1; turn <= max; turn++)
	    {
	    	//This prompts the player to move...
	    	System.out.print("Enter your move (Up, Down, Left, Right): ");
	    	//This is where my scanner reads their move
            String move = myReader.nextLine();
            //This will update the players movement
            posAndMovement(board, playerPos, move);
            //prints the new board
            boardMaker(board);
            //This checks to see if the player reaches the end
            if (playerPos[0] == 0 && playerPos[1] == 4) 
            {
            	//This prints a winning message
            	System.out.println("The end!");
            	//Makes the win end the game
            	win = true;
            	//This stops the game
            	break;
            }
	    }
	    //This closes the scanner
	    myReader.close();
     }
	
	/*
	 * This method will be making all of my walls on the 
	 * board that I need to make the invisible maze
	 */
	public static void wallMakers(GameTile[][] board)
	{
    //This sets my walls positions
    int[][] wall = 
    {{1, 1}, {2, 1}, {3, 1},
    {4, 1}, {0, 3}, {1, 3}, 
    {2, 3},{3, 3}};
    //This prints the walls
    for (int i = 0; i < wall.length; i++) 
    {
        int x = wall[i][0];
        int y = wall[i][1];
        board[x][y].setIW(true);
    }
	}
	
	/*
	 * This method will be used
	 * to reveal the tiles in the 
	 * maze that the player runs into
	 */
	public static void revealTiles(GameTile[][] board) 
	{
		//This reveals the rows
	    for (int i = 0; i < 5; i++) 
	    {
	    	//This reveals the columns
	        for (int j = 0; j < 5; j++) 
	        {
	        	//This reveals the tiles
	            board[i][j].setIR(true);
	        }
	    }
	}

	/*
	 * This method will be used
	 * to function the players
	 * movement so that they 
	 * can move up, down, left, and to the right
	 */
	public static void posAndMovement(GameTile[][] board, int[] playerPos, String move) 
	{
	    //These are my constructors and x is what row we're in
		//and y is what column we're in
		int x = playerPos[0];
	    int y = playerPos[1];
	    int newR = x;
	    int newC = y;

	    //This is the players movement
	    if (move.equals("Up")) newR--;
	    else if (move.equals("Down")) newR++; 
	    else if (move.equals("Left")) newC--; 
	    else if (move.equals("Right")) newC++; 
	    else {
	    	//Lets the player know they didn't put a valid direction
	        System.out.println("No this is not a direction try again");
	        //Try again
	        return;
	    }

	    // This makes sure the move is in bounds of the maze
	    if (newR < 0 || newR >= 5 || newC < 0 || newC >= 5) {
	    	//This lets the player know they are cheating lol
	        System.out.println("You can't move outside the maze!");
	        //Try again
	        return;
	    }

	    //This reveals the new tile at the newest position
	    GameTile next = board[newR][newC];
	    next.setIR(true); 

	    //This checks if the next tile is a wall
	    if (next.getIW()) 
	    {
	        //This lets the player know if it's a wall, they're dumb
	        System.out.println("Oops! That’s a wall. You can’t move there.");
	        //This reprints the board to try again
	        boardMaker(board);
	        //Try again baka
	        return;
	    }

	    //This checks if the next move is not a wall and if it isn't then move the player
	    board[x][y].setHP(false); 
	    next.setHP(true);

	    // This allows the player to change positions
	    playerPos[0] = newR;
	    playerPos[1] = newC;
	}
	/*
	 * This is the method
	 * that i'm using to make
	 * the game board or invisible
	 * maze I should say
	 */
	public static void boardMaker(GameTile[][] board) 
	{
		//This prints the rows
	    for (int i = 0; i < 5; i++) 
	    {
	    	//This prints the columns
	        for (int j = 0; j < 5; j++) 
	        {
	            System.out.print(board[i][j] + " ");
	        }
	        System.out.println();
	    }
	}


	}



