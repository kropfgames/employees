/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
class _HockeyPlayerTest
{
	private HockeyPlayer	playerWith1Goal;
	private HockeyPlayer	playerWith0Goals;

	/**
	 *  
	 */
	@BeforeEach
	void setUp()
	{
		playerWith1Goal		= new HockeyPlayer(1);
		playerWith0Goals	= new HockeyPlayer(0);
	}

	@Test
	void hockeyPlayerWith1GoalIsBiggerThanHockeyPlayerWith0Goals()
	{
		assertEquals(1, playerWith1Goal.compareTo(playerWith0Goals));
	}

	@Test
	void shouldOverrideToStringToDisplayClassNameAndGoals()
	{
		assertEquals("\nHockeyPlayer with 1 goal(s)", playerWith1Goal.toString());
	}

	@Test
	void equalsMethodShouldReturnTrueIfScoredSameNumberOfGoals()
	{
		HockeyPlayer player2With1Goal;

		player2With1Goal = new HockeyPlayer(1);

		assertEquals(true, playerWith1Goal.equals(player2With1Goal));
	}

}
