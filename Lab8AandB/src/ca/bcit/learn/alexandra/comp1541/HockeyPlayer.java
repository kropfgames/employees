/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author  Alexandra Kropova
 * @version Feb. 28, 2020
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>
{
	private int numberOfGoals;

	/**
	 * @param numberOfGoals scored by the player
	 * sets the name of the employee with super()
	 */
	public HockeyPlayer(int numberOfGoals)
	{
		super("gretzky");
		setNumberOfGoals(numberOfGoals);
	}

	/**
	 * @return 0 
	 */
	@Override
	public double getOverTimePayRate()
	{
		return 0;
	}

	/**
	 * @return the numberOfGoals scored 
	 */
	public int getNumberOfGoals()
	{
		return numberOfGoals;
	}

	/**
	 * @param numberOfGoals the numberOfGoals to set - cannot be negative
	 */
	public void setNumberOfGoals(int numberOfGoals)
	{
		if (numberOfGoals < 0)
		{
			throw new IllegalArgumentException("numberOfGoals cannot be negative");
		} else
		{
			this.numberOfGoals = numberOfGoals;
		}
	}

	/**
	 * @return "jersey" as the dress code 
	 */
	@Override
	public String getDressCode()
	{
		return "jersey";
	}

	/**
	 * @return true because is paid salary 
	 */
	@Override
	public boolean isPaidSalary()
	{
		return true;
	}

	/**
	 * @return false because post secondary education not required 
	 */
	@Override
	public boolean postSecondaryEducationRequired()
	{
		return false;
	}

	/**
	 * @return "play" as the work verb 
	 */
	@Override
	public String getWorkVerb()
	{
		return "play";
	}

	/**
	 * @return positive if this player has more goals than the input player 
	 */
	@Override
	public int compareTo(HockeyPlayer hockeyPlayer)
	{
		if (hockeyPlayer == null)
		{
			throw new IllegalArgumentException("The input hockey player cannot be null.");
		}
		else
		{
			return (this.getNumberOfGoals() - hockeyPlayer.getNumberOfGoals());
		}
	}

	/**
	 * make list, print, sort, and print
	 */
	public void printAndSortList()
	{
		HockeyPlayer	playerWith10Goals;
		HockeyPlayer	playerWith20Goals;
		HockeyPlayer	playerWith30Goals;

		playerWith10Goals	= new HockeyPlayer(10);
		playerWith20Goals	= new HockeyPlayer(20);
		playerWith30Goals	= new HockeyPlayer(30);

		ArrayList<HockeyPlayer> players;
		players = new ArrayList<HockeyPlayer>();

		players.add(playerWith30Goals);
		players.add(playerWith20Goals);
		players.add(playerWith10Goals);

		System.out.println("Before sorting: ");
		System.out.println(players);

		Collections.sort(players);

		System.out.println("After sorting: ");
		System.out.println(players);

	}

	/**
	 * @return class name and goals scored 
	 */
	@Override
	public String toString()
	{
		String	className;
		int		goals;

		className	= this.getClass().getSimpleName();
		goals		= this.getNumberOfGoals();

		return "\n" + className + " with " + goals + " goal(s)";
	}

	/**
	 * @return result based on number of goals 
	 */
	@Override
	public int hashCode()
	{
		final int	prime	= 31;
		int			result	= 1;
		result = prime * result + numberOfGoals;
		return result;
	}

	/**
	 * @return true if equal number of goals scored 
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (this.getNumberOfGoals() == ((HockeyPlayer) obj).getNumberOfGoals())
		{
			return true;
		} else
		{
			return false;
		}

	}

}
