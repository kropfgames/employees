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
class _GasStationAttendantTest
{
	private GasStationAttendant gasStationAttendantStole5;

	/**
	 *  
	 */
	@BeforeEach
	void setUp()
	{
		gasStationAttendantStole5 = new GasStationAttendant(5);
	}

	@Test
	void gasStationAttendantGetDressCodeShouldReturnUniform()
	{
		assertEquals("uniform", gasStationAttendantStole5.getDressCode());
	}

	@Test
	void gasStationAttendantIsPaidSalaryShouldBeTrue()
	{
		assertEquals(false, gasStationAttendantStole5.isPaidSalary());
	}

	@Test
	void gasStationAttendantPostSecondaryEducationRequiredShouldBeFalse()
	{
		assertEquals(false, gasStationAttendantStole5.postSecondaryEducationRequired());
	}

	@Test
	void gasStationAttendantGetWorkVerbShouldReturnPump()
	{
		assertEquals("pump", gasStationAttendantStole5.getWorkVerb());
	}

	@Test
	void firstGasStationAttendantInListShouldHaveLeastDollarsStolenPerDay()
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

		Collections.sort(attendants);

		assertEquals(10, attendants.get(0).getNumberOfDollarsStolenPerDay());
	}

	@Test
	void shouldOverrideToStringToDisplayClassNameAndDollarsStolenPerDay()
	{
		assertEquals("\nGasStationAttendant with 5.0 dollars stolen per day", gasStationAttendantStole5.toString());
	}

	@Test
	void equalsMethodShouldReturnTrueIfSameDollarsStolenPerDay()
	{
		GasStationAttendant gasStationAttendant2Stole5;

		gasStationAttendant2Stole5 = new GasStationAttendant(5);

		assertEquals(true, gasStationAttendantStole5.equals(gasStationAttendant2Stole5));
	}

}
