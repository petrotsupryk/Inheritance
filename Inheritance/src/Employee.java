import java.util.*;
import java.util.GregorianCalendar;

public class Employee {

	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;

		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	public Date getHireDay() {
		return hireDay;
	}

	private String name;
	private double salary;
	private Date hireDay;
}
