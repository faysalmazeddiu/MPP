package prob4b;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimePrint {

	public static void main(String[] args) {
		PrimePrint pb = new PrimePrint();
		pb.printNPrimes(10);
		System.out.println("====");
		pb.printNPrimes(5);
	}
	
	public void printNPrimes(long n) {
		final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
		primes.limit(n).forEach(s->System.out.println(s));
	}

}
