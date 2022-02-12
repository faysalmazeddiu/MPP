package prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

final  class CustomerAndOrder implements ICustomerAndOrder {
	private List<Order> orderList = new ArrayList<Order>();
	private Customer customerRef = null;
	

	CustomerAndOrder(Customer customer) {
		this.customerRef = customer;
	}
	
	@Override
	public void makeAnOrder(LocalDate dateParam, String[] itemsParam) {
		Order order = Order.newOrder(customerRef, dateParam);
		for (String item : itemsParam) {
			order.addItem(item);
		}
			
		this.orderList.add(order);
	}

	@Override
	public Customer getCustomerInformation() {
		return customerRef;
	}

	@Override
	public List<Order> getOrderInfo() {
		return orderList;
	}

	

}
