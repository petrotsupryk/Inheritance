
public class Manager extends Employee {
	/**
	 * @param n
	 *            ≥м€ сп≥вроб≥тника
	 * @param s
	 *            зарплата
	 * @param year
	 *            р≥к найму
	 * @param month
	 *            м≥с€ць найму
	 * @param day
	 *            день найму
	 */

	public Manager(String n, double s, int year, int month, int day) {
		super(n, s, year, month, day);
		bonus = 0;
	}

	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}

	private double bonus;
}
