/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
public class Main
{

	/**
	 * @param args 
	 * prints and sorts lists created in four different employee types 
	 */
	public static void main(String[] args)
	{
		GasStationAttendant	attendant;
		HockeyPlayer		player;
		Parent				parent;
		Professor			professor;

		attendant	= new GasStationAttendant(0);
		player		= new HockeyPlayer(0);
		parent		= new Parent(0);
		professor	= new Professor("computer science");

		attendant.printAndSortList();
		player.printAndSortList();
		parent.printAndSortList();
		professor.printAndSortList();

	}

}
