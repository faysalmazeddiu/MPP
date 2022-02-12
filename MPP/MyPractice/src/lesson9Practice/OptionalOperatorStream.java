package lesson9Practice;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalOperatorStream {
    public static void main(String[] args) {
        //

            Optional<String> opString =Stream.of("Mazed","Sazed").filter(s->s.startsWith("N")).map(s->s).findFirst();
//            if (opString.isPresent()){
//                System.out.println("found");
//            }else{
//                System.out.println("not found");
//            }
        System.out.println(opString.orElse("optional is empty"));

        int sum=Stream.of(2,3,4,5).reduce(0,(x,y)->x+y);
        System.out.println("findout sum of integers using reduce ="+sum);

        // another version reduct
        Optional<Integer> intSum=Stream.of(2,3,4,5).reduce((x,y)->x+y);
        System.out.println(intSum.get());

        // string concatation
        Optional<String> nameStr=Stream.of("Mazed","sazed").reduce((x,y)->x+"==="+y);
        System.out.println(nameStr.get());




    }
}
