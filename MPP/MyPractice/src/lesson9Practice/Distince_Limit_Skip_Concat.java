package lesson9Practice;


import java.util.stream.Stream;

public class Distince_Limit_Skip_Concat {
	public static void main(String[] args) {
		
		// Distinct
		Stream<String> stringStream=Stream.of("Java","C#","C","C++","JAVA","KOTLIN","KOTLIN","C++").distinct();
		stringStream.forEach(System.out::println);
		
		System.out.println("\n");
		
		// LIMIT
		Stream<String> stringStream2=Stream.of("Java","C#","C","C++","JAVA","KOTLIN","KOTLIN","C++").limit(4);
		stringStream2.forEach(System.out::println);
		
		System.out.println("\n");
		
		// SKIP
		Stream<String> stringStream3=Stream.of("Java","C#","C","C++","JAVA","KOTLIN","KOTLIN","C++").skip(4);
		stringStream3.forEach(System.out::println);
		
		System.out.println("\n Stream Concate :: \n");
		// CONCATE
		Stream<String> stringStream4=Stream.of("Java","C#","C");
		Stream<String> stringStream5=Stream.of("KOTLIN","PYTHON","RYBY");
		//stringStream4.
		Stream.concat(stringStream4, stringStream5).forEach(s->System.out.println(s));
		
		System.out.println("\n Stream.iterate() :: \n");
		// Stream.iterate()
		
		Stream.iterate(1, n->n+1).limit(10)
								.filter(i->i%2==0)
								.map(i->i)
								.forEach(System.out::println);
		
		
		//Stream.iterate(1,n->n+1).limit(4);
		
		
		
		
	}
}
