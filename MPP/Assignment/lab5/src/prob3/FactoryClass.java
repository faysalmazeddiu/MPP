package prob3;

final public class FactoryClass {
	private FactoryClass() {
	}

	public static ICustomerAndOrder makeCustomerAndOrderFactoryObject(String nameParam) {
		Customer customerObj = new Customer(nameParam);
		ICustomerAndOrder customerAndOrderObj = new CustomerAndOrder(customerObj);
		return customerAndOrderObj;

	}
}
