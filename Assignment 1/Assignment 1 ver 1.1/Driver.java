/*
@Justin Espiritu
CSC 262 OO Design & Programming II
Assignement 1: The Game of Nim
#The game of "Nim" is played with two players.  A game begins with 15 sticks laid out in a row.  
Players take turns removing sticks.  On your turn you must remove either one, two, or three sticks. 
The player who removes the last stick is the loser.
#Driver for the to play NimGame
@Versions 1.1
*/

import java.util.Scanner;

public class Driver
{
	public static void main(Strings[] args)
	{
		int turn = 0, mode = 0;

		Scanner scan = new Scanner();
		NimGame game = new NimGame();

		System.out.println("Would you like to go first or let the computer start? (1 = Player, 2 = Computer)");
		turn = scan.nextInt();
		
		//Ask again if invalid input
		if(turn != 1 || turn != 2)
		{
			//repeat until given a valid input
			do
			{
				System.out.println("Please enter a valid input.  (1 = Player, 2 = Computer)");
				turn = scan.nextInt();
			}while(turn != 1 || turn != 2);
		}

		System.outprintln("What computer would you like to play against?  (1 = Random Computer, 2 = Winning Strategy Computer)");

		//Ask again if invalid input
		if(mode != 1 || mode != 2)
		{
			//repeat until given a valid input
			do
			{
			System.out.println("Please enter a valid input. (1 = Random Computer, 2 = Winning Strategy Computer)");
			mode = scan.nextInt();
			}while(mode != 1 || mode != 2);
		}
		game.playGame(turn, mode);
	}
}