
package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		
		int values[] = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();
		for (Integer integer : values) {
			list.add(integer);		
		}
		Collections.sort(list); //2 3 4 6 7 11
		System.out.println("The Second largest number in the given array is: " +list.get(list.size()-2));
	
		
	}
}
