package prob4a;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimePrint {

	public static void main(String[] args) {
		final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime).limit(20);
		primes.forEach(s->System.out.println(s));
	}

}
