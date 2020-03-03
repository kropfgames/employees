/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>
{
	private double numberOfDollarsStolenPerDay;

	/**
	 * @param numberOfDollarsStolenPerDay by the employee
	 * Calls setter to set numberOfDollarsStolenPerDay 
	 */
	public GasStationAttendant(double numberOfDollarsStolenPerDay)
	{
		super("smith");
		setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
	}

	/**
	 * @return the numberOfDollarsStolenPerDay by employee 
	 */
	public double getNumberOfDollarsStolenPerDay()
	{
		return numberOfDollarsStolenPerDay;
	}

	/**
	 * @param numberOfDollarsStolenPerDay the numberOfDollarsStolenPerDay to set - cannot be negative
	 */
	public void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay)
	{
		if (numberOfDollarsStolenPerDay < 0)
		{
			throw new IllegalArgumentException("numberOfDollarsStolenPerDay canot be null");
		} else
		{
			this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
		}
	}

	/**
	 * @return 1.5 as the overtime pay rate 
	 */
	@Override
	public double getOverTimePayRate()
	{
		return 1.5;
	}

	/**
	 *@return "uniform" as the dress code 
	 */
	@Override
	public String getDressCode()
	{
		return "uniform";
	}

	/**
	 *@return "pump" as the work verb 
	 */
	@Override
	public String getWorkVerb()
	{
		return "pump";
	}

	/**
	 * @param gasStationAttendant - the attendant to compare against this attendant 
	 *@return positive if the current attendant stole more dollars than the input attendant 
	 */
	@Override
	public int compareTo(GasStationAttendant gasStationAttendant)
	{
		if (gasStationAttendant == null)
		{
			throw new IllegalArgumentException("The input gasStationAttendant cannot be null.");
		}
		else
		{
			return (int) (this.getNumberOfDollarsStolenPerDay() - gasStationAttendant.getNumberOfDollarsStolenPerDay());
		}
	}

	/**
	 * Makes an array list, prints, sorts, and prints
	 */
	public void printAndSortList()
	{
		GasStationAttendant	gasStationAttendantStole10;
		GasStationAttendant	gasStationAttendantStole20;
		GasStationAttendant	gasStationAttendantStole30;

		gasStationAttendantStole10	= new GasStationAttendant(10);
		gasStationAttendantStole20	= new GasStationAttendant(20);
		gasStationAttendantStole30	= new GasStationAttendant(30);

		ArrayList<GasStationAttendant> attendants;
		attendants = new ArrayList<GasStationAttendant>();

		attendants.add(gasStationAttendantStole30);
		attendants.add(gasStationAttendantStole20);
		attendants.add(gasStationAttendantStole10);

		System.out.println("Before sorting attendants: ");
		System.out.println(attendants);

		Collections.sort(attendants);

		System.out.println("After sorting attendants: ");
		System.out.println(attendants);

	}

	/**
	 * @return the class name and dollars stolen per day
	 */
	@Override
	public String toString()
	{
		String	className;
		double	dollarsStolenPerDay;

		className			= this.getClass().getSimpleName();
		dollarsStolenPerDay	= this.getNumberOfDollarsStolenPerDay();

		return "\n" + className + " with " + dollarsStolenPerDay + " dollars stolen per day";
	}

	/**
	 * @return result - based on number of dollars stolen per day 
	 */
	@Override
	public int hashCode()
	{
		final int	prime	= 31;
		int			result	= 1;
		long		temp;
		temp	= Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result	= prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/**
	 * @return true if equal dollars stolen per day 
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
		if (this.getNumberOfDollarsStolenPerDay() == ((GasStationAttendant) obj).getNumberOfDollarsStolenPerDay())
		{
			return true;
		} else
		{
			return false;
		}

	}

}
