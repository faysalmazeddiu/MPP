package prob4.extpackage;

import java.time.LocalDate;

import prob4.Customer;
import prob4.Order;
import prob4.*;

public class Main {
	public static void main(String[] args) {
		
		
	
		ICustomerAndOrder customerOBJ = FactoryClass.makeCustomerAndOrderFactoryObject("Bob");
		customerOBJ.makeAnOrder(LocalDate.now(), new String[]{"Shirt", "Laptop"});
		customerOBJ.makeAnOrder(LocalDate.now(), new String[]{"Pants","Knife set"});
		
		for(Order orderObj:customerOBJ.getCustomerInformation().getOrders()) {
			System.out.println(orderObj);
		}
	}
}

		
