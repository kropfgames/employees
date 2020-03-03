/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
public class Parent extends Employee implements Comparable<Parent>
{
	private int numberOfHouseSpentPerWeekWithKids;

	/**
	 * @param numberOfHouseSpentPerWeekWithKids by the parent 
	 */
	public Parent(int numberOfHouseSpentPerWeekWithKids)
	{
		super("mother");
		setNumberOfHouseSpentPerWeekWithKids(numberOfHouseSpentPerWeekWithKids);
	}

	/**
	 * @return the numberOfHouseSpentPerWeekWithKids by the parent 
	 */
	public int getNumberOfHouseSpentPerWeekWithKids()
	{
		return numberOfHouseSpentPerWeekWithKids;
	}

	/**
	 * @param numberOfHouseSpentPerWeekWithKids the numberOfHouseSpentPerWeekWithKids to set - cannot be negative
	 */
	public void setNumberOfHouseSpentPerWeekWithKids(int numberOfHouseSpentPerWeekWithKids)
	{
		if (numberOfHouseSpentPerWeekWithKids < 0)
		{
			throw new IllegalArgumentException("numberOfHouseSpentPerWeekWithKids cannot be negative");
		} else
		{
			this.numberOfHouseSpentPerWeekWithKids = numberOfHouseSpentPerWeekWithKids;
		}
	}

	/**
	 * @return -2.0 as the overtime pay rate 
	 */
	@Override
	public double getOverTimePayRate()
	{
		return -2.0;
	}

	/**
	 * @return "anything" as the dress code 
	 */
	@Override
	public String getDressCode()
	{
		return "anything";
	}

	/**
	 * @return "care" as the work verb
	 */
	@Override
	public String getWorkVerb()
	{
		return "care";
	}

	/**
	 * @return false because this type of employee is not paid 
	 */
	@Override
	public boolean getsPaid()
	{
		return false;
	}

	/**
	 * @return positive if this parnet spends more hours per week with kids than the input parent 
	 */
	@Override
	public int compareTo(Parent parent)
	{
		if (parent == null)
		{
			throw new IllegalArgumentException("The input parent cannot be null.");
		}
		return this.getNumberOfHouseSpentPerWeekWithKids() - parent.getNumberOfHouseSpentPerWeekWithKids();
	}

	/**
	 * make a list of parents, print, sort and print
	 */
	public void printAndSortList()
	{
		Parent	parentWith10HoursSpentPerWeekWithKids;
		Parent	parentWith20HoursSpentPerWeekWithKids;
		Parent	parentWith30HoursSpentPerWeekWithKids;

		parentWith10HoursSpentPerWeekWithKids	= new Parent(10);
		parentWith20HoursSpentPerWeekWithKids	= new Parent(20);
		parentWith30HoursSpentPerWeekWithKids	= new Parent(30);

		ArrayList<Parent> parents;
		parents = new ArrayList<Parent>();

		parents.add(parentWith30HoursSpentPerWeekWithKids);
		parents.add(parentWith20HoursSpentPerWeekWithKids);
		parents.add(parentWith10HoursSpentPerWeekWithKids);

		System.out.println("Before sorting: ");
		System.out.println(parents);

		Collections.sort(parents);

		System.out.println("After sorting: ");
		System.out.println(parents);

	}

	/**
	 * @return class name and hours spent with kids 
	 */
	@Override
	public String toString()
	{
		String	className;
		int		hours;

		className	= this.getClass().getSimpleName();
		hours		= this.getNumberOfHouseSpentPerWeekWithKids();

		return "\n" + className + " with " + hours + " hours per week spent with kids";
	}

	/**
	 * @return result based on number of hours per week spent with kids 
	 */
	@Override
	public int hashCode()
	{
		final int	prime	= 31;
		int			result	= 1;
		result = prime * result + numberOfHouseSpentPerWeekWithKids;
		return result;
	}

	/**
	 * @return true if hours spent with kids per week is equal 
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
		if (this.getNumberOfHouseSpentPerWeekWithKids() == ((Parent) obj).getNumberOfHouseSpentPerWeekWithKids())
		{
			return true;
		} else
		{
			return false;
		}

	}

}
