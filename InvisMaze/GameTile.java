/*
 *This whole class is basically
 *to help instantiate the
 *properties of the board
 *or maze that we are making
 */
public class GameTile 
{
	//This looks to see where the player is
	boolean hasPlayer;
	//This looks to see if a tile is visible
	boolean isRevealed;
	//This looks to see if there's a wall
	boolean isWall;
	
	
	public GameTile()
	{
		//This sets them to false
		hasPlayer = false;
		isRevealed = false;
		isWall = false;
	}
	
	/*
	 * This returns whether or not the player is here
	 */
	 public boolean getHP()
	 {
		 return hasPlayer;
	 }
	 /*
	  * This returns whether or not the tile is visible
	  */
	 public boolean getIR() 
	 {
		 return isRevealed;
	 }

	 /*
	  * This returns whether or not there is a wall
	  */
	 public boolean getIW()
	 {
		 return isWall;
	 }
	 /*
	  * This establishes the players chosen tile
	  */
	 public void setHP(boolean pos) 
	 {
		 hasPlayer = pos;
	 }

	 /*
	  * This establishes the next revealed tile
	  */
	 public void setIR(boolean show) 
	 {
		 isRevealed = show;
	 }

	 /*
	  * This makes a wall a wall lol 
	  * that sounds funny
	  */
	 public void setIW(boolean wall) 
	 {
		 isWall = wall;
	 }
	
	 /*
	  * This one was confusing because I had to 
	  * figure out what toString was for but I
	  * understand it now thanks to Keola. Lifesaver.
	  * Basically this method establishes the tiles 
	  * properties and what they represent
	  */
	public String toString()
	{
		//This is for the tiles that aren't seen yet
		if(!isRevealed)
		{
			return "?";
		}
		//This is to show where the player is currently at
		else if(hasPlayer)
		{
			return "i";
		}
		//This lets the player know there is a wall there
		else if(isWall)
		{
			return "X";
		}
		//This means that the tile is OK
		else
		{
			return "O";
		}
	}
}
