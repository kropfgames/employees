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
class _ParentTest
{
	private Parent parentSpends5HoursPerWeekWithKid;

	/**
	 *  
	 */
	@BeforeEach
	void setUp()
	{
		parentSpends5HoursPerWeekWithKid = new Parent(5);
	}

	@Test
	void parentDressCodeShouldBeAnything()
	{
		assertEquals("anything", parentSpends5HoursPerWeekWithKid.getDressCode());
	}

	@Test
	void parentIsPaidSalaryShouldReturnFalse()
	{
		assertEquals(false, parentSpends5HoursPerWeekWithKid.isPaidSalary());
	}

	@Test
	void parentPostSecondaryEducationShouldNotBeRequired()
	{
		assertEquals(false, parentSpends5HoursPerWeekWithKid.postSecondaryEducationRequired());
	}

	@Test
	void parentGetWorkVerbShouldReturnCare()
	{
		assertEquals("care", parentSpends5HoursPerWeekWithKid.getWorkVerb());
	}

	@Test
	void parentGetOverTimePayRateShouldBeNegative2Point0()
	{
		assertEquals(-2.0, parentSpends5HoursPerWeekWithKid.getOverTimePayRate());
	}

	@Test
	void parentShouldOverrideGetsPaidToReturnFalse()
	{
		assertEquals(false, parentSpends5HoursPerWeekWithKid.getsPaid());
	}

	@Test
	void firstParentInSortedListShouldBeWithLeastHoursSpentWithKids()
	{
		Parent	parentSpends10Hours;
		Parent	parentSpends20Hours;
		Parent	parentSpends30Hours;

		parentSpends10Hours	= new Parent(10);
		parentSpends20Hours	= new Parent(20);
		parentSpends30Hours	= new Parent(30);

		ArrayList<Parent> parents;
		parents = new ArrayList<Parent>();

		parents.add(parentSpends30Hours);
		parents.add(parentSpends20Hours);
		parents.add(parentSpends10Hours);

		Collections.sort(parents);

		assertEquals(10, parents.get(0).getNumberOfHouseSpentPerWeekWithKids());
	}

	@Test
	void shouldOverrideToStringToClassNameAndHoursPerWeekSpentWithKids()
	{
		assertEquals("\nParent with 5 hours per week spent with kids", parentSpends5HoursPerWeekWithKid.toString());
	}

	@Test
	void equalsMethodShouldReturnTrueIfEqualHoursSpentPerWeekWithKids()
	{
		Parent parent2Spends5HoursPerWeekWithKid;
		parent2Spends5HoursPerWeekWithKid = new Parent(5);

		assertEquals(true, parentSpends5HoursPerWeekWithKid.equals(parent2Spends5HoursPerWeekWithKid));
	}

}
