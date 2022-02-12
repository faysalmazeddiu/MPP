package lesson10_practice;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LibraryComapnion {
    // lamda_library ::
    /*

    static Function<List<Customer>,List<String>> Lamda_Library=(cus)->cus.stream()
            .filter(c->c.getCity().equals("Fairfield"))
            //.map(c->c.getName())
            .sorted(Comparator.comparing(Customer::getName))
            .map(s->s.getName())
            .collect(Collectors.toList());

     */


    static Comparator<String> customerComparator=(s1,s2)->{
        if (s1.compareTo(s2)>0) return 1;
        else if(s1.compareTo(s2)<0) return -1;
        return 0;
    };
    static int customerCompairing( String s1,String s2){
        return customerComparator.compare(s1,s2);
    }

    static boolean getSpecificCustomerByCity(Customer cus){
        if (cus.getCity().equals("Fairfield")) return true;
        else return false;
    }

    static String separateNameFromeCustomer(Customer cus){
        return cus.getName();
    }


}
