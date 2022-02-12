package prob4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prime_B {
    public static void main(String[] args) {
        /*
        List<Integer>  sortedList=primeStream(10).sorted((x,y)->y-x).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        List<Integer>  prime=primeStream(10).filter(n->{
            if(n==1){
                return false;
            }
            for (int i=2;i<n;++i){

                if(n%i==0){
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toList());
        prime.forEach(System.out::println);
        //printSomething();
        */
        PrimeStream primeSr=new PrimeStream();
        primeSr.primeStream(10);
    }

    public static Stream<Integer> primeStream(long n){
        final Stream<Integer> primes=Stream.iterate(1,i->i+1).limit(n);
        return primes;
    }

}

class PrimeStream{
    public  void primeStream(long k){
        final Stream<Integer> primes=Stream.iterate(1,i->i+1).limit(k).filter(n->{
            if(n==1){
                return false;
            }
            for (int i=2;i<n;++i){

                if(n%i==0){
                    return false;
                }
            }
            return true;
        });
         primes.forEach(s->System.out.println(s));
    }
}
