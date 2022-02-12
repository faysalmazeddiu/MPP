package GoThrow;

import GoThrow.helperclasses.CheckoutRecordEntry;
import GoThrow.helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class problem2 {
    public static void main(String[] args) {
        //use this list
        Comparator<String> comparator=(s1,s2)->s1.compareTo(s2);

        List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
        System.out.println(list);


       // main question solution :::
        System.out.println(

        list.stream().filter(c->c.getCheckoutDate().equals(LocalDate.of(2015,6,27)))
                .map(c->c.getCopy().getBook().getTitle())
                //.sorted(Comparator.comparing((String t)->t.length()).thenComparing(s->s)) // one to use thencomaprator bby passing functional interface way
                .sorted(Comparator.comparing((String t)->t.length()).thenComparing(comparator)) // anther way to use thencomaprator by passing comparator
                .collect(Collectors.toList())

        );




        /*
        reversed() order ::
        System.out.println(

                list.stream().filter(c->c.getCheckoutDate().equals(LocalDate.of(2015,6,27)))
                        .map(c->c.getCopy().getBook().getTitle())
                        .sorted(Comparator.comparing((String s)->s)
                                .thenComparing((String s)->s.length()).reversed()) // reversed order
                        .collect(Collectors.toList())

        );

         */

    }
}
