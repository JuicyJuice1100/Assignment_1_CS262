/*
Justin Espiritu
CSC 262 OO Design & Programming II
Assignement 1: The Game of Nim
The game of "Nim" is played with two players.  A game begins with 15 sticks laid out in a row.  
Players take turns removing sticks.  On your turn you must remove either one, two, or three sticks. 
The player who removes the last stick is the loser.
Versions 1.0
*/

import java.util.Scanner;

//represents one game of Nim in progress
public class NimGame
{	
	//variables
	private int sticks, turn, winner;
	private static int human = 1, computer = 2;

	//creating a method for a random number
	private Random rand = new Random();

	//progresses the game until completion
	public void playGame(int first)
	{
		turn = first;
		//repeat game until done
		do
		{
			if(turn%2 == human)
			{
				if(humanMove() == true)
				{
					turn += 1;
				}

				//if invalid force player to pick a legal move
				else
				{
					System.out.println("Invalid move.  Please input a number between 1-3.")
				}
			}
			else
			{
				computerMove();
				first += 1;
			}
		} while(sticks > 0)
		
		//declare winner 1 = human 2 = computer
		if(userWon() == true)
		{
			winner = 1;
		}
		else
		{
			winner = 2;
		}
	}

	//checks to see if the player made a legal move
	public boolean humanMove(int sticksTaken)
	{	
		if(sticksTaken > 3)
		{	
			return false;
		}
		sticks = sticks - sticksTaken;
		return true;
	}

	//makes the computer make a move
	public int computerMove()
	{
		//makes computer make a random move
		int sticksTaken = 1 + (int)(Math.random() * 3);
		sticks = sticks - sticksTaken;
		return sticksTaken;
	}

	//who won computer or player?
	public boolean userWon()
	{
		if(turn%2 == human)
		{
			return true;
		}
		return false;
	}
}

//represents a series of Nim games
public class NimMatch
{
	private int humanScore, computerScore, gameNumber;
	private Scanner scan = new Scanner();

	//repeatedly plays the game and updates overall score
	public playMatch()
	{
		int playAgain = 1;
		do
		{
			//play a single game
			NimGame();

			//ask if user wants to play again
			System.out.println("Do you want to play again (1 = yes 2 = no)")
			playAgain = scan.nextInt();
		}while(playAgain == 1)
	}

	//updates overall score
	public void updateScores()
	{
		if(NimGame.userWon() == true)
		{
			humanScore += 1;	
		} 
		else
		{
			computerScore += 1
		}
	}

	//displays current score
	public String reportScores()
	{
		return ("Player = " + humanScore + "Computer = " + computerScore)
	}
}