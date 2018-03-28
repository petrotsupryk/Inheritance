//import java.util.*;

public class ManagerTest {

	public static void main(String[] args) {
		// create a new object
		Manager boss = new Manager("Petro Tsupryk", 12000, 2016, 10, 1);
		boss.setBonus(5000);

		Employee[] staff = new Employee[3];

		// filling the array staff of objects Manager and Employee
		staff[0] = boss;
		staff[1] = new Employee("Trotsyuk Roman", 10000, 2013, 12, 5);
		staff[2] = new Employee("Oksana Sheremeta", 4000, 2014, 5, 22);

		// Extract information about all Employee objects
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ", salary= " + e.getSalary());
	}

}
