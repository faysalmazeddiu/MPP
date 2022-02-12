package prob2B;

public class OrderLine {
	private Order order;
	private String item;
	public OrderLine(Order orderObj,String orderedItem){
		this.item=orderedItem;
		this.order=orderObj;
	}
	
	
	public Order getOrder() {
		return order;
	}

	public String getItem() {
		return item;
	}
	
}
