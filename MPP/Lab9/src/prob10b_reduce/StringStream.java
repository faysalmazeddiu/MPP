package prob10b_reduce;

import java.util.Optional;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        printString();
    }

    public static void printString(){
         Stream.of("Bill", "Thomas", "Mary").forEach(System.out::println);
        // one way
       // System.out.println( Stream.of("Bill", "Thomas", "Mary").reduce((c1,c2)->c1+","+c2).get());
         Optional<String> s=Stream.of("Bill", "Thomas", "Mary").reduce((c1,c2)->c1+","+c2);
         System.out.println(s.get());
         System.out.println( Stream.of("Bill", "Thomas", "Mary").reduce((c1,c2)->c1.concat(","+c2)).get());
    }
}
