package prob3.extpackage;

import java.time.LocalDate;

import prob3.*;

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

		
