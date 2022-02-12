package prob4;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        Stream<Integer> dta=Stream.iterate(1,n->n+1).limit(20).filter(n->{
            if(n==1){
                return false;
            }
            for(int i=2;i<n;++i){

                if(n%i==0){
                    return false;
                }

            }
            return true;
        });
        dta.forEach(s->System.out.println(s));
        System.out.println("\n");
        //Stream<BigInteger> dta2=Stream.iterate(BigInteger.TWO,BigInteger::nextProbablePrime).limit(20);
        //dta2.forEach(System.out::println);

    }
}
