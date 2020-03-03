/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
public abstract class Employee implements Employable
{

	private String name;

	/**
	 * @param name set by the child object's to the name of the employee
	 */
	public Employee(String name)
	{
		setName(name);
	}

	public abstract double getOverTimePayRate();

	/**
	 * @return null - set in child
	 */
	@Override
	public String getDressCode()
	{
		return null;
	}

	/**
	 * @return false if employee is not paid salary
	 */	
	@Override
	public boolean isPaidSalary()
	{
		return false;
	}

	/**
	 * @return false if post secondary education is not required for the job 
	 */
	@Override
	public boolean postSecondaryEducationRequired()
	{
		return false;
	}

	/**
	 * @return null - set in child
	 */
	@Override
	public String getWorkVerb()
	{
		return null;
	}

	/**
	 * @return the name of the employee 
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set - cannot be empty, blank or null
	 */
	public void setName(String name)
	{
		if (name.isEmpty() || name.equals(" "))
		{
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		else if (name == null)
		{
			throw new IllegalArgumentException("Name cannot be null.");
		}
		else
		{
			this.name = name;
		}
	}

}
