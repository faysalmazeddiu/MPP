package prob4C;

import java.time.LocalDate;

public class Order {
	
	private int orderNo;
	private LocalDate orderDate;
	private int orderAmount;
	
	public Order(int orderNumber, LocalDate dateOfOrder, int amountOfOrder) {
		this.orderNo = orderNumber;
		this.orderDate = dateOfOrder;
		this.orderAmount = amountOfOrder;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public int getOrderNo() {
		return orderNo;
	}
	
	public void setOrderDate(LocalDate dateOfOrder) {
		this.orderDate = dateOfOrder;
	}


	

}
