/*
 * This tutorial goes over methods and fields as well as the scope of variables in classes and methods
 */

package lessons;

import java.util.Scanner;

public class L05
{
	static Scanner cin = new Scanner(System.in);
	
	static int randomNumber;
	
	public static void main(String[] args)
	{
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while(guessResult != -1)
		{
			System.out.println("Guess a number between 0 and 50:");
			randomGuess = cin.nextInt();
			
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yes the random number is " + randomGuess);

	}
	
	public static int getRandomNum()
	{
		randomNumber = (int)(Math.random() * 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess)
	{
		if(guess == randomNumber)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}

}
