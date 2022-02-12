package prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> listOfEmployee) {
		double sumOfUpdatedBalance = 0.0;
		
		for(Employee employee: listOfEmployee) {
			sumOfUpdatedBalance =sumOfUpdatedBalance+ employee.computeUpdatedBalanceSum();
		}
		return sumOfUpdatedBalance;
	}
}
