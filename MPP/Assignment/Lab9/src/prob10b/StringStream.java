package prob10b;

import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        printString();
    }

    public static void printString(){
         Stream.of("Bill", "Thomas", "Mary").forEach(System.out::println);
    }
}
