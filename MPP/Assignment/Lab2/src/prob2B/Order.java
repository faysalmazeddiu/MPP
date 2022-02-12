package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	ArrayList<OrderLine> listOfOrderLine=new ArrayList<>();
	private OrderLine orderLine;
	public Order(int orderNum,String items) {
		
		this.orderNum=orderNum;
		orderLine=new OrderLine(this,items);
		listOfOrderLine.add(orderLine);
		
	}
	
	
	
	public void getOrderDetails() {
		String str="";
		for(OrderLine orderLine:listOfOrderLine) {
			str+="Item : "+orderLine.getItem()+"\n";
		}
		System.out.println(str);
	}
}
