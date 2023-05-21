/*
 * This tutorial goes over exceptions and exception handling
 */

package lessons;

import java.util.*;
import java.io.*;

public class L06
{
	
	static Scanner cin = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		divByZero(2);
		
		System.out.println("How old are you?");
		int age = validateAge();
		
		if(age != 0)
		{
			System.out.println("You are " + age + " years old");
		}
		
		getFile("./doesnotexist.jpg");
	}
	
	public static void divByZero(int a)
	{
		try
		{
			System.out.println(a / 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide by zero");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	public static int validateAge()
	{
		System.out.println("Input your age: ");
		try
		{
			return cin.nextInt();
		}
		catch(InputMismatchException e)
		{
			cin.next();
			System.out.println("Input is not an integer value");
			return validateAge();
		}
	}
	
	public static void getFile(String path)
	{
		try
		{
			FileInputStream file = new FileInputStream(path);
		}

		catch(Exception e)
		{
			System.out.println("Some error occurred");
		}
		finally
		{
			System.out.println("");
		}
		
		
	}
}