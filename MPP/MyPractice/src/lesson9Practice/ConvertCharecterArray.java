package lesson9Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class ConvertCharecterArray {
	public static void main(String[] args) {
		
		
		
		List<String> list=Arrays.asList("Mazed","Tom");
		List<String> list2=Arrays.asList("Jon","Hiron");
		List<List<String>> totalList=new ArrayList<>();
		totalList.add(list);
		totalList.add(list2);
		//System.out.println(totalList);
		String[] str=totalList.stream().flatMap(l->l.stream())
				
				.map(s->charecterList(s))
				.flatMap(s->s.stream()).toArray(String[]::new);
		
		for(String s:str) {
			System.out.print(s+",");
		}
		
	}

	private static List<String> charecterList(String s) {
		ArrayList<String> cList=new ArrayList<>(); 
		char[] characters=s.toCharArray();
		for(int i=0;i<characters.length;++i) {
			cList.add((String.valueOf(characters[i])));
		}
		return cList;
	}
	
	
	
	

}
