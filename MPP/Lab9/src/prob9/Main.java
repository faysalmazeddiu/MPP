package prob9;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        printSquares(10);
    }

    static Function<Integer, Integer> squares = (num) -> num*num;

    public static void printSquares(int num){
       IntStream numbers = IntStream.iterate(1, n -> n+1)
               .limit(num)
               .map(n->squares.apply(n));
       numbers.forEach(System.out::println);
    }
}
