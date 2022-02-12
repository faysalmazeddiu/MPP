package prob4E;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String accounttId;
	
	
	
	public SavingsAccount(String accounttId, double interestRateParam, double balanceParam) {
		this.accounttId = accounttId;
		this.interestRate = interestRateParam;
		this.balance = balanceParam;
	}
	@Override
	public String getAcctID() {
		return accounttId;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public double computeUpdatedBalance() {
		double updatedBalance=balance + interestRate * balance;
		return updatedBalance;
	}
}


