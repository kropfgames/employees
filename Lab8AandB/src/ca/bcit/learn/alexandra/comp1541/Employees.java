/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

import java.util.ArrayList;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
public class Employees
{
	private ArrayList<Employee> employees;

	public static final int	NUMBER_OF_GOALS_BY_WAYNEGRETZKY	= 894;
	public static final int	NUMBER_OF_GOALS_BY_BRENTGRETZKY	= 1;
	public static final int	NUMBER_OF_GOALS_BY_PAVELBURE	= 437;

	public static final int	NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_TIGERWOODS	= 1;
	public static final int	NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_SUPERMOM	= 168;
	public static final int	NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_LAZYLARRY	= 20;
	public static final int	NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_EXHAUSTED	= 168;
	public static final int	NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_SUPERDAD	= 167;

	public static final int	NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_JOESMITH			= 10;
	public static final int	NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_TONYBALONEY			= 100;
	public static final int	NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_BENJAMINFRANKLIN	= 100;
	public static final int	NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_MARYFAIRY			= 101;
	public static final int	NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_BEESEE				= 1;
	
	/**
	 * Creates an array list and sets it to the instance variable employees 
	 */
	public Employees()
	{
		// creates an array list to be sent into setEmployees()
		ArrayList<Employee> employeesList;
		employeesList = new ArrayList<Employee>();

		HockeyPlayer	wayneGretzky;
		HockeyPlayer	whoEver;
		HockeyPlayer	brentGretzky;
		HockeyPlayer	pavelBure;
		HockeyPlayer	jasonHarrison;

		Professor	albertEinstein;
		Professor	professorJasonHarrison;
		Professor	richardFeynman;
		Professor	bCITInstructor;
		Professor	kurtGodel;

		Parent	tigerWoods;
		Parent	superMom;
		Parent	lazyLarry;
		Parent	exHausted;
		Parent	superDad;

		GasStationAttendant	joeSmith;
		GasStationAttendant	tonyBaloney;
		GasStationAttendant	benjaminFranklin;
		GasStationAttendant	maryFairy;
		GasStationAttendant	beeSee;

		wayneGretzky	= new HockeyPlayer(NUMBER_OF_GOALS_BY_WAYNEGRETZKY);
		whoEver			= new HockeyPlayer(0);
		brentGretzky	= new HockeyPlayer(NUMBER_OF_GOALS_BY_BRENTGRETZKY);
		pavelBure		= new HockeyPlayer(NUMBER_OF_GOALS_BY_PAVELBURE);
		jasonHarrison	= new HockeyPlayer(0);

		albertEinstein			= new Professor("physics");
		professorJasonHarrison	= new Professor("computer systems");
		richardFeynman			= new Professor("physics");
		bCITInstructor			= new Professor("computer systems");
		kurtGodel				= new Professor("logic");

		tigerWoods	= new Parent(NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_TIGERWOODS);
		superMom	= new Parent(NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_SUPERMOM);
		lazyLarry	= new Parent(NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_LAZYLARRY);
		exHausted	= new Parent(NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_EXHAUSTED);
		superDad	= new Parent(NUMBER_OF_HOURS_PER_WEEK_SPENT_WITH_KIDS_BY_SUPERDAD);

		joeSmith			= new GasStationAttendant(NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_JOESMITH);
		tonyBaloney			= new GasStationAttendant(NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_TONYBALONEY);
		benjaminFranklin	= new GasStationAttendant(NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_BENJAMINFRANKLIN);
		maryFairy			= new GasStationAttendant(NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_MARYFAIRY);
		beeSee				= new GasStationAttendant(NUMBER_OF_DOLLARS_STOLEN_PER_DAY_BY_BEESEE);



		employeesList.add(wayneGretzky);
		employeesList.add(whoEver);
		employeesList.add(brentGretzky);
		employeesList.add(pavelBure);
		employeesList.add(jasonHarrison);

		employeesList.add(albertEinstein);
		employeesList.add(professorJasonHarrison);
		employeesList.add(richardFeynman);
		employeesList.add(bCITInstructor);
		employeesList.add(kurtGodel);

		employeesList.add(tigerWoods);
		employeesList.add(superMom);
		employeesList.add(lazyLarry);
		employeesList.add(exHausted);
		employeesList.add(superDad);

		employeesList.add(joeSmith);
		employeesList.add(tonyBaloney);
		employeesList.add(benjaminFranklin);
		employeesList.add(maryFairy);
		employeesList.add(beeSee);

		setEmployees(employeesList);
	}

	/**
	 * @return employees, an array list of employees 
	 */
	public ArrayList<Employee> getEmployees()
	{
		return employees;
	}

	/**
	 * @param employees array list - cannot be null 
	 */
	public void setEmployees(ArrayList<Employee> employees)
	{
		if (employees == null)
		{
			throw new IllegalArgumentException("Employees cannot be null.");
		} else
		{
			this.employees = employees;
		}
	}

}
