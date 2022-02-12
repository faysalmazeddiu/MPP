package prob3;

import java.time.LocalDate;
import java.util.List;

public interface ICustomerAndOrder {
	public Customer getCustomerInformation();

	public List<Order> getOrderInfo();

	public void makeAnOrder(LocalDate date, String[] items);

}
