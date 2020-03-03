/**
 * 
 */
package ca.bcit.learn.alexandra.comp1541;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author  Alexandra Kropova
 * @version Mar. 1, 2020
 */
class _EmployeesTest
{
	private Employees employees;

	/**
	 *  
	 */
	@BeforeEach
	void setUp()
	{
		employees = new Employees();
	}

	@Test
	void employeesArrayListShouldHaveSize20()
	{
		ArrayList<Employee> employeesList = employees.getEmployees();
		assertEquals(20, employeesList.size());
	}

}
