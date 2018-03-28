
public class Manager extends Employee {
	/**
	 * @param n
	 *            ��� �����������
	 * @param s
	 *            ��������
	 * @param year
	 *            �� �����
	 * @param month
	 *            ����� �����
	 * @param day
	 *            ���� �����
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
