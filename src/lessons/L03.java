/*
 * This tutorial went over conditional statements and logical operators.
 * Much of the operators were glossed over because of their similarities to other languages.
 */

package lessons;

public class L03
{
	public static void main(String[] args)
	{
		int rand = (int)(Math.random() * 50);
		
		System.out.println("The random number is: " + rand);
		
		if(rand < 25)
		{
			System.out.println("The random number is less than 25");
		}
		else if(rand > 40)
		{
			System.out.println("The random number is greater than 40");
		}
		// This can never be true
		else if(rand == 18)
		{
			System.out.println("The random number is equal to 18");
		}
		// This is only true if range is 25-39
		else if(rand != 40)
		{
			System.out.println("The random number is not equal to 40");
		}
		// This can never be true
		else
		{
			System.out.println("The random number is totally random");
		}
	}
}
