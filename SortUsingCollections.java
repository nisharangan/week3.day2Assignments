package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	
	//Sorted and reversed string using List and Collections
	
	public static void main(String[] args) {
		String[] str = {"AspireSystems", "Wipro", "HCL", "CTS"};
		List<String> listStr = new ArrayList<String>(Arrays.asList(str));
	    Collections.sort(listStr);
		Collections.reverse(listStr);
		System.out.println(listStr);
	}
}
