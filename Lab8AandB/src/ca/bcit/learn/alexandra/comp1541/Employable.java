/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

/**
 * @author  Alexandra Kropova
 * @version Feb. 28, 2020
 */
public interface Employable
{

	public String getDressCode();

	public boolean isPaidSalary();

	public boolean postSecondaryEducationRequired();

	public String getWorkVerb();

	/*
	 * @return true if the employable object gets paid 
	 */
	default public boolean getsPaid()
	{
		return true;
	}

}
