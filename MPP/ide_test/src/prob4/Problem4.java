package prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Problem4 {
	//IMPLEMENT - you must use the reduce operation on Streams
	/*
	public static <T> ArrayList<T> combine(Stream<ArrayList<T>> stream) {
		ArrayList<T> tList= stream.reduce(new ArrayList(), (x,y)->{
			x.addAll(y);
			return x;
		});
		return tList;
		//return new ArrayList<T>();	 
	}
	*/
	
	public static <T> ArrayList<T> combine(List<ArrayList<T>> list) {
		ArrayList<T> tList= list.stream().reduce(new ArrayList(), (x,y)->{
			x.addAll(y);
			return x;
		});
		return tList;
		//return new ArrayList<T>();	 
	}
	
	public static void testCombine() {
		ArrayList<ArrayList<String>> mainList = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<String>() {
			{
				add("hello");add("there");
			}
		};
		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("goodbye");add("there");
			}
		};
		mainList.add(list1);
		mainList.add(list2);
		//System.out.println(combine(mainList.stream()));
		System.out.println(combine(mainList));
	}
	public static void main(String[] args) {
		testCombine();
	}
}
