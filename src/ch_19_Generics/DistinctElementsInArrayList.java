package ch_19_Generics;

import java.util.ArrayList;

/*19.3 (Distinct elements in ArrayList) Write the following method that returns a new
ArrayList. The new list contains the nonduplicate elements from the original list.
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
*/


public class DistinctElementsInArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(5);
		intList.add(8);
		intList.add(4);
		intList.add(4);
		
		ArrayList<Double> dblList = new ArrayList<>();
		dblList.add(5.8);
		dblList.add(5.8);
		dblList.add(8.0);
		dblList.add(4.5);
		dblList.add(4.6);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("5.8");
		strList.add("5.8");
		strList.add("8.0");
		strList.add("test");
		strList.add("test");
		
		
		ArrayList intDistinct = removeDuplicates(intList);
		ArrayList dblDistinct = removeDuplicates(dblList);
		ArrayList strDistinct = removeDuplicates(strList);
		System.out.println();
		System.out.println(intDistinct);
		System.out.println(dblDistinct);
		System.out.println(strDistinct);
	}
		
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		System.out.println(list);
		ArrayList<E> listDistinct = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if (!listDistinct.contains(list.get(i))){
				listDistinct.add(list.get(i));}
		}
		return listDistinct;
	}
}