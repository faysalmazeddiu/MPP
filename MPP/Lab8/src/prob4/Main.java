package prob4;

import java.util.Arrays;
import java.util.List;

public class Main implements MyOwnInterface {
	public static void main(String[] args) {
		Main main = new Main();
		// Imperative
		int count1 = main.countWords(Arrays.asList("dunkey", "doll", "circle", "dog", "cab"), 'c', 'd', 2);
		System.out.println(count1);

		
		int secondCount = f1.countWords(Arrays.asList("dunkey", "doll", "circle", "dog", "cab"), 'c', 'd', 3);
		System.out.println(secondCount);
		
		
		int thirdCount = f2.countWords(Arrays.asList("dunkey", "doll", "icc", "dog", "cab"), 'c', 'd', 3);
		System.out.println(thirdCount);

	}
	// imperative solution
	@Override
	public int countWords(List<String> words, char c, char d, int len) {
		int count = 0;
		for (String word : words) {
			if (word.length() == len) {
				if (word.contains("" + c) && !word.contains("" + d))
					count++;
			}
		}
		return count;
	}


	static MyOwnInterface f1 = new MyOwnInterface() {
		@Override
		public int countWords(List<String> words, char c, char d, int len) {
			return (int) words.stream()
					.filter(word -> word.length() == len && word.contains("" + c) && !word.contains("" + d)).count();
		}
	};


	static MyOwnInterface f2 = (words, c, d, len) -> (int) words.stream()
			.filter(word -> word.length() == len && word.contains("" + c) && !word.contains("" + d)).count();

	

}
