/*
@Justin Espiritu
CSC 262 OO Design & Programming II
Assignement 1: The Game of Nim
#The game of "Nim" is played with two players.  A game begins with 15 sticks laid out in a row.  
Players take turns removing sticks.  On your turn you must remove either one, two, or three sticks. 
The player who removes the last stick is the loser.
#NimGame class plays 1 game of NimGame
@Versions 1.1
*/
import java.util.Scanner;

public class NimGame
{
	private int HUMAN = 1, COMPUTER = 2;
	private int turn, winner, mode;

	Scanner scan = new Scanner();
	NumOfSticks sticks = new NumOfSticks();

	public void playGame(int turn, int mode)
	{	
		//this.turn = turn;

		int sticks = 0;
		
		//alternate turns between computer and human until game is finished
		do
		{
			if(turn == 1)
			{
				System.out.println("How many sticks would you like to take?");
				sticks = scan.nextInt();
				
				if(humanMove(sticks) == true)
				{
					//make sure that each turn through loop alternates player/computer's turn
					turn++;
					this.sticks.setSticks(this.sticks.getSticks() - sticks);
				}
				else
				{
					System.out.println("invalid number.  Please enter a number between 1 and 3");
				}
			}
			else
			{	
				//play against random computer
				if(mode == 1)
				{
					computerMove();
					turn--;
				}
				else
				{
					computerMoveWin();
					turn--;
				}
			}
		}while(this.sticks.getSticks() > 0);
		
		//display who won the game
		if(userWon() == true)
		{
			System.out.println("You Win");
		}
		System.out.println("You Lose");
	}

	//player's move
	public boolean humanMove(int move)
	{
		if(move < 1 || move > 3 || move > sticks.getSticks())
		{
			return false;
		}
		return true;
	}

	//Random Computer
	public void computerMove()
	{
		int move = 1 + (int)(Math.random() * 3);
		if(sticks.getSticks() < 3)
		{
			move = 1 + (int)(Math.random() * sticks.getSticks());
		}
		sticks.setSticks(sticks.getSticks() - move); 
	}

	//Winner Strategy Computer
	public void computerMoveWin()
	{
		int move = sticks.getSticks();
		do
		{
			move--;
		}while(move%4 == 0);
		sticks.setSticks(move);
	}

	public boolean userWon()
	{
		if(turn == 1)
		{
			return false;
		}
		return true;
	}
}