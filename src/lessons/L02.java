package lessons;

import java.util.Scanner;

public class L02
{
	static Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Your favorite number: ");
		
		if(cin.hasNextInt())
		{
			int num = cin.nextInt();
			
			System.out.println("You've entered " + num);
			
			int twiceNum = num * 2;
			
			System.out.println(num + " + " + num + " = " + twiceNum);
		}
		else
		{
			System.out.println("Next time, enter an integer");
		}
	}
}
