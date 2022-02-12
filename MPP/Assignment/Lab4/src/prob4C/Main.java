package prob4C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import prob4C.Admin;
//import prob4C.Commissioned;
//import prob4C.Employee;
//import prob4C.Hourly;
//import prob4C.Order;
//import prob4C.Salaried;


/** This class tests the code package */
public class Main {
    // Uncomment when you are ready to test your code
	public static void main(String[] args) {
		List<Order> listOfOrder = new ArrayList<>();
		Order order1=new Order(501, LocalDate.of(2021, 01, 05), 300);
		Order order2=new Order(402, LocalDate.of(2020, 6, 9), 400);
		listOfOrder.add(order1);
		listOfOrder.add(order2);
		Commissioned comissonEmployee = new Commissioned("1001", 600, 0.8, listOfOrder);
		Salaried salariedEmployee=new Salaried("5001", 1500);
		Hourly hourlyEmployee=new Hourly("6001", 100, 40);
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(salariedEmployee);
		employeeList.add(hourlyEmployee);
		employeeList.add(comissonEmployee);
		
		System.out.println(Admin.computeUpdatedBalanceSum(employeeList));
		
	}
     
}
