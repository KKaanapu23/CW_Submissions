/*
 * This whole thing is just the
 * players class and sets and
 * gets his position as it should
 */
public class Player_Tutorial 
{
	//The row the player is in
	int rPos;
	//The column they're in
	int cPos;
	

	/*
	 * This establishes the first position
	 */
	public void Player()
	{
		rPos = 0;
		cPos = 0;
				
	}
	
	/*
	 * this starts us off at given position for the X coordinate
	 */
	public int[] getXPos()
	{
		int[] Xpos = {rPos, cPos};
		return Xpos;
	}
	
	/*
	 * This changes our X position
	 * or the row position I mean
	 */
	public void setX(int newX)
	{
		rPos = newX;
	}

	/*
	 * This gets the current Y position
	 */
	public int[] getYPos()
	{
		int[] Ypos = {rPos, cPos};
		return Ypos;
	}
	/*
	 * This changes our Y postion/ row position
	 */
	public void setY(int newY)
	{
		cPos = newY;
	}
	
}
