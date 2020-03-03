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
public class Professor extends Employee implements Comparable<Professor>
{

	private String teachingMajor;

	/**
	 * @param teachingMajor - the subject that the professor teaches 
	 * sets the name to "einstein" using super()
	 */
	public Professor(String teachingMajor)
	{
		super("einstein");
		setTeachingMajor(teachingMajor);
	}

	/**
	 * @return the teachingMajor of the professor 
	 */
	public String getTeachingMajor()
	{
		return teachingMajor;
	}

	/**
	 * @param teachingMajor the teachingMajor to set - cannot be empty or blank or null
	 */
	public void setTeachingMajor(String teachingMajor)
	{
		if (teachingMajor.isEmpty() || teachingMajor.equals(" "))
		{
			throw new IllegalArgumentException("teachingMajor cannot be empty or blank");
		} else if (teachingMajor == null)
		{
			throw new IllegalArgumentException("teachingMajor cannot be null");
		} else
		{
			this.teachingMajor = teachingMajor;
		}
	}

	/**
	 * @return "fancy" as the dress code 
	 */
	@Override
	public String getDressCode()
	{
		return "fancy";
	}

	/**  
	 * @return true because this type of employee is paid salary 
	 */
	@Override
	public boolean isPaidSalary()
	{
		return true;
	}

	/**
	 * @return true because post secondary education is required for this type of employee 
	 */
	@Override
	public boolean postSecondaryEducationRequired()
	{
		return true;
	}

	/**
	 * @return "teach" as the work verb 
	 */
	@Override
	public String getWorkVerb()
	{
		return "teach";
	}

	/**
	 * @return 2.0 as the overtime pay rate 
	 */
	@Override
	public double getOverTimePayRate()
	{
		return 2.0;
	}

	/**
	 * @return positive if this professor teaches computer science and the input professor does not
	 */
	@Override
	public int compareTo(Professor professor)
	{
		boolean	thisProfessorIsComputerScience;
		boolean	inputProfessorIsComputerScience;

		thisProfessorIsComputerScience	= false;
		inputProfessorIsComputerScience	= false;

		if (this.getTeachingMajor().equals("computer science"))
		{
			thisProfessorIsComputerScience = true;
		}

		if (professor == null)
		{
			throw new IllegalArgumentException("The input professor cannot be null.");
		} else if (professor.getTeachingMajor().equals("computer science"))
		{
			inputProfessorIsComputerScience = true;
		}

		if (thisProfessorIsComputerScience && inputProfessorIsComputerScience)
		{
			return 0;
		}

		else if (thisProfessorIsComputerScience)
		{
			return 1;
		}

		else if (inputProfessorIsComputerScience)
		{
			return -1;
		}

		else
		{
			return 0;
		}

	}

	/**
	 * make a list of professors, print, sort and print 
	 */
	public void printAndSortList()
	{
		Professor	professorMath				= new Professor("math");
		Professor	professorComputerScience2	= new Professor("computer science");
		Professor	professorLogic				= new Professor("logic");
		Professor	professorComputerScience3	= new Professor("computer science");
		Professor	professorNetworks			= new Professor("networks");

		ArrayList<Professor> professors;
		professors = new ArrayList<Professor>();

		professors.add(professorMath);
		professors.add(professorComputerScience2);
		professors.add(professorLogic);
		professors.add(professorComputerScience3);
		professors.add(professorNetworks);

		System.out.println("Before sorting: ");
		System.out.println(professors);

		Collections.sort(professors);

		System.out.println("After sorting: ");
		System.out.println(professors);

	}

	/**
	 * @return class name and major 
	 */
	@Override
	public String toString()
	{
		String	className;
		String	major;

		className	= this.getClass().getSimpleName();
		major		= this.getTeachingMajor();

		return "\n" + className + " with " + major + " major";
	}

	/**
	 * @return result depending on if the teaching major is null 
	 */
	@Override
	public int hashCode()
	{
		final int	prime	= 31;
		int			result	= 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	/**
	 * @return true if the teaching majors are equal 
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
		if (this.getTeachingMajor().equals(((Professor) obj).getTeachingMajor()))
		{
			return true;
		} else
		{
			return false;
		}

	}

}
