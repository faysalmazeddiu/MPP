package prob5;
import java.util.*;

public class AllPairs {
	public static<T extends Comparable<T>> List<Pair<T, T>> allIncreasingPairs(List<T> list) {
		List<Pair<T, T>> returnVal = new ArrayList<>();
		for(T x: list) {
			for(T y: list) {
				if(x.compareTo(y)<0) {
					Pair<T, T> p = new Pair<>(x,y);
					returnVal.add(p);
				}
			}
		}
		return returnVal;
	}
	
	public static<T extends Comparable<? super T>> List<Pair<T, T>> allIncreasingPairs2(List<T> list) {
		List<Pair<T, T>> returnVal = new ArrayList<>();
		for(T x: list) {
			for(T y: list) {
				if(x.compareTo(y)<0) {
					Pair<T, T> p = new Pair<>(x,y);
					returnVal.add(p);
				}
			}
		}
		return returnVal;
	}
	
	
	// using comparator ::: 
	
	public static <T>  List<Pair<T, T>> allIncreasingPairs3(List<T> list, Comparator<? super T> com){
		List<Pair<T, T>> returnVal = new ArrayList<>();
		for(T x: list) {
			for(T y: list) {
				if(com.compare(x, y)<0) {
					Pair<T, T> p = new Pair<>(x,y);
					returnVal.add(p);
				}
			}
		}
		return returnVal;
	}
	
	//should work for string, Employees, LocalDates
}
