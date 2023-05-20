/*
 * This tutorial goes over looping.
 */

package lessons;

import java.util.Scanner;

public class L04
{
	static Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int i = 1;
		
		while(i <= 20)
		{
			if(i == 3)
			{
				i++;
				continue;
			}
			
			if(i > 10) {break;}
			
			System.out.println(i++);
		}
		
		String input = "Y";
		
		int j = 1;
		
		while(input.equalsIgnoreCase("y"))
		{
			System.out.println(j++);
			System.out.println("Continue? Y / N");
			input = cin.nextLine();
		}
		
		int k = 10;
		
		do
		{
			System.out.println(k++);
		}while(k < 10);
		
		
		for(int l = 10; l > 0; l--)
		{
			System.out.println(l);
		}
		
		int m, n;
		
		for(m = 2, n = 3; m <= 20; n += 2)
		{
			System.out.println(m * n);
			m = n - 1;
		}
	}
}
