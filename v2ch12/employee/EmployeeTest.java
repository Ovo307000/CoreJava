/**
 * @author Cay Horstmann
 * @version 1.11 2018-05-01
 */

public class EmployeeTest
{
	public static void main(String[] args)
	{
		var staff = new Employee[3];

		staff[0] = new Employee("Harry Hacker", 35000);
		staff[1] = new Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tony Tester", 38000);

		for (Employee e : staff)
			e.raiseSalary(5);
		for (Employee e : staff)
			e.print();
	}
}
