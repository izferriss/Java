/*
 * This tutorial touches upon classes and OOP
 */

package lessons;

public class L07
{
	public static void main(String[] args)
	{
		Monster carl = new Monster("Frank", 20, 20, 20);
		Monster blank = new Monster();
		System.out.println(carl.getName());
		System.out.println(blank.getName());
		carl.name = "Carl";
		System.out.println(carl.getName());
	}
}
// a file cannot contain more than one public class
class Monster
{
	public final String TOMBSTONE = "Here lies a dead monster";
	
	private int health;
	private int attack;
	private int speed;
	private int xpos = 0;
	private int ypos = 0;
	private boolean alive = true;
	
	public String name;
	
	// constructor
	public Monster(String name, int health, int attack, int speed)
	{
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.speed = speed;
	}
	
	public Monster()
	{
		this.name = "Monster";
		this.health = 500;
		this.attack = 20;
		this.speed = 1;
	}
	
	// accessors
	public int getAttack()
	{
		return this.attack;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
		if(this.health <= 0)
		{
			this.alive = false;
		}
	}
	
	public void setHealth(double health)
	{
		this.health = (int)health;
		if(this.health < 0)
		{
			this.alive = false;
		}
	}
}
