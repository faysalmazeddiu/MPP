package prob4C;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee{

	private double commission;
	private double baseSalary;
	private List<Order> listOfOrderers;

	public Commissioned(String employeeId, double salary, double comm, List<Order> orderList) {
		super(employeeId);
		this.baseSalary = salary;
		this.commission = comm;
		this.listOfOrderers = orderList;
		
	}

	public void addNewOrder(int orderNumber, LocalDate dateOfOrder, int amountOfOrder) {
		Order neworder=new Order(orderNumber, dateOfOrder, amountOfOrder) ;
		listOfOrderers.add(neworder);
	}

	@Override
	double calcGrossPay(int month, int year) {

		double totalcommissions = 0;
		for (Order val : listOfOrderers) {
			if (month == 1 && val.getOrderDate().getYear() + 1 == year && val.getOrderDate().getMonthValue() == 12) {
				totalcommissions += val.getOrderAmount();
				
			} else if (val.getOrderDate().getYear() == year && (val.getOrderDate().getMonthValue() + 1) == month) {
				totalcommissions += val.getOrderAmount();
			}

		}
		double grossPayment=this.baseSalary + this.commission * totalcommissions;
		return grossPayment;
	}
}
