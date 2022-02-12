package prob4E;

public class CheckingAccount extends Account {
	private String acctId;
	private double monthlyFee;
	private double balance;
	
	public CheckingAccount(String accountIdParam, double monthlyFeeParam, double startBalanceParam) {
		this.acctId = accountIdParam;
		this.monthlyFee = monthlyFeeParam;
		this.balance = startBalanceParam;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public double computeUpdatedBalance() {
		double updatedBalance=balance - monthlyFee;
		return updatedBalance;
	}
	@Override
	public String getAcctID() {
		return acctId;
	}
}


