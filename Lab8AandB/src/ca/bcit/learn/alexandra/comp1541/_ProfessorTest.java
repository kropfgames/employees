/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
class _ProfessorTest
{
	private Professor professorComputerScience;

	/**
	 *  
	 */
	@BeforeEach
	void setUp()
	{
		professorComputerScience = new Professor("computer science");
	}

	@Test
	void professorNameInConstructorShouldBeEinstein()
	{
		assertEquals("einstein", professorComputerScience.getName());
	}

	@Test
	void professorDressCodeShouldBeFancy()
	{
		assertEquals("fancy", professorComputerScience.getDressCode());
	}

	@Test
	void professorIsPaidSalaryShouldBeTrue()
	{
		assertEquals(true, professorComputerScience.isPaidSalary());
	}

	@Test
	void professorPostSecondaryEducationRequiredShouldBeTrue()
	{
		assertEquals(true, professorComputerScience.postSecondaryEducationRequired());
	}

	@Test
	void professorWorkVerbShouldBeTeach()
	{
		assertEquals("teach", professorComputerScience.getWorkVerb());
	}

	@Test
	void professorOverTimePayRateShouldBe2Point0()
	{
		assertEquals(2.0, professorComputerScience.getOverTimePayRate());
	}

	@Test
	void professorsWhoTeachesComputerScienceIsHigherThanOtherMajors()
	{
		Professor professorMath = new Professor("math");
		assertEquals(1, professorComputerScience.compareTo(professorMath));
	}

	@Test
	void sortMethodWillSortComputerScienceProfessorsFirst()
	{
		Professor	professorMath				= new Professor("math");
		Professor	professorComputerScience2	= new Professor("computer science");
		Professor	professorLogic				= new Professor("logic");
		Professor	professorComputerScience3	= new Professor("computer science");
		Professor	professorNetworks			= new Professor("networks");

		ArrayList<Professor> professors;
		professors = new ArrayList<Professor>();

		professors.add(professorMath);
		professors.add(professorComputerScience);
		professors.add(professorComputerScience2);
		professors.add(professorLogic);
		professors.add(professorComputerScience3);
		professors.add(professorNetworks);

		Collections.sort(professors);

		assertEquals("computer science", professors.get(4).toString());
	}

	@Test
	void shouldOverrideToStringToClassNameAndHoursPerWeekSpentWithKids()
	{
		assertEquals("\nProfessor with computer science major", professorComputerScience.toString());
	}

	@Test
	void equalsMethodShouldReturnTrueIfEqualMajors()
	{
		Professor professorComputerScience2;
		professorComputerScience2 = new Professor("computer science");

		assertEquals(true, professorComputerScience.equals(professorComputerScience2));
	}

}
