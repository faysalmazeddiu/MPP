package prob4E;

import java.util.*;

public class Employee {
	
	private List<Account> accountList = new ArrayList<>();
	private String name;
	
	public Employee(String nameParam) {
		this.name = nameParam;
	}
	public String getName() {
		return name;
	}
	
	public double computeUpdatedBalanceSum() {
		double sumOfUpdatedBalance = 0.0;
		for(Account a : accountList) {
			sumOfUpdatedBalance =sumOfUpdatedBalance+ a.computeUpdatedBalance();
		}
		return sumOfUpdatedBalance;
	}
	
	public void addAccount(Account accountParam)  {
		if(accountParam == null) {
			return;
		} 
		accountList.add(accountParam);
	}
	
}


