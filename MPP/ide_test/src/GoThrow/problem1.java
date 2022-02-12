package GoThrow;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class problem1 {
   //1. // (Integer x, Integer y) -> System.out.println(x + y);
   //2. // (double x, double y,double z) -> (x+y+z);
    // 3. (Integer x, Integer y) -> x*y<x+y;

    public static void main(String[] args) {
        problem1 m=new problem1() ;
        m.evaluator();

    }

    public void evaluator() {
        System.out.println("prob1 :");
        bi.accept(2, 7);
        bi1.accept(2, 7);
        new ConsumerImple().accept(2, 7);

        System.out.println("");
        System.out.println("prob2 :");

        System.out.println(tryFub.apply(2.0,7.0,7.0));
        System.out.println(tryFub1.apply(2.0,7.0,7.0));
        System.out.println(new TryFuctionImplementation().apply(2.0,7.0,7.0));

        System.out.println("");
        System.out.println("prob3 :");

        System.out.println(biPredicate.test(2.0,7.0));
        System.out.println(biPredicate2.test(2.0,7.0));
        System.out.println(new BiPredicateImple().test(2.0,7.0));
    }

    // identify type
    //1
    BiConsumer<Integer,Integer> bi=(x,y)->System.out.println(x + y);

    // reference
    BiConsumer<Integer,Integer> bi1= problem1::heleperMethodFor1;
    public static void heleperMethodFor1(Integer x,Integer y){
        System.out.println(x + y);
    }

    static class ConsumerImple implements BiConsumer<Integer,Integer>{

        @Override
        public void accept(Integer x, Integer y) {
            System.out.println(x + y);
        }
    }

    //2.
    Tryfunction<Double,Double,Double,Double> tryFub=(x,y,z)->x+y+z;
    // reference ::
    Tryfunction<Double,Double,Double,Double> tryFub1= problem1::heleperMethodFor2;
    public static Double heleperMethodFor2(Double x,Double y,Double z){
        return x+y+z;
    }

    static class TryFuctionImplementation implements Tryfunction<Double,Double,Double,Double>{

        @Override
        public Double apply(Double x, Double y, Double z) {
            return x+y+z;
        }
    }

    //3.
    BiPredicate<Double,Double> biPredicate=(x,y)->x*y<x+y;
    BiPredicate<Double,Double> biPredicate2= problem1::heleperMethodFor3;
    public static boolean heleperMethodFor3(Double x,Double y){
        return x*y<x+y;
    }

    static class BiPredicateImple implements BiPredicate<Double,Double>{

        @Override
        public boolean test(Double x, Double y) {
            return x*y<x+y;
        }
    }








}
