/*
@Justin Espiritu
CSC 262 OO Design & Programming II
Assignement 1: The Game of Nim
#The game of "Nim" is played with two players.  A game begins with 15 sticks laid out in a row.  
Players take turns removing sticks.  On your turn you must remove either one, two, or three sticks. 
The player who removes the last stick is the loser.
#NumOfSticks keeps track of how many sticks are left over
@Versions 1.1
*/
public class NumOfSticks
{
	int sticks;

	public int getSticks()
	{
		return sticks;
	}

	public void setSticks(int sticks)
	{
		this.sticks = sticks;
	}
}

