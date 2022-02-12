package prob4C;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double sumOfBalance = 0.0;
		for (Employee employee : list) {
			employee.print(1, 2021);
			sumOfBalance += employee.calcGrossPay(1, 2021);

		}
		return sumOfBalance;
	}
}
